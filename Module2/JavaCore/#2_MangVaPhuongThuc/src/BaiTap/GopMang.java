package BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 2};
        int[] array2 = {4, 3, 8, 2};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[i] = array1[i];
                array3[(i+1)+j] = array2[j];
            }
        }

        System.out.println("Mảng thứ nhất: ");
        inMang(array1);
        System.out.println("\nMảng thứ hai: ");
        inMang(array2);
        System.out.println("\nMảng mới sau khi gộp: ");
        inMang(array3);
    }

    //Phương thức in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
