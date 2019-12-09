package Bai3;

import java.util.Calendar;
import java.util.Date;

public class main {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		long now=cal.getTimeInMillis();
		cal.set(2026, 0, 1);
		long t=cal.getTimeInMillis();
		int dem=0;
		for (long i = now; i <t; i+=(86400*1000)) {
			Date d=new Date(i);
			cal.setTime(d);
			if(cal.get(Calendar.DAY_OF_MONTH)==13&&cal.get(Calendar.DAY_OF_WEEK)==6)
			{
				dem+=1;
				System.out.println(d);
				cal.roll(Calendar.DAY_OF_MONTH, true);
			}
		}
		
		System.out.println("Có "+dem+ " ngày là thứ Sáu ngày 13.");
	}
}
