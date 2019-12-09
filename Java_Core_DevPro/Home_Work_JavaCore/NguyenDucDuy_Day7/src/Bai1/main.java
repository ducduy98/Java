package Bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {
	public static void main(String[] args) {
		//Cylinder a=new Cylinder(0,0);
		ArrayList<Cylinder> hinhTru=new ArrayList<>();
		int check=1;
		while(check==1) {
			Cylinder a=new Cylinder();
			a.r=(float) Math.random();
			a.h=(float) Math.random();
			if(a.r>=0.01) {
				check=1;
				hinhTru.add(a);
			}
			else {
				check=-1;
			}
			
		}
		int size=hinhTru.size();
		for(int i=0;i<size;i++) {
			System.out.println("***");
			System.out.println("Hình thứ: "+(i+1));
			hinhTru.get(i).showInfo();
		}
		
		//sắp xếp theo thể tích tăng dần
		Comparator<Cylinder> comp=new Comparator<Cylinder>() {

			@Override
			public int compare(Cylinder hinh1, Cylinder hinh2) {				
				return hinh1.theTich()>hinh2.theTich()? 1:-1;
			}
		};
		hinhTru.sort(comp);
		System.out.println("===================================================");
		System.out.println("DS sau khi sắp xếp theo thể tích:");
		for(int i=0;i<size;i++) {
			System.out.println("***");
			System.out.println("Hình thứ: "+(i+1));
			hinhTru.get(i).showInfo();
		}
		
		//sắp xếp theo diện tích toàn phần giảm dần
		Comparator<Cylinder> comp2=new Comparator<Cylinder>() {

			@Override
			public int compare(Cylinder hinh1, Cylinder hinh2) {
				return hinh1.dienTichToanPhan()<hinh2.dienTichToanPhan()?1:-1;
			}
		};
		hinhTru.sort(comp2);
		System.out.println("==================================================");
		System.out.println("DS sau khi sắp xếp theo diện tích toàn phần:");
		for(int i=0;i<size;i++) {
			System.out.println("***");
			System.out.println("Hình thứ: "+(i+1));
			hinhTru.get(i).showInfo();
		}
		//tìm tỉ lệ maxxxx
		float max=0;
		float tile;
		int id = 0;
		Cylinder dem=new Cylinder();
		for(int i=0;i<size;i++) {
			dem=hinhTru.get(i);
			tile=dem.theTich()/dem.dienTichToanPhan();
			if(tile>=max) {
				max=tile;
				id=i;
			}
		}
		System.out.println("==================================================");
		System.out.println("Tỉ lệ lớn nhất là "+max+", ở hình thứ "+id);
		
		hinhTru.get(id).showInfo();
	}
}
