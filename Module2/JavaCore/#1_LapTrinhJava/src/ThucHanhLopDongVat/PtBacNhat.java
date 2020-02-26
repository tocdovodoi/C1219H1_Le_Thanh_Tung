package ThucHanhLopDongVat;

import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất ax+b=0");
        System.out.print("Nhập a: ");
        float a = input.nextFloat();
        System.out.print("Nhập b: ");
        float b = input.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm!");
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b / a));
        }
    }
}
