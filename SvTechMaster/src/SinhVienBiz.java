public class SinhVienBiz extends SinhVienTechMaster {
    private double marketting, sales;

    public void setMarketing(double marketting) {
        this.marketting = marketting;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return ((2*marketting + sales)/3);
    }

    @Override
    public void xuat() {
        System.out.println("Tên Sv: "+getName());
        System.out.println("Ngành: "+getMajor());
        System.out.println("Điểm trung bình: "+getDiem());
        System.out.println("Xếp loại học lực: "+getHocLuc());
    }
}
