package Handle;

import Entity.ListAccount;

import java.util.Scanner;

public class HandleLogin {



    public static boolean loginAcc(ListAccount listAccount) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        if ( Check.checkAccount(username, password, listAccount)) {
            System.out.println("Chào mừng "+ username+" bạn có thể thực hiện các công việc sau:");
            return true;
        }
        return false;

    }
}
