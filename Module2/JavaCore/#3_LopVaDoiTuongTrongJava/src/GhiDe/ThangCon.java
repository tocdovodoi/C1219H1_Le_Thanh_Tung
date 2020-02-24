package GhiDe;

public class ThangCon extends Cha {
    String soDienThoai;
    public ThangCon() {
    }

    public ThangCon(String ten, int tuoi, String soDienThoai) {
        super(ten, tuoi);
        this.soDienThoai = soDienThoai;
    }

    public void hienThi(String ten, int tuoi) {
        System.out.println("ten con "+ten+"tuoi con "+tuoi);
    }
    public void hienThi(String ten, String tuoi) {
        System.out.println("ten con "+ten+"tuoi con "+tuoi);
    }

}
