package ThucHanh;

import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập tháng: ");
        int thang = input.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày!");
                break;
            case 2:
                System.out.print("Mời bạn nhập thêm năm: ");
                int nam = input.nextInt();
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.println("Tháng " + thang + " năm " + nam + " có 29 ngày!");
                } else {
                    System.out.println("Tháng " + thang + " năm " + nam + " có 28 ngày!");
                }
                break;
            default:
                System.out.println("Vui lòng nhập tháng 1 - 12");
        }
    }
}
