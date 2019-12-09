package SINHVIEN;

import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private String add;
    private String phone;

    public SinhVien(int id, String name, String add, String phone) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.phone = phone;
    }
    public SinhVien(){}

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SinhVien input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma SV:");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten SV:");
        this.name=sc.nextLine();
        System.out.println("Nhap dia chi:");
        this.add=sc.nextLine();
        System.out.println("Nhap SDT");
        this.phone=sc.nextLine();
        return this;
    }
}
