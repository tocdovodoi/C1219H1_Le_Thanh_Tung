package ThucHanh.HinhChuNhat;

class ClassHinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public ClassHinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public ClassHinhChuNhat() {
    }

    //Phương thức set và get
    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float chuVi(float chieuDai, float chieuRong) {
        return (this.getChieuDai() + this.getChieuRong()) * 2;
    }

    public float dienTich(float chieuDai, float chieuRong) {
        return this.getChieuDai() * this.getChieuRong();
    }

    public String display() {
        return "Chiều dài: " + chieuDai + "\nChiều rồng: " + chieuRong;
    }

}
