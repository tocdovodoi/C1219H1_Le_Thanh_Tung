package BaiTap;

import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner inut = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int n = inut.nextInt();
        System.out.print("\nNhập số cột của mảng: ");
        int m = inut.nextInt();
        System.out.println();
        int[][] maxtrix = new int[n][m];
        for (int i = 0; i < maxtrix.length; i++) {
            for (int j = 0; j < maxtrix[i].length; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                maxtrix[i][j] = inut.nextInt();
            }
            System.out.println();
        }
        System.out.println("Ma trận của bạn: ");
        inMaTran(maxtrix);
        System.out.print("Bạn muốn tính tổng của cột số mấy? :");
        int cot = inut.nextInt();
        System.out.println("Tổng của cột số " + cot + " bằng: " + sum(maxtrix, cot - 1));
    }

    //In mảng 2 chiều
    public static void inMaTran(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Tính tổng 1 cột bất kỳ
    public static int sum(int[][] array, int number) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == number) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
