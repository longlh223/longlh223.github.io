package Handle;

import Entity.Account;
import Entity.ListAccount;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ForgotPassword {
    public static void forgotPassword(ListAccount listAccount) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();

        if ( Check.checkForgotPass(username, email, listAccount) != -1) {
            System.out.println("Mời bạn nhập mật khẩu mới");
            String password= "";
            while (true) {
                System.out.println("Mật khẩu phải chứa ít nhất một ký tự chữ thường, một ký tự viết hoa, một chữ số, một ký tự đặc biệt và độ dài từ 8 đến 20.");
                password = scanner.nextLine();

                String regexPattern = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
                if (Pattern.compile(regexPattern).matcher(password).matches()) {
                    System.out.println("Đổi mật khẩu thành công");
                    break;
                } else System.out.println("Password không hợp lệ, mời bạn nhập lại");
            }
            Account account= new Account(username,email,password);
            listAccount.listAccount().set(Check.checkForgotPass(username,email,listAccount),account);
        }
        else System.out.println("Thông tin không đúng");
    }
}