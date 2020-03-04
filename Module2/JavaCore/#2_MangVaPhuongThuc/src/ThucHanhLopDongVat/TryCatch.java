package ThucHanhLopDongVat;

public class TryCatch {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 0;
        try {
            int result = number1/number2;
            System.out.println("Kết quả: " + result);
            System.out.println("Trong try");
        } catch (Exception e) {
            System.err.println("Trong catch");
        } finally {
            System.out.println("Trong finally");
        }
        System.out.println("Ngoài try catch");
    }
}
