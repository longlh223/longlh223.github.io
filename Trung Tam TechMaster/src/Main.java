import entity.Classroom;
import entity.Student;
import entity.Teacher;
import handle.StudentHandle;
import handle.TeacherHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //Nhap ten lop hoc
        System.out.println("Moi ban nhap ten lop hoc:");
        String name= scanner.nextLine();

        //Nhap mang hoc sinh
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Moi ban nhap so luong hoc sinh trong lop hoc:");
        int classSize= Integer.parseInt(scanner.nextLine());
        StudentHandle studentHandle= new StudentHandle();
        for (int i = 0; i < classSize; i++) {
            Student student= studentHandle.inputstudent(scanner);
            students.add(student);
        }

        //Nhap giao vien
        TeacherHandle teacherHandle= new TeacherHandle();
        Teacher teacher= teacherHandle.inputTeacher(scanner);
        Classroom classroom= new Classroom(name, students, teacher);


//        System.out.println(classroom);


        while(true) {
            System.out.println("Moi ban chon yeu cau");
            System.out.println("1.Xem thong tin lop hoc");
            System.out.println("2.Them hoc vien");
            System.out.println("3.Xoa hoc vien");
            System.out.println("4.Sua hoc luc cua hoc vien");
            System.out.println("5.THOÁT CHƯƠNG TRÌNH");

            int c;
            Scanner scan = new Scanner(System.in);
            System.out.print("NHẬP LỰA CHỌN CỦA BẠN: ");
            c = scan.nextInt();
            switch (c) {
                case 1: {
                    System.out.println(classroom);
                    break;
                }
                case 2: {
                    students.add(studentHandle.inputstudent(scanner));
                    break;
                }
                case 3:{
                    System.out.println("Ban muon xoa hoc vien thu may?");
                    int n=Integer.parseInt(scanner.nextLine());
                    students.remove((n-1));
                    break;
                }
                case 4: {
                    System.out.println("Chon id hoc sinh muon sua hoc luc:");
                    int a= Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap hoc luc muon cap nhat:");
                    String h = scanner.nextLine();
                    students.get(a-1).setHocLuc(h);
                    break;
                }
            }
        }
    }
}
