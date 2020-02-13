package ThucHanh;

import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of months: ");
        month = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
