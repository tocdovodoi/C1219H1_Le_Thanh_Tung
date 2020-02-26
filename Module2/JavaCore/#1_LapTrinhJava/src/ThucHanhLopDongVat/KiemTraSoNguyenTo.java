package ThucHanhLopDongVat;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vui lòng nhập 1 số nguyên dương: ");
        int number = input.nextInt();
        if (number < 2) {
            System.out.println("Số " + number + " không phải số nguyên tố");
        } else {
            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Số " + number + " không phải số nguyên tố");
            } else {
                System.out.println("Số " + number + " là số nguyên tố");
            }
        }
    }
}