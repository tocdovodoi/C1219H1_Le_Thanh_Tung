package ThucHanhLopPerson;

public class Employer extends Person {
    private String salary;

    public Employer() {
    }

    public Employer(String name, String address, String salary) {
        super(name, address);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String move() {
        return "Đi bằng xe máy";
    }
}
