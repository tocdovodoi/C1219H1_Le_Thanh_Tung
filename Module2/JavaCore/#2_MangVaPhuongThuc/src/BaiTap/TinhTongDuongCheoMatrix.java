package BaiTap;

import java.util.Scanner;

public class TinhTongDuongCheoMatrix {
    public static void main(String[] args) {
        Scanner inut = new Scanner(System.in);
        System.out.print("Nhập độ rộng của ma trận: ");
        int n = inut.nextInt();
        System.out.println();
        int[][] maxtrix = new int[n][n];
        for (int i = 0; i < maxtrix.length; i++) {
            for (int j = 0; j < maxtrix[i].length; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                maxtrix[i][j] = inut.nextInt();
            }
            System.out.println();
        }
        System.out.println("Ma trận của bạn: ");
        inMaTran(maxtrix);
        System.out.println("Tổng của đường chéo bằng: "+ sum(maxtrix));
    }

    //In mảng 2 chiều
    public static void inMaTran(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    //Tính tổng đường chéo
    public static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
