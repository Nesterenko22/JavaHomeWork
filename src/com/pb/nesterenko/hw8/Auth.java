package com.pb.nesterenko.hw8;

import com.pb.nesterenko.hw7.Clothes;
import com.pb.nesterenko.hw7.Skirt;

import java.util.regex.Pattern;

public class Auth {

    public int login;
    public String password;
   public String confirmPassword;

    public Auth(int login) {
        this.login = login;
    }

    public Auth(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

      }}

    public void SingUp(login,password,confirmPassword) {

        System.out.println("Введіть ваш логын");
        }


        public void singUp(int login) throws WrongLoginException {
            if(Pattern.matches([a-zA-Z_0-9] {5,20}login)) {
        } else {
        throw new WrongLoginException();
        }

            }
public void SingIn(password) throws WrongPasswordException {

        System.out.println("Введіть ваш пароль");


public void singIn (String password) throws WrongPasswordException {
        if (Pattern.matches('[a-zA-Z_0-9] {5}'password)) {
        password = password;
        } else {
        throw new WrongPasswordException();
        }
        }

public int login () {
        return login;
        }

public String password () {
        return password;
        }
        }



