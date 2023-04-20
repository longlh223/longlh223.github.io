import Entity.Account;
import Handle.HandleAccount;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        HandleAccount handleAccount= new HandleAccount();
        Account account= handleAccount.inputAccount(scanner);

        while(true){
            System.out.println("Mời bạn lựa chọn 1-3");
            int c= Integer.parseInt(scanner.nextLine());
            switch (c){
                //nạp thêm vào tài khoản
                case 1:
                    System.out.println("Mời bạn nhập số tiền muốn nạp:");
                    double amount= Double.parseDouble(scanner.nextLine());
                    account.recharge(amount);
                    //đổi email
                case 2:
                    System.out.println("Mời bạn nhập email mới:");
                    String email= scanner.nextLine();
                    account.changeEmail(email);
                    //hiển thị thông tin tài khoản
                case 3:
                    System.out.println("Thông tin tài khoản là:");
                    account.displayInfo();
            }
        }
    }
}
