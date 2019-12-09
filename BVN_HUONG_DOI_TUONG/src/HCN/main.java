package HCN;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hinhChuNhat hcn=new hinhChuNhat();
        System.out.println("Nhap chieu dai");

        hcn.setChieu_Dai(sc.nextFloat());
        System.out.println("Nhap chieu rong");
        hcn.setChieu_Rong(sc.nextFloat());
        System.out.println(hcn.toString());
    }
}
