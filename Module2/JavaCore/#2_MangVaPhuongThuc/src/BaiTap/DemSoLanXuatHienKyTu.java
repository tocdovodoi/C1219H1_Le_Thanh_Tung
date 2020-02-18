package BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "foiwoeigslknsfsdjkfqoiropsigpwejjskgfdj";
        System.out.println("Nhập ký tự cần tìm kiếm");
        char chr =  input.nextLine().charAt(0); //Ép kiểu string sang kiểu char bằng cách lấy kí tự đầu tiên nhập vào
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("Kí tự bạn tìm kiếm '" + chr + "' xuất hiện " + count + " lần!");

    }
}
