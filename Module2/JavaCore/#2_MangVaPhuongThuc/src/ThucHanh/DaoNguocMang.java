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

        //
        System.out.println("\nMảng sau khi đảo ngược bằng tham trị: ");     //Không thay đổi giá trị
        for (int i = 0; i < array.length-1; i++) {
            swapThamTri(array[i],array[i+1]);
        }
        inMang(array);

        //
        System.out.println("\nMảng sau khi đảo ngược bằng tham chiếu: ");   //Có thay đổi giá trị
        swapThamChieu(array);
        inMang(array);
    }

    //in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Đảo ngược mảng bằng tham trị
    public static void swapThamTri(int a, int b) {
        int tam;
        tam = a;
        a = b;
        b = tam;
    }

    //Đảo ngược mảng bằng tham chiếu
    public static void swapThamChieu(int[] array) {
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
