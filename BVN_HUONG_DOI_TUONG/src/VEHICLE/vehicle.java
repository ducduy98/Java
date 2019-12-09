package VEHICLE;

import java.util.Scanner;

public class vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float giaTri;
    Scanner sc=new Scanner(System.in);
    public vehicle(String tenChuXe, String loaiXe, int dungTich, float giaTri) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.giaTri = giaTri;
    }

    public vehicle() {
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public void input(){
        System.out.println("Ten chu xe: ");this.tenChuXe=sc.nextLine();
        System.out.println("Loai xe: ");this.loaiXe=sc.nextLine();
        System.out.println("Dung tich: ");this.dungTich=sc.nextInt();
        System.out.println("Tri gia: ");this.giaTri=sc.nextFloat();
    }
    public float tinhThue(){
        if (this.dungTich<100){
            return (float) (this.giaTri*0.1);
        }else if (this.dungTich<200){
            return (float) (this.giaTri*0.3);
        }else {
            return (float) (this.giaTri*0.5);
        }
    }
}
