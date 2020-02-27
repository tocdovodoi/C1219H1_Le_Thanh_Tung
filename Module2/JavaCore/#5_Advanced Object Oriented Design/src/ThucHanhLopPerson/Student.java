package ThucHanhLopPerson;

public class Student extends Person {
    private String grade;

    public Student() {
    }

    public Student(String name, String address, String grade) {
        super(name, address);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String move() {
        return "Đi bằng xe đạp";
    }
}
