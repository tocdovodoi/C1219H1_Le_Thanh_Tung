package GhiDe;

public class Cha {
    private String ten;
    private int tuoi;

    public Cha() {
    }

    public Cha(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void hienThi(String ten, int tuoi) {
        System.out.println("ten "+ten+"tuoi "+tuoi);
    }
}
