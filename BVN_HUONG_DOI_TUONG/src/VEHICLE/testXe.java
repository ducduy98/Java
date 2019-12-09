package VEHICLE;

import java.util.Scanner;

public class testXe {
    public static void main(String[] args) {
        vehicle xe1,xe2,xe3;
        xe1=new vehicle("NVA","wave",110,10000);
        xe2=new vehicle("NVB","exciter",150,5000000);
        xe3=new vehicle();
        System.out.println("Chon 1 thao tac: ");
        System.out.println("1: Nhap thong tin xe");
        System.out.println("2: Xem thong tin xe");
        System.out.println("3:Thoat");
        int select=new Scanner(System.in).nextInt();
        switch (select){
            case 1:
                 xe1.input();
                 xe2.input();
                 xe3.input();
                break;
            case 2:
                System.out.printf("%-30s %-30s %-6d %-10.2f %-10.2f \n",xe1.getTenChuXe(),xe1.getLoaiXe(),xe1.getDungTich(),xe1.getGiaTri(),xe1.tinhThue());
                System.out.printf("%-30s %-30s %-6d %-10.2f %-10.2f \n",xe2.getTenChuXe(),xe2.getLoaiXe(),xe2.getDungTich(),xe2.getGiaTri(),xe2.tinhThue());
                System.out.printf("%-30s %-30s %-6d %-10.2f %-10.2f \n",xe3.getTenChuXe(),xe3.getLoaiXe(),xe3.getDungTich(),xe3.getGiaTri(),xe3.tinhThue());

                break;
            case 3: return;

        }
    }
}
