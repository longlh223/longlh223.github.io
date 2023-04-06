public class SinhVienIT extends SinhVienTechMaster {
    private double java, html, css;

    public void setJava(double java) {
        this.java = java;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public void setCss(double css) {
        this.css = css;
    }


    @Override
    public double getDiem() {
        return ((2*java + html + css)/4);
    }

    @Override
    public void xuat() {
        System.out.println("Tên Sv: "+getName());
        System.out.println("Ngành: "+getMajor());
        System.out.println("Điểm trung bình: "+getDiem());
        System.out.println("Xếp loại học lực: "+getHocLuc());
    }
}
