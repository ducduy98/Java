package Bai1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String dsSinhVien[] = {
				"Nguyễn Thị Lan Anh",				"Vương Công Tuấn Anh",
				"Lương Ngọc Mỹ Linh",				"Hoàng Thị Thương",
				"Lê Thị Huế",				"Nguyễn Thị Kim Lan",
				"Phạm Thị Lệ",				"Hà Thị Trà My",
				"Lê Thanh Mỹ Lệ Anh",				"Lê Thị Thu Hiền",
				"Vũ Thị Hoa",				"Đào Thị Khánh Huyền",
				"Nguyễn Thương Huyền",				"Nguyễn Thùy Linh",
				"Hoàng Minh Ngọc",				"Nguyễn Thị Nhung",
				"Nguyễn Tố Như",				"Võ Thị Thuỳ Phương",
				"Lê Thị Phương Thảo",				"Lê Thùy Trang",
				"Đàm Nguyễn Thùy Anh",				"Tống Thị Hương",
				"Vũ Thị Mai Phương",				"Nguyễn Thị Thanh",
				"Lê Thị Hằng",				"Nguyễn Thị Hiền",
				"Phạm Thu Huyền",				"Mai Thị Lan Hương",
				"Trương Hồng Nhung",				"Nguyễn Thị Lê Quyên",
				"Nguyễn Thị Thùy Trang",				"Phạm Văn Hoàng",
				"Nguyễn Phạm Hà Hương",				"Tường Thế Đức",
				"Phạm Thị Hường",				"Dương Trung Khiên",
				"Hồ Văn Thịnh",				"Trần Tuyên Thống",
				"Bùi Thị Trâm",				"Trần Thu Hà",
				"Lê Trung Kiên",				"Ngô Xuân Vũ",
				"Trần Đức Mạnh",				"Đàm Anh Hoàng",
				"Trần Văn Phú",				"Ngô Nguyệt Ánh",
				"Nguyễn Thị Mai Mơ",				"Nguyễn Thị Kim Phượng",
				"Tạ Khánh Linh",				"Nguyễn Thị Hoài",
				"Trần Trịnh Anh Trung",				"Nguyễn Thị Phương Anh",
				"Nguyễn Đức Mạnh",				"Lò Thị Nam Phương",
				"Đinh Tuấn Anh",				"Nguyễn Phương Anh",
				"Đinh Thị Ngọc Bích",				"Nguyễn Thị Hiền",
				"Nguyễn Hoàng Quân"
			};
		String []dsSV=new String[dsSinhVien.length];
		for (int i = 0; i < dsSV.length; i++) {
			dsSV[i]=dsSinhVien[i];
		}
		String tim[];
		String key;
		int[]s;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Nhập từ khóa tìm kiếm: ");
		key=sc.nextLine();
		s=search(dsSinhVien,key);
		int dem=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]!=-1)dem++;
		}
		if(dem!=0) {
			System.out.println("Tìm được "+dem+" kết quả chứa '"+key+"':");
			for (int i = 0; i < s.length; i++) {
				if(s[i]!=-1)System.out.println(dsSV[s[i]]);		
			}
		}
		else {
			System.out.println("Không có kết quả phù hợp!!!");
		}
		
	}
	private static int[] search(String[] a, String key) {
		String k=key.toUpperCase();
		//k=k.trim();
		int index[]=new int[a.length];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i].toUpperCase();
			boolean check;
			check=a[i].contains(k);
			
			if(check==true)
			{
				index[j]=i;
				j++;
			}else {
				index[j]=-1;
				j++;
			}
				
		}
		return index;
		
	}
//	static String[] searchName(String [] name,String key) {
//		StringBuilder sbd=new StringBuilder();
//		int dem=0;
//		for (int i = 0; i < name.length; i++) {
//			if(name[i].toUpperCase().contains(key.toUpperCase())) {
//				sbd.append(name[i]);
//				sbd.append("#");
//			}
//		}
//		if(dem==0) {
//			sbd.append("ko tim thay: "+key);
//		}
//		return sbd.toString().split("#");
//	}
//	
}
