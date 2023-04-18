package Handle;

import Entity.Account;
import Entity.ListAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public final static Scanner sc=new Scanner(System.in);

    //Check input người dùng nhập, nếu sai yêu cầu nhập lại
    public static boolean checkInputIntLimit(int choise, int min, int max) {
        while ( true){
            if (choise >= min && choise <= max){
                return true;
            }
            else {
            System.out.println("Please enter a value between " +min+ " and " +max);
            return false;
            }
        }
    }


    //Kiểm tra tên đăng nhập tránh trùng lặp khi user đăng ký tài khoản
    public static boolean checkUsername(String username) {
        ListAccount listAccount = new ListAccount();
        if (username.isEmpty()) {
            System.out.println("Bạn chưa nhập tài khoản username");
            return false;
        }
        else {
            for (Account account : listAccount.listAccount()) {
                if (listAccount.listAccount().contains(username)) {
                    System.out.println("Tài khoản đã tồn tại");
                    return true;
                }
            }
        }
        return false;
    }

    //Kiểm tài khoản người dùng nhập
    public static boolean checkAccount(String username, String password, ListAccount listAccount) {
        //Kiểm tra người nhập có nhập dữ liệu không
        if (username.isEmpty()||password.isEmpty()) {
            return false;
        } else {
            for (Account account : listAccount.listAccount()){
                //True thì login thành công
                if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int checkForgotPass(String username, String email,ListAccount listAccount) {

        //Kiểm tra người nhập có nhập dữ liệu không
        if (username.isEmpty()||email.isEmpty()) {

            return -1;
        } else {
            for (Account account : listAccount.listAccount()){
                //Nếu đúng thì trả về index của account
                if (account.getUsername().equals(username) && account.getEmail().equals(email)) {
                    return listAccount.listAccount().indexOf(account);
                }
            }
            return -1;
        }
    }

    public static int checkToChange(String username, String password,ListAccount listAccount) {

        //Kiểm tra người nhập có nhập dữ liệu không
        if (username.isEmpty() || password.isEmpty()) {

            return -1;
        } else {
            for (Account account : listAccount.listAccount()) {
                //Nếu đúng thì trả về index của account
                if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                    return listAccount.listAccount().indexOf(account);
                }
            }
            return -1;
        }
    }

    //Check username trùng lặp, nếu trùng return index username đó
    public static int checkUsername(String username, ListAccount listAccount) {
        if (username.isEmpty()) {
            return -2;
        } else {
            for (Account account : listAccount.listAccount()) {
                //Nếu đúng thì trả về index của account
                if (account.getUsername().equals(username)) {
                    return listAccount.listAccount().indexOf(account);
                }
            }
            return -1;
        }
    }

    //Check email trùng lặp, nếu trùng return index email đó
    public static int checkEmail(String email, ListAccount listAccount) {
        if (email.isEmpty()) {
            return -2;
        } else {
            for (Account account : listAccount.listAccount()) {
                //Nếu đúng thì trả về index của account
                if (account.getEmail().equals(email)) {
                    return listAccount.listAccount().indexOf(account);
                }
            }
            return -1;
        }
    }

}



