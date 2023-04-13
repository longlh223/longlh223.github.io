package entity;

import java.util.ArrayList;

public class Classroom {
    private String name;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Classroom(String name, ArrayList<Student> students, Teacher teacher) {
        this.name = name;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
