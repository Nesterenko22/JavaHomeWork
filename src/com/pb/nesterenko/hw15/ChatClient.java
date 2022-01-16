package com.pb.nesterenko.hw15;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.Object;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception {

        final Socket s=new Socket("127.0.0.1",8888);
        JFrame f=new JFrame("Client");
        f.setSize(400,500);
        f.setLocation(200,200);
        f.setLayout(null);
        JTextArea jta=new JTextArea();
        jta.setBounds(100,10,300,400);

        JTextField tf=new JTextField("");
        tf.setBounds(0,200,100,30);
        JButton send=new JButton("send");
        send.setBounds(10,230,80,30);
        f.add(tf);
        f.add(send);
        f.add(jta);

        new Thread(){
            public void run(){
                try {
                    InputStream is=s.getInputStream();
                    DataInputStream dis=new DataInputStream(is);
                    while (true) {
                        String msg=dis.readUTF();
                        jta.append(msg+"=\r\n");
                    }
                    }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } .start();
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=tf.getText();
                jta.append(str+"\r\n");
                try {
                    OutputStream os=s.getOutputStream();
                     DataOutputStream dos=new DataOutputStream(os);
                     dos.writeUTF(str);
                     tf.setText(null);
                }

                catch (IOException ex){
                    ex.printStackTrace();
                     }


                }
            });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        }


    }

