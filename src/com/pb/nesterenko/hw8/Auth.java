package com.pb.nesterenko.hw8;

import com.pb.nesterenko.hw7.Clothes;
import com.pb.nesterenko.hw7.Skirt;

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

    public void SingIn(password) {

        System.out.println("Введіть ваш пароль");


        public void singIn (String password) throws WrongPasswordException {
            if (password != password) {
                password = password;
            } else {
                String needs = password;
                throw new WrongPasswordException(needs);
            }
        }

        public int login () {
            return login;
        }

        public String password () {
            return password;
        }
    }
}

    public void SingUp(login,password,confirmPassword) {

        System.out.println("Введіть ваш логын");
        }


        public void singUp(int login) throws WrongLoginException {
            if(login != login) {
                login = login;
            } else {
                String needs = login;
                throw new WrongPasswordException.(needs);
            }
        }



