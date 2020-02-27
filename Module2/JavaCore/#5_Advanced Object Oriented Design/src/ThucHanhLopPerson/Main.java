package ThucHanhLopPerson;

public class Main {
    public static void main(String[] args) {
        Person student = new Student();
        System.out.println(student.move());
        Person employer = new Employer();
        System.out.println(employer.move());
    }
}
