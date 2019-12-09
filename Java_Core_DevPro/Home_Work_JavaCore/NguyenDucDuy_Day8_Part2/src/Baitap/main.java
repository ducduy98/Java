package Baitap;

public class main {
	public static void main(String[] args) {
		Employee emp= new Employee("Làm thuê", 22, "HD", "LT001", "7474783",2);
		BaoVe baove=new BaoVe("Baove", 30, "HN", "BV01", "0264689494", 2000000, 500000, 29);
		NvKinhDoanh nvkd= new NvKinhDoanh("Kinh Doanh", 21, "HN", "KD001", "02746757848", 5000000, 2, 600000);
		GiamDoc gd=new GiamDoc("Giám Đốc", 50, "HD", "09999993763636", "giamdoc@gmail.com");
		display(emp);
		display(baove);
		display(nvkd);
		display(gd);
		
	}
	public static void display(Person x) {
		x.display();
	}
}
