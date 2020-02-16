package BaiTap;

import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 3, 5, 6, 2, 4, 7, 9, 7, 5};
        System.out.println("Đây là mảng 10 phần tử: ");
        inMang(array);
        System.out.print("\nNhập vị trí cần xoá (1-10): ");
        int index = input.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (i >= index - 1) {
                array[i] = array[i + 1];
            }
        }
        array[array.length - 1] = 0;
        System.out.println("Mảng sau khi xoá ");
        inMang(array);
    }

    //in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
