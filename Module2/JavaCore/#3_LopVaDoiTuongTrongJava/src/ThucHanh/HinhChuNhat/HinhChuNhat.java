package ThucHanh.HinhChuNhat;

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

class ClassHinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public ClassHinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public ClassHinhChuNhat() {
    }

    //Phương thức set và get
    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float chuVi(float chieuDai, float chieuRong) {
        return (this.getChieuDai() + this.getChieuRong()) * 2;
    }

    public float dienTich(float chieuDai, float chieuRong) {
        return this.getChieuDai() * this.getChieuRong();
    }

    public String display() {
        return "Chiều dài: " + chieuDai + "\nChiều rồng: " + chieuRong;
    }

}