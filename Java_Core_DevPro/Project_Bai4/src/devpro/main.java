package devpro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String args []) {
		//Mảng
		//khai báo
//		int[] m1;
//		//tenkieu[] tenamang;
//		int m2[];//cách khai báo khác
//		//khai báo và khởi tạo
//		int[]m3= new int[10];//tạo ra 1 mảng số nguyên
//		//có 10 phần tử, mảng rỗng
//		m2= new int[5];//tạo mảng gồm 5 ptu
//		float [] mf1= new float[5];//mảng float 5pt
//		//gán gtri trực tiếp
	//	int []m4 = {5,2,6,2,5,2};//số lượng pt của mảng được nội suy từ chính các giá trị đưa vào//Cách gán trực tiếp này chỉ dùng khi khai báo
		//số lượng ptu luôn phải được chỉ rõ khi khởi tạo
		//số lượng này ko thể thay đổi được sau khi mảng đã khởi tạo
		
		//truy xuất các phần tử
		//thông qua chỉ số index
		//mỗi pt của mảng sẽ được đánh 1 chỉ số index
		//pt đầu có index=0
//		int a=m4[0];
//		System.out.println(a);
//		for (int i = 0; i <m4.length; i++) {
//			System.out.println(m4[i]);			
//		}
		//length : số lượng pt trong mảng
		//nhập giá trị vào mảng
//		Scanner sc=new Scanner(System.in);
//		for (int i = 0; i < m2.length; i++) {
//			System.out.println("Nhập m2["+i+"]=");
//			m2[i]=sc.nextInt();			
//		}
		
//		for (int i = 0; i < m2.length; i++) {
//			System.out.print(m2[i]+" ");
//		}
		//in mảng chứa số
//		System.out.println(Arrays.toString(m2));
		//ví dụ: tao mảng 50 ptu, lưu các số chẵn vào trong mảng
		//in các pt ra màn hình
//		int m5[] =new int [50];
//		m5[0]=2;
//		for (int i = 1; i < m5.length; i++) {			
//			m5[i]=m5[i-1]+2;
//		}
//		for (int i = 0; i < m5.length; i++) {
//			System.out.println("m5["+i+"]="+m5[i]);
//		}
		//int z= getNumber(i);
		
		
		//------Mảng 2 chiều----------
		//
/*		int [][] m2c=new int[3][4];//3 hàng 4 cột
		//gán pt vào mảng 2 chiều
		m2c[0][0]=5;
		m2c[0][1]=6;
		m2c[0][2]=7;
		m2c[0][3]=8;
		
		m2c[1][0]=9;
		m2c[1][1]=10;
		m2c[1][2]=11;
		m2c[1][3]=12;
		
		m2c[2][0]=13;
		m2c[2][1]=14;
		m2c[2][2]=15;
		m2c[2][3]=16;
		
		//duyệt mảng 2 chiều
		for (int i = 0; i < m2c.length; i++) {
			for (int j = 0; j < m2c[i].length; j++) {
				System.out.print(m2c[i][j]+" ");
			}
			System.out.println();
		}
		//cách các chỉ số index chạy
		for (int i = 0; i < m2c.length; i++) {
			for (int j = 0; j < m2c[i].length; j++) {
				System.out.print(i+"-"+j+"  ");
			}
			System.out.println();
		}
		*/
/*		int m2C[][]= new int [3][];
		//thực chất mảng 2 chiêu là mảng chứa mảng, tức là 1 mảng mà mỗi pt của mảng đó lại chứa 1 mảng khác
		int [] mangcon1=m2C[0];//mảng mangcon1 được bóc tách từ mảng m2C
		
		int [] mc1= {2,5,7};
		int [] mc2= {1,2,3,4};
		int [] mc3= {3,4,6,1,334,24};
		m2C[0]=mc1;
		m2C[1]=mc2;
		m2C[2]=mc3;
		for (int i = 0; i < m2C.length; i++) {
			for (int j = 0; j < m2C[i].length; j++) {
				System.out.print(m2C[i][j]+" ");
			}
			System.out.println();
		}
		int[]mx[] =new int[2][4];//khai báo mảng 2 chiều khác
*/
		//-----------CHuỗi-String----------
		
		String str="Xin chào";//khai báo và gán giá trị
		String str1=new String("abc");//khởi tạo thông qua construcstor
		char[]chArr=str.toCharArray();
		System.out.println(Arrays.toString(chArr));
		String str3= new String(chArr);//tạo string từ mảng kí tự
		System.out.println(str3);
		
		//Lấy chiều dài chuỗi
//		int n=str.length();//trả về chiều dài chuỗi
//		
//		boolean test= str.isEmpty();//ktra xem chuỗi có rỗng hay ko true/false
//		System.out.println(test);
//		
//		//so sánh chuỗi
//		boolean kq=str.equals(str1);//true nếu nội dung 2 chuỗi này giống nhau, false nếu nội dung 2 chuỗi khác nhau
//		System.out.println(kq);
		
		str="viet nam";
		str1=new String("viet nam");
		if(str==str1) {
			System.out.println("bằng nhau");
		}else {
			System.out.println("ko bằng nhau");
		}
		//== chỉ so sánh cái chỉ số id của str và str, equals sẽ ss nội dung 
		if(str.equals(str1) ) { 
			System.out.println("bằng nhau");
		}else {
			System.out.println("ko bằng nhau");
		}
		//nối chuỗi
		//dùng hàm concat();
		//dùng toán tử +
		str ="XIN CHÀO";
		str1="CÁC BẠN";
		str3=str+" "+str1;
		System.out.println(str3);
		String str4=str.concat(str1);//ko cộng thêm dấu cách
		System.out.println(str4);
		
		//Cắt chuỗi
		//dùng subString();
		String str5=str4.substring(3,8);
		System.out.println(str5);
		//tất cả các thay đổi về nội dung của chuỗi sẽ sinh ra 1 đối tượng String mới và ko ảnh hưởng tới String ban đầu
		//String là đối tượng không thể thay đổi được nội dung 
		
		//----indexOf -lastIndexOf
		//lấy ra chỉ số index của 1 chuỗi con nếu nó xuất hiện trong chuỗi cần tìm, nếu ko có trong chuỗi cần tìm thì trả về -1
//		str3="hello all sexy lady";
//		int begin =str3.indexOf("l");//lấy được index của chữ l đầu tiên xuất hiện trong chuỗi str3
//		
//		int end=str3.lastIndexOf("l");
//		str=str3.substring(begin,end);
//		System.out.println(str);
//		int id=str.indexOf("l",begin+1);
//		str=str3.substring(id,end);
//		System.out.println(str);
		
//		String[] names= {"Nguyễn Mai Phương Linh", "Phạm Hà Kiều Anh","Lê Quốc Quân","Phạm Mạnh Hùng","Lê Nguyễn Hoàng Anh"};
//		//chạy vòng lặp, in ra toàn bộ tên đệm của các người trên
//		for (int i = 0; i < names.length; i++) {
//			int dau=names[i].indexOf(" ");
//			int cuoi=names[i].lastIndexOf(" ");
//			String s=names[i].substring(dau+1,cuoi);
//			System.out.println(s);
//		}
		
		//---charAt(i): lấy ra 1 kí tự ở vị trí index i
		
		
		//--------compareTo--so sánh chuỗi theo thứ tự từ điển, trả về 1 số nguyên dương nếu chuỗi thứ nhất ở phía sau chuỗi thứ 2 trong thứ tự từ điển,
		//ngược lại nếu chuỗi thứ nhất ở trc chuỗi t2 thì sẽ trả về số âm
//		str1="dfffk";
//		String str2="abc";
//		int ketqua=str1.compareTo(str2);
//		int ketqua2=str2.compareTo(str1);
//		System.out.println(ketqua);
//		System.out.println(ketqua2);
		
		
		//---hàm replace: tìm kiếm và thay thế
		str1="Hôm nay là một ngày đẹp trời";
		str=str1.replace("ay", "i");
		System.out.println(str);
		
		//---hàm split: tách chuỗi thành các chuỗi con
		String mails="nguyenducduy131098@gmail.com#duyttvip98@gmail.com#lethanhvan01032001@gmail.com";
		String [] mail= mails.split("#");
		for (int i = 0; i < mail.length; i++) {
			System.out.println(mail[i]);
		}
		
		//trim()--cắt khoảng trắng ở 2 đầu
		str="    bfbgusivu nsib aba    ";
		str=str.trim();
		System.out.println(str);
		
		//toUpperCase()------biến thành chữ hoa
		str="nguyen đức duy";
		str=str.toUpperCase();
		System.out.println(str);
		
		//toLowerCase()----------chữ hoa thành chữ thường
		
		//contains-----Kiểm tra xem chuỗi có chưa chuỗi con nào hay ko: trả về true//false
		str="xin chào việt nam";
		String key="việt nam";
		boolean kqua=str.contains(key);
		System.out.println(kqua);
		
		//compareToIgnoreCase --------so sánh bỏ qua hoa thường
		str.compareToIgnoreCase(key);
		
		///equalIgnoreCase-so sánh nọi dung string bỏ qua hoa thường
		str.equalsIgnoreCase(key);
		
		//endsWith()------kiểm tra xem chuỗi có kết thúc bằng 1 chuỗi nào đó hay ko : trả về true/false
		str.endsWith(".mp4");
		
		//startWith ---ktra xem chuỗi có bắt đầu bằng 1 chuỗi nào đó hay k: trả về true/false
		str.startsWith("Nguyen");
		
		//stringBuilder
		//là 1  dạng chuỗi cho phép thay đổi nội dung trực tiếp 
		//khởi tạo
		StringBuilder sbd1=new StringBuilder();		//rỗng-capacity=16
		StringBuilder sbd2=new StringBuilder(50);	//rỗng-capacity=50
		StringBuilder sbd3=new StringBuilder(str);	//khởi tạo từ String có sẵn
		//-------các hàm--------
			//--------append()----
		sbd1.append("abc");
		sbd1.append(true);
		sbd1.append(3.14f);
		System.out.println(sbd1);//abctrue3.14
		
		//delete
		sbd1.delete(3, 7);
		System.out.println(sbd1);//abc3.14
		
		//insert---
		sbd1.insert(3, "anh");
		System.out.println(sbd1);//abcanh3.14
		
		//subString(index);//cắt chuỗi 
		//replace
		sbd1.replace(0, 3, "VN");
		System.out.println(sbd1);
		//setCharAt
		sbd1.setCharAt(0,'v');
		System.out.println(sbd1);
		//setLength đặt lại length cho stringbuider
		
		sbd1.setLength(5);
		System.out.println(sbd1);
		//reverser: đảo ngược nội dung chuỗi
		sbd1.reverse();
		//toString :  chuyển thành String thường
		sbd1.toString();
		System.out.println(sbd1);
		
		
		
	}

	
	

	//hàm random số chẵn trong phạm vi 1000
	private static int getNumber(int i) {
		int num;
		Random ran= new Random();
		do {
			num=ran.nextInt(1000);
		} while (num%2!=0);
		return 0;
	}
}
