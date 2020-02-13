package BaiTap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        //Hiển thị 20 số nguyên tố đầu tiên
        int count = 0;
        System.out.print("20 số nguyên tố đầu tiên: ");
        for (int i = 0; ; i++) {
            if (checkSNT(i) == 1) {
                System.out.print(i + " ");
                count ++;
            }
            if (count == 20) {
                break;
            }
        }
    }

    public static int checkSNT(int number) {
        if (number < 2) {
            return 0;
        } else {
            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
