package BaiTap;

public class EqualsBangBangHashCode {
    public static void main(String[] args) {
        String txt1 = "text";
        String txt2 = "text2";
        String txt3 = new String("text2");   //tạo bằng từ khoá new nên sẽ tạo ra 2 vùng nhớ
//        String txt4 = new String("text");
//        //== là so sánh xem 2 biến có trỏ đến cùng 1 đối tượng hay không
//        //equals so sánh 2 biến tham chiếu dù không cùng 1 vùng nhớ
//        System.out.println(txt1 == txt2);               //true
//        System.out.println(txt1 == txt3);               //false
//        System.out.println(txt1.equals(txt2));          //true
//        System.out.println(txt3 == txt4);               //false
//        System.out.println(txt3.equals(txt4));          //true
        System.out.println(txt1.hashCode());
        System.out.println(txt2.hashCode()==txt3.hashCode());
    }
}
