package View;

import Entity.ListAccount;
import Handle.Check;
import Handle.ForgotPassword;
import Handle.HandleLogin;

import java.util.Scanner;

public class ForgotPasswordScreen {
    public static void wrongInformation(ListAccount listAccount) {
        while (true) {
            System.out.println("1. Đăng nhập lại.");
            System.out.println("2. Quên mật khẩu.");;
            int choise;
            Scanner scanner = new Scanner(System.in);
            choise = Integer.parseInt(scanner.nextLine());
            if(Check.checkInputIntLimit(choise,1, 2)){
                switch (choise) {
                    case 1: {
                        System.out.println("Mời nhập thông tin của bạn");
                        if (HandleLogin.loginAcc(listAccount)){
                            LoginScreen.loginmenu(listAccount);
                        }
                        break;
                    }
                    case 2: {
                        ForgotPassword.forgotPassword(listAccount);
                        break;
                    }
                }
            }
        }
    }
}
