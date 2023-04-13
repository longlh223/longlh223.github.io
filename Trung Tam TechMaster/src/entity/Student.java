package entity;

public class Student extends Person{
    private int id;
    private static int autoId;
    private String hocLuc;

    public Student(String name, int age,int id, String hocLuc) {
        super(name, age);
        this.id = ++autoId;
        this.hocLuc = hocLuc;
    }

    public Student(String name, int age, String hocLuc) {
        super(name, age);
        this.id = ++autoId;
        this.hocLuc = hocLuc;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", hocLuc='" + hocLuc + '\'' +
                '}';
    }
}
