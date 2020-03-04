package View;

import Commons.FuncFileCSV;
import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> listStudent = new ArrayList<Student>();
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("Please choose" +
                "\n1. Add New Student " +
                "\n2. Show Information Student+" +
                "\n3. Exit");
        Scanner input = new Scanner(System.in);
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                addNewStudent();
                break;
            case "2":
                showInfomationStudent();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again! Enter to continue...");
                input.nextLine();
                displayMainMenu();
        }

    }

    private static void addNewStudent() {
        listStudent = FuncFileCSV.getFileCSVToListStudent();
        Scanner input = new Scanner(System.in);
//        ArrayList<Student> listStudent = new ArrayList<Student>();
        Student student = new Student();
        System.out.print("Enter name student: ");
        student.setName(input.nextLine());
        System.out.print("Enter grade student: ");
        student.setGrade(input.nextLine());
        System.out.print("Enter address student: ");
        student.setAddress(input.nextLine());
        listStudent.add(student);
        FuncFileCSV.writeStudentToFileCSV(listStudent);
        System.out.println("Add new student conplete! Enter to continue...");
        input.nextLine();
        displayMainMenu();
    }

    private static void showInfomationStudent() {
//        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent = FuncFileCSV.getFileCSVToListStudent();
        for (Student student : listStudent) {
            System.out.println("------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Address: " + student.getAddress());
            System.out.println("------------------------------");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to continue...");
        input.nextLine();
        displayMainMenu();
    }

}
