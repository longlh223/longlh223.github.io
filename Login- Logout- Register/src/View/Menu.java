package View;

import Entity.ListAccount;
import Handle.Check;
import Handle.CreatAccount;
import Handle.HandleLogin;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        ListAccount listAccount = new ListAccount();

        while(true) {
            System.out.println("1. Đăng nhập.");
            System.out.println("2. Đăng ký.");
            System.out.print("Mời bạn chọn: ");

            int choise ;
            Scanner scanner = new Scanner(System.in);
            choise = Integer.parseInt(scanner.nextLine());

            if(Check.checkInputIntLimit(choise,1, 4)){
                switch (choise) {

                    //Đăng nhập thành công sẽ hiện thị Login Menu
                    case 1: {
                        System.out.println("Mời bạn nhập thông tin");
                        if (HandleLogin.loginAcc(listAccount)){
                            LoginScreen.loginmenu(listAccount);
                        }
                        else ForgotPasswordScreen.wrongInformation(listAccount);
                        break;
                    }
                    //Tạo tài khoản
                    case 2: {
                        CreatAccount creatAccount= new CreatAccount();
                        creatAccount.inputAccount(scanner,listAccount);
                        break;
                    }
                }
            }
        }
    }
}
