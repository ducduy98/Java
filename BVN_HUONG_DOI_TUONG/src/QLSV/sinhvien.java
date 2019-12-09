package QLSV;

public class sinhvien {
    private int maSV;
    private String hoTen;
    private float diemLT,diemTH;

    public sinhvien() {
    }

    public sinhvien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDTB(){
        return (this.diemLT+this.diemTH)/2;
    }
    public String toString(){
        return "Ma SV :"+this.maSV+", ho ten: "+this.hoTen+"Diem TH :"+
                this.diemTH+", Diem LT: "+this.diemLT+", DiemTB :"+this.tinhDTB();
    }
}
