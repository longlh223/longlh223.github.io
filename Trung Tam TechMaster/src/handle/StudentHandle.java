package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student inputstudent(Scanner scanner){
        System.out.println("Moi ban nhap ten hoc sinh:");
        String name= scanner.nextLine();
        System.out.println("Moi ban nhap tuoi hoc sinh:");
        int age= Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap hoc luc hoc sinh:");
        String hocLuc= scanner.nextLine();
        return new Student(name,age,hocLuc);
    }
}
