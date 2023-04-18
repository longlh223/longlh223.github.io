package Handle;

import Entity.Account;
import Entity.ListAccount;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CreatAccount {
    public Account inputAccount(Scanner scanner,ListAccount listAccount) {

        System.out.println("Mời nhập thông tin tài khoản muốn tạo:");

        //Tạo Username
        System.out.println("Nhập tên đăng nhập:");
        String username = "";
        while (true) {
            System.out.println("Có từ 3 - 5 kí tự Bao gồm các kí tự thường a -> z và các chữ số 0 - 9.");
            username= scanner.nextLine();
            String regexPattern = "^[a-z0-9._-]{3,15}$";
            if (Pattern.compile(regexPattern).matcher(username).matches()) {
                if (Check.checkUsername(username)==false){
                break;
                }
                else System.out.println("Tài khoản đã tồn tại, mời bạn nhập tài khoản khác");
            }
            else System.out.println("Tài khoản không hợp lệ, mời bạn nhập lại");
        }

        //Tạo email
        String email = "";
        while (true) {
            System.out.println("Nhập email:");
            System.out.println("VD: luonghoanglong223@gmail.com");
            email = scanner.nextLine();

            String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            if (Pattern.compile(regexPattern).matcher(email).matches()) {
                break;
            } else System.out.println("Email không hợp lệ, mời bạn nhập lại");
        }

        //Tạo password
        String password = "";
        while (true) {
            System.out.println("Nhập mật khẩu:");
            System.out.println("Mật khẩu phải chứa ít nhất một ký tự chữ thường, một ký tự viết hoa, một chữ số, một ký tự đặc biệt và độ dài từ 8 đến 20.");
            password = scanner.nextLine();

            String regexPattern = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
            if (Pattern.compile(regexPattern).matcher(password).matches()) {
                break;
            } else System.out.println("Password không hợp lệ, mời bạn nhập lại");
        }

        Account account = new Account(username, email, password);
        ArrayList<Account> accounts= new ArrayList<>();
//        ListAccount listAccount = new ListAccount();
        listAccount.listAccount().add(account);
        System.out.println(listAccount);
        return account;
    }


}
