package BaiTap;

import java.util.Scanner;

public class ChenMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Đây là mảng 10 phần tử, mời nhập 4 phần tử: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        inMang(array);
        System.out.print("Nhập vị trí cần chèn (1-10): ");
        int index = input.nextInt();

        for (int i = array.length - 1; i >= 0; i--) {
            if (i > index - 1) {
                array[i] = array[i - 1];
            }
            if (i == index - 1) {
                System.out.print("\nNhập phần tử cần chèn: ");
                array[i] = input.nextInt();
                break;
            }
        }
        System.out.println("Mảng sau khi chèn ");
        inMang(array);
    }

    //in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
