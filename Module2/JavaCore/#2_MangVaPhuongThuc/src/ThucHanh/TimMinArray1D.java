package ThucHanh;

import java.util.Scanner;

public class TimMinArray1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        inMang(array);
        System.out.println("\nSố nhỏ nhất trong mảng là: " + minArray(array));
    }

    //in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Tìm min
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
