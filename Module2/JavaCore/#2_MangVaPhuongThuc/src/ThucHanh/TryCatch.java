package ThucHanh;

public class TryCatch {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 0;
        try {
            int result = number1/number2;
            System.out.println("Kết quả: " + result);
        } catch (Exception e) {
            System.err.println("Không được chia cho 0!");
        } finally {
            System.out.println("Khối lệnh vẫn chạy dù ngoại lệ xảy ra");
        }
        System.out.println("Sau khi báo lỗi chương trình vẫn thực hiện tiếp được!");
    }
}
