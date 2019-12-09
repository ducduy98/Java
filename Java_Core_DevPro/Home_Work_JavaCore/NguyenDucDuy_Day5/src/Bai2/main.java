package Bai2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập ngày sinh: ");
		int ngsinh=sc.nextInt();
		System.out.println("Nhập tháng sinh: ");
		int thsinh=sc.nextInt();
		System.out.println("Ngày sinh vừa nhập: "+ngsinh+"/"+thsinh);
		cal.setTime(new Date());
		int day_now=cal.get(Calendar.DAY_OF_MONTH);
		int year_now=cal.get(Calendar.YEAR);
		int month_now=cal.get(Calendar.MONTH);
		
		long now=cal.getTimeInMillis();
		long khoang,next;
		cal.set(year_now, thsinh-1, ngsinh);
		long sn=cal.getTimeInMillis();
		khoang=sn-now;
		if(khoang<0)
		{
			cal.set(year_now+1, thsinh-1, ngsinh);
			sn=cal.getTimeInMillis();
		}
		khoang=sn-now;
		
		int day=(int)(khoang/(60*60*24*1000));
		System.out.println("Còn "+day+" nữa sẽ đến sinh nhật tiếp theo.");
	}
}
