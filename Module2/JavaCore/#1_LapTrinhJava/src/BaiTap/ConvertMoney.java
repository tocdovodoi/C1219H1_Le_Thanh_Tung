package BaiTap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rate = 23000;
        System.out.print("Enter USD: ");
        float USD = input.nextFloat();
        System.out.println(USD + " $ = " + USD * rate + " VNĐ");
    }
}
