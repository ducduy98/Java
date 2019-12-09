package devpro;


import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class main {
	public static void main(String[] args) {
		//Calendar
		//bộ lich của java, dùng để xử lý các tính toán liên quan đên thời gian 
		
		//khởi tạo
		Calendar cal= Calendar.getInstance();
		Date today= cal.getTime();//lấy thời gian hiện tại của lịch
		System.out.println(today);
		//láy từng trường 1: 
		//lấy năm:
		int nam=cal.get(Calendar.YEAR);
		System.out.println(nam);
		//lấy ngày
		int ngay=cal.get(Calendar.DAY_OF_MONTH);//lấy ngày trong tháng
		System.out.println(ngay);
		int thang=cal.get(Calendar.MONTH);//lấy tháng từ 0-11
		System.out.println(thang);
		
		int gio=cal.get(Calendar.HOUR);//giờ 0-12
		System.out.println("Giờ 12: "+gio);
		int am_pm=cal.get(Calendar.AM_PM);//0: AM____1: PM
		
		int gio2= cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Giờ 24: "+gio2);
		
		int phut =cal.get(Calendar.MINUTE);//0-59
		int giay=cal.get(Calendar.SECOND);//0-59
		int milisec=cal.get(Calendar.MILLISECOND);//0-999
		
		//các tham chiếu thời gian
		int tuan= cal.get(Calendar.WEEK_OF_YEAR);//tuần trogn năm
		System.out.println(tuan);
		
		int tuan2=cal.get(Calendar.WEEK_OF_MONTH);//tuần trong tháng, bắt đầu từ ngày chủ nhật
		System.out.println(tuan2);
		int tuan3=cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);//tuần trong tháng bắt đầu từ ngày đầu tháng
														//1-7: tuần 1, 8-14: tuần 2....
		System.out.println(tuan3);
		int day_of_week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_of_week);//1: chủ nhật, 2:  thứ 2, 3: thứ 3...
		
		//====================================
		//đặt lại thời gian hiện tại của lịch
		//cal.set(field, value);
		//field: các trường muốn xét: Calendar.year, calendar.month....
		//ví dụ chỉnh năm sang năm 2020
		
		cal.set(Calendar.YEAR, 2020);
		//chỉnh thành tháng 8
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		Date someday=cal.getTime();
		System.out.println(someday);
		
		//cal.set(1998, 6, 16);//khó khăn khi đọc code
		//cal.set(year, month, date, hourOfDay, minute, second);
		
		//cal.roll(field, up);//xoay các trường của lịch
		//xoay năm lên 1 đơn vị
		cal.roll(Calendar.YEAR, true);//2020==>2021
		System.out.println(cal.getTime());
		
//		cal.roll(field, amount);//roll nhiều năm
		cal.roll(Calendar.YEAR, -4);//xoay về trc 4 năm
		System.out.println(cal.getTime());
		
		//roll ko làm thay đổi các trường khác// ví dụ:  đang ngày 31, roll 1 thì sẽ thành ngày 1 của cùng tháng
		
		//add
		
//		cal.add(field, amount);//
		//field trường muốn add
		//amount: số lượng muốn add
	//	cal.add(Calendar.DAY_OF_MONTH,5);//chỉnh lên 5 ngày
		
		//add : làm ảnh hưởng tới các trường khác
		System.out.println(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, 1000);
		System.out.println(cal.getTime());
				
		//set lại về hiện tại:
		Date d=new Date();
		cal.setTime(d);
		//ngày trong năm: 
			int d_o_y=	cal.get(Calendar.DAY_OF_YEAR);//1-365(366)
		System.out.println(d_o_y);
		
		//lấy ra giá trị lớn nhất của 1 trường nào đó
		int max_day_in_year=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(max_day_in_year);
		//lấy ngày cuối cùng của tháng
		cal.set(Calendar.MONTH, 1);//trỏ về tháng 2
		int max_day_of_month=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(max_day_of_month);
		
		//epoch-time
		//số mili giây tính từ lúc 00:00:00 01/01/1970
		long time_mili=cal.getTimeInMillis();
		System.out.println(time_mili);
		cal.setTime(new Date());//trỏ về hiện tại 
		System.out.println(cal.getTime());
		//tính xem bao nhiêu ngày thì đến valentine (14/2)
		int con_nam_2019=cal.getActualMaximum(Calendar.DAY_OF_YEAR)-cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(con_nam_2019);
		cal.set(2020, 1, 14);//set về ngày 14/02/2020
		int nam_2020=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(nam_2020);
		System.out.println("còn " +(con_nam_2019+nam_2020)+" thì đến này valentine!!!!");
		//c2
//		cal.setTime(new Date());//trỏ về hiện tại
//		long hientai=cal.getTimeInMillis();
//		cal.set(2020, 1, 14);//set về ngày 14/02/2020
//		long valentine=cal.getTimeInMillis();
//		long timedai=valentine-hientai;
//		int day=(int)(timedai/(86000*1000));
//		System.out.println(day);
		
		//TIMEZONE
		
		cal=Calendar.getInstance();
		TimeZone defZone=cal.getTimeZone();
		int offset= defZone.getRawOffset();
		System.out.println(offset);
		//tính giờ tokyo
		//lấy timezone tokyo
		
		//in ra toàn bộ các ZoneID
		String zoneID[]=TimeZone.getAvailableIDs();
		for (int i = 0; i < zoneID.length; i++) {
			System.out.println(zoneID[i]);
		}
		//tạo thông qua zoneID
		TimeZone tokyo=TimeZone.getTimeZone("Asia/Tokyo");
		int tokyo_offset=tokyo.getRawOffset();//mili
		long local_time=cal.getTimeInMillis();
		long tokyo_time=local_time-offset+tokyo_offset;
		Date tokyo_date=new Date(tokyo_time);
		System.out.println(tokyo_date);
		
		//string-date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
		Date homNay= new Date();
		String strDay= sdf.format(homNay);
		System.out.println(strDay);
		//cách 2
		SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
		Date homNay1= new Date();
		String strDay1= sdf1.format(homNay1);
		System.out.println(strDay1);

		
		//chuyển từ chuỗi về date
		
		String day_x="07/10/2019 06:57:38 PM";
		try {
			Date date_x=sdf.parse(day_x);
			boolean check=date_x.before(homNay1);
			System.out.println(check);
			System.out.println(date_x);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		//DateFormatSymbols
		Locale vn=new Locale("vi","VN");
		Locale kr=Locale.KOREA;//locale hàn
		DateFormatSymbols dfS= new DateFormatSymbols(vn);
		String [] weeks=dfS.getWeekdays();// lấy tên thứ
		cal.setTime(new Date());
		String thu=weeks[cal.get(Calendar.DAY_OF_WEEK)];
		System.out.println(thu);
		//------------ENUM: ------------------
		//-dùng để định nghĩa cac kiểu dl dạng liệt kê
		//VD: mùa trong năm(SPRING, SUMMER, AUTUMN, WINTER), trạng thái server(OK,BAD_GATEWAY,RESOURCE_NOT_FOUND), giới tính(MALE, FEMALE) ,USER(JUNIO,MEMBER,ADMIN,)
		
		Season season=Season.AUTUMN;
		switch (season) {
		case SPRING:
			System.out.println("XUÂN");
			break;
		case SUMMER:
			System.out.println("HẠ");
			break;
		case AUTUMN:
			System.out.println("THU");
			break;
		case WINTER:
			System.out.println("ĐÔNG");
			break;
		default:
			break;
		}
		Gender gioitinh= Gender.female;
		gioitinh=Gender.male;
	}
	public enum Gender {male,female};
}
