package View;

import Entity.Account;
import Entity.ListAccount;
import Handle.ChangeInformation;
import Handle.Check;
import Handle.ForgotPassword;

import java.util.Scanner;

public class LoginScreen {
//
//
//
//     (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
//
    public static void loginmenu(ListAccount listAccount){
        while (true){
            System.out.println("1. Thay đổi username.");
            System.out.println("2. Thay đổi email.");
            System.out.println("3. Thay đổi mật khẩu.");
            System.out.println("4. Đăng xuất.");
            System.out.println("5. Thoát chương trình.");
            int choise;
            Scanner scanner = new Scanner(System.in);
            choise = Integer.parseInt(scanner.nextLine());
            if(Check.checkInputIntLimit(choise,1, 5)){
                ChangeInformation changeInformation = new ChangeInformation();
                switch (choise){
                    case 1:{
                        System.out.println("Bạn muốn thay đổi username:");

                        changeInformation.changeUsername(listAccount);
                        break;
                    }
                    case 2:{
                        System.out.println("Bạn muốn thay đổi email:");
                        changeInformation.changeEmail(listAccount);
                        break;
                    }
                    case 3:{
                        System.out.println("Bạn muốn thay đổi password");
                        ForgotPassword.forgotPassword(listAccount);
                        break;
                    }
                    case 4:{
                        Menu.menu();
                        break;
                    }
                    case 5:{
                        System.exit(0);
                        break;
                    }
                }
            }

        }
    }
}
