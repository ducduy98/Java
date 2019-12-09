package QLSV;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sinhvien sv1=new sinhvien(1,"Nguyen Van A",8,9);
        sinhvien sv2=new sinhvien(2,"Nguyen Thi B",7,9);
        sinhvien sv3=new sinhvien();
        System.out.println("Ma SV: ");sv3.setMaSV(sc.nextInt());
        System.out.println("Ten SV: ");sc.nextLine();sv3.setHoTen(sc.nextLine());
        System.out.println("Diem TH: ");sv3.setDiemTH(sc.nextFloat());
        System.out.println("Diem LT: ");sv3.setDiemLT(sc.nextFloat());
        System.out.println("********************");
        System.out.println("Thong tin SV :");
        System.out.printf("%-30s %-30s %-6.2f %-6.2f %-6.2f \n",sv1.getMaSV(),sv1.getHoTen(),sv1.getDiemLT(),sv1.getDiemTH(),sv1.tinhDTB());
        System.out.printf("%-30s %-30s %-6.2f %-6.2f %-6.2f \n",sv2.getMaSV(),sv2.getHoTen(),sv2.getDiemLT(),sv2.getDiemTH(),sv2.tinhDTB());
        System.out.printf("%-30s %-30s %-6.2f %-6.2f %-6.2f \n",sv3.getMaSV(),sv3.getHoTen(),sv3.getDiemLT(),sv3.getDiemTH(),sv3.tinhDTB());

    }
}
