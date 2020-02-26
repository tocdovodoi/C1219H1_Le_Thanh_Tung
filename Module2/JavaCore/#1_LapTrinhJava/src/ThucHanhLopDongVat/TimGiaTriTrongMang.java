package ThucHanhLopDongVat;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya","Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String input_name = input.nextLine(); //So sánh chuỗi trong java không được dùng ==, hải dùng equals
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Name student: " + input_name + "in the list, index = " + (i + 1));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Not found!");
        }
    }
}
