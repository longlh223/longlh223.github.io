package handle;

import entity.Student;
import entity.Teacher;

import java.util.Scanner;

public class TeacherHandle {
    public Teacher inputTeacher(Scanner scanner){
        System.out.println("Moi ban nhap ten giang vien:");
        String name= scanner.nextLine();
        System.out.println("Moi ban nhap tuoi hgiang vien:");
        int age= Integer.parseInt(scanner.nextLine());
        return new Teacher(name,age);
    }
}
