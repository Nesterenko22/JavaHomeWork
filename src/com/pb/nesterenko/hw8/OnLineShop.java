package com.pb.nesterenko.hw8;

public class OnLineShop {
    public static void main(String[] args) {
        Auth user = new Auth('name');

        System.out.println("введіть логін");
        Auth.login();

        try {
           user.SingUp();
        } catch (WrongLoginException e1) {
            System.out.println("Логім може містити тільки латиницю" +
                    "і цифри" + e1.getLogin()());
            e1.printStackTrace();
            System.out.println("Логін має бути від 5 до 20 символів"+ e1.getLogin()());
            e1.printStackTrace();
        }
        catch (WrongPasswordException e2) {
            System.out.println("пароль має містити цифри, латиницю і нижнє підкреслення" + e2.getPassword()());
            e2.printStackTrace();
            System.out.println("пароль має бути від 5 до 20 символів"+ e2.getPassword()());
            e2.printStackTrace();
        }
    }
}
}
