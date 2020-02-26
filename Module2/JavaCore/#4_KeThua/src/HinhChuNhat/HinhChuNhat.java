package HinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        ClassHinhChuNhat h1 = new ClassHinhChuNhat();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        h1.setChieuDai(input.nextFloat());
        System.out.print("Nhập chiều rộng: ");
        h1.setChieuRong(input.nextFloat());
        System.out.println(h1.display());
        System.out.println("Chu vi bằng: " + h1.chuVi(h1.getChieuDai(),h1.getChieuRong()));
        System.out.println("Chu vi bằng: " + h1.dienTich(h1.getChieuDai(),h1.getChieuRong()));
    }
}

