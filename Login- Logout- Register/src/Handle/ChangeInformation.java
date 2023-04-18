package Handle;

import Entity.Account;
import Entity.ListAccount;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChangeInformation {
    public Scanner scanner= new Scanner(System.in);
    public void changeUsername( ListAccount listAccount){

        System.out.println("Mời bạn nhập lại tài khoản");
        String username = scanner.nextLine();
        System.out.println("Mời bạn nhập lại mật khẩu");
        String password = scanner.nextLine();
        System.out.println("Mời bạn nhập lại email");
        String email= scanner.nextLine();
        if(Check.checkToChange(username,password, listAccount)!=-1){
            System.out.println("Mời bạn nhập tên tài khoản mới");
            while (true) {
                System.out.println("Có từ 3 - 5 kí tự Bao gồm các kí tự thường a -> z và các chữ số 0 - 9.");
                String newUsername = scanner.nextLine();
                String regexPattern = "^[a-z0-9._-]{3,15}$";
                if (Pattern.compile(regexPattern).matcher(newUsername).matches()) {
                    if (Check.checkUsername(newUsername, listAccount) == -1) {
                        Account account = new Account(newUsername, email, password);
                        listAccount.listAccount().set(Check.checkUsername(username, listAccount), account);
                        break;
                    } else System.out.println("Username rỗng hoặc đã tồn tại");
                }
                else System.out.println("Username không hợp lệ, mời bạn nhập lại");
            }
        }
        else System.out.println("Bạn nhập sai thông tin tài khoản");

        System.out.println("Đổi Username thành công!");
    }



    public void changeEmail( ListAccount listAccount){

        System.out.println("Mời bạn nhập lại tài khoản");
        String username = scanner.nextLine();
        System.out.println("Mời bạn nhập lại mật khẩu");
        String password = scanner.nextLine();
        System.out.println("Mời bạn nhập lại email");
        String email= scanner.nextLine();
        if(Check.checkToChange(username,password, listAccount)!=-1){
            System.out.println("Mời bạn nhập email mới");
            while (true) {
                System.out.println("VD: luonghoanglong223@gmail.com");
                String newEmail = scanner.nextLine();
                String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                if (Pattern.compile(regexPattern).matcher(newEmail).matches()) {
                    if (Check.checkEmail(newEmail, listAccount) == -1) {
                        Account account = new Account(username, newEmail, password);
                        listAccount.listAccount().set(Check.checkEmail(email, listAccount), account);
                        break;
                    } else System.out.println("Email rỗng hoặc đã tồn tại");
                }
                else System.out.println("Email không hợp lệ, mời bạn nhập lại");
            }
        }
        else System.out.println("Bạn nhập sai thông tin tài khoản");

        System.out.println("Đổi Email thành công!");
    }

}
