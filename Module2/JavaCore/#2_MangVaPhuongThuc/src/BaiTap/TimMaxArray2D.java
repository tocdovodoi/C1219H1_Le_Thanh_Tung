package BaiTap;

import java.util.Scanner;

public class TimMaxArray2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Mảng của bạn: ");
////        int[][] array = {{1, 2, 3},
////                {4, 5, 6},
////                {7, 8, 9}
////        };
        System.out.print("Nhập số hàng của mảng: ");
        int n = input.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int m = input.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử [" + (i) + " " + (j)+ "] :");
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Mảng vừa nhập: ");
        inMang(array);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxArray(array));
    }

    //in mảng
    public static void inMang(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Tìm max
    public static int maxArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
