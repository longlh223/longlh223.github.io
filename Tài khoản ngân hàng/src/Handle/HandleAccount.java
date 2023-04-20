package Handle;

import Entity.Account;

import java.util.Scanner;

public class HandleAccount {
    public Account inputAccount(Scanner scanner){
        System.out.println("Nhập tên");
        String name= scanner.nextLine();
        System.out.println("Nhập số tài khoản");
        int accountNumber= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email= scanner.nextLine();
        System.out.println("Nhập số dư tài khoản");
        double accountBalance= Double.parseDouble(scanner.nextLine());
        return new Account(name,accountNumber,email,accountBalance);
    }
}
