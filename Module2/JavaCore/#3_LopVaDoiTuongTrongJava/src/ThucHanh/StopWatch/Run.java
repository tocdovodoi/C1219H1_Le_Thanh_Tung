package ThucHanh.StopWatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
    public static void main(String[] args) {
        //Lấy thời gian hệ thống
        Date date = new Date();
        //Định dạng thời gian hệ thống
        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        //Ép kiểu thời giang sang kiểu String
        String showTime = dinhDangThoiGian.format(date.getTime());
        System.out.println(" " + showTime);
    }
}
