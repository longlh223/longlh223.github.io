import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVienIT sinhVienIT = new SinhVienIT();
        System.out.println("Nhập tên: ");
        sinhVienIT.setName(sc.nextLine());
        System.out.println(" Nhập ngành:");
        sinhVienIT.setMajor(sc.nextLine());
        System.out.println("Điểm java:");
        sinhVienIT.setJava(Double.parseDouble(sc.nextLine()));
        System.out.println("Điểm html");
        sinhVienIT.setHtml(Double.parseDouble(sc.nextLine()));
        System.out.println("Điểm css:");
        sinhVienIT.setCss(Double.parseDouble(sc.nextLine()));

        SinhVienBiz sinhVienBiz = new SinhVienBiz();
        System.out.println("Tên:");
        sinhVienBiz.setName(sc.nextLine());
        System.out.println("Ngành:");
        sinhVienBiz.setMajor(sc.nextLine());
        System.out.println("Điểm MKT:");
        sinhVienBiz.setMarketing(Double.parseDouble(sc.nextLine()));
        System.out.println("Điểm sales");
        sinhVienBiz.setSales(Double.parseDouble(sc.nextLine()));

        System.out.println("Infor: ");
        sinhVienIT.xuat();
        sinhVienBiz.xuat();
    }
}
