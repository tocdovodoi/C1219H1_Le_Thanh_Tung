package BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("\nMenu---------------");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ tam giác vuông");
            System.out.println("3. Vẽ tam giác cân");
            System.out.println("4. Thoát!");
            System.out.print("Vui lòng chọn chức năng: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    int chieuDai = input.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    int chieuRong = input.nextInt();
                    hinhChuNhat(chieuDai, chieuRong);
                    break;
                case 2:
                    System.out.print("Nhập cạnh của tam giác: ");
                    int canhTamGiacVuong = input.nextInt();
                    tamGiacVuong(canhTamGiacVuong);
                    break;
                case 3:
                    System.out.print("Nhập cạnh của tam giác: ");
                    int canhTamGiacCan = input.nextInt();
                    tamGiacCan(canhTamGiacCan);
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    check = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng (1-4)");
            }
        } while (check);
    }

    //Vẽ hình chữ nhật
    public static void hinhChuNhat(int a, int b) {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //Vẽ tam giác vuông
    public static void tamGiacVuong(int a) {

    }

    //Vẽ tam giác cân
    public static void tamGiacCan(int a) {

    }
}
