package ThucHanh;

import java.util.Scanner;

public class DaoNguocMang {
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
        swap(array);
        System.out.println("Mảng sau khi đảo ngược: ");
        inMang(array);
    }

    //in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //đảo ngược mảng
    public static void swap(int[] array) {
        int tam;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                tam = array[i];
                array[i] = array[j];
                array[j] = tam;
            }
        }
    }
}
