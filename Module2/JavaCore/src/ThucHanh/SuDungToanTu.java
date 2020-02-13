package ThucHanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float chieuDai, chieuRong;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = input.nextFloat();
        System.out.print("Nhập chiều rong: ");
        chieuRong = input.nextFloat();
        float dienTich = chieuDai*chieuRong;
        System.out.println("Diện tích của hình chữ nhật = " + dienTich);
    }
}
