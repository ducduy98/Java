package SINHVIEN;

import java.util.*;

public class testSinhVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so SV:");
        int n=sc.nextInt();
        List<SinhVien> list=new ArrayList<SinhVien>();

        for (int i=0;i<n;i++){
            SinhVien s=new SinhVien();
            s.input();
            list.add(s);
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId()>o2.getId()?1:-1;
            }
        });
        for (SinhVien sv:list
        ) {
            System.out.println(sv.toString());
        }

        list.sort((SinhVien o1,SinhVien o2) -> o2.getId()-o1.getId());
        list.forEach(sinhVien -> {
            System.out.println(sinhVien.toString());
        });
    }

}
