package BaiTap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vui lòng nhập tên của bạn: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
