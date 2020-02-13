package BaiTap;

import java.util.Scanner;

public class DocSoThanhChu_2ChuSo {
    public static void main(String[] args) {
        //Đọc số thành chữ
        //https://elight.edu.vn/tat-tan-tat-ve-so-thu-tu-so-dem-trong-tieng-anh/
        Scanner input = new Scanner(System.in);
        boolean check = true;
        do {
            int choose;
            System.out.println("Menu-------------------");
            System.out.println("1. Đọc số!");
            System.out.println("2. Thoát");
            System.out.print("Vui lòng chọn chức năng: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Nhập 1 số nguyên bất kỳ 2 chữ số (0-99): ");
                    int number = input.nextInt();
                    docSoHaiChuSo(number);
                    break;
                case 2:
                    System.out.println("Tạm biệt!");
                    check = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng! (1-2)");
            }
        } while (check);
    }

    public static void docSoHaiChuSo(int number) {
        if (number >= 0 && number <= 12) {       //Số <=12
            System.out.println(number + " = " + docSo(number));
        } else if (number >= 13 && number <= 19) {      //Số <=19
            if (number == 13) {
                System.out.println("thirteen");
            } else if (number == 15) {
                System.out.println("fifteen");
            } else {
                System.out.println(docSo(number % 10) + "teen");
            }
        } else if (number >= 20 && number <= 99) {
            if (number % 10 == 0) {
                if (number / 10 == 2) {
                    System.out.println("twenty");
                } else if (number / 10 == 3) {
                    System.out.println("thirty");
                } else if (number / 10 == 5) {
                    System.out.println("fifty");
                } else {
                    System.out.println(docSo(number / 10) + "ty");
                }
            } else {
                if (number / 10 == 2) {
                    System.out.println("twenty-" + docSo(number % 10));
                } else if (number / 10 == 3) {
                    System.out.println("thirty-" + docSo(number % 10));
                } else if (number / 10 == 5) {
                    System.out.println("fifty-" + docSo(number % 10));
                } else {
                    System.out.println(docSo(number / 10) + "ty-" + docSo(number % 10));
                }
            }
        } else {
            System.out.println("Vui lòng nhập số nguyên dương 2 chữ số!");
        }
    }
    public static String docSo(int number) {
        String doc;
        switch (number) {
            case 0:
                doc = "zero";
                break;
            case 1:
                doc = "one";
                break;
            case 2:
                doc = "two";
            case 3:
                doc = "three";
                break;
            case 4:
                doc = "four";
                break;
            case 5:
                doc = "five";
                break;
            case 6:
                doc = "six";
                break;
            case 7:
                doc = "seven";
                break;
            case 8:
                doc = "eight";
                break;
            case 9:
                doc = "nine";
                break;
            case 10:
                doc = "ten";
                break;
            case 11:
                doc = "eleven";
                break;
            case 12:
                doc = "twelve";
                break;
            default:
                doc = "";
        }
        return doc;
    }
}
