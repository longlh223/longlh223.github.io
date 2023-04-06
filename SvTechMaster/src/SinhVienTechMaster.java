public abstract class SinhVienTechMaster {
    private String name, major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        if (getDiem() < 5) return "Yếu";
        if (5 <= getDiem() && getDiem() < 6.5) return "TB";
        if (6.5 <= getDiem() && getDiem() < 7.5) return "Kha";
        return "Gioi";
    }

    public void xuat(){
        System.out.println("Tên Sv: ");
        System.out.println("Ngành: ");
        System.out.println("Điểm trung bình: ");
        System.out.println("Xếp loại học lực: ");
    };

}
