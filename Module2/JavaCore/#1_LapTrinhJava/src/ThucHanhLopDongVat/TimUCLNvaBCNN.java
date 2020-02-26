package ThucHanhLopDongVat;

import java.util.Scanner;

public class TimUCLNvaBCNN {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.println("Ước chung lớn nhất: " + UCLN(a, b));
        ;
        System.out.println("Bội chung nhỏ nhất: " + BCNN(a, b));
        ;
    }

    //method tìm ước chung lớn nhất
    public static int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
               a = a - b;
            } else {
                b = b -a;
            }
        }
        return a;
    }

    //method tìm bội chung nhỏ nhất
    public static int BCNN(int a, int b) {
        return a * b / UCLN(a, b);
    }
}
