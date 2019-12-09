package devpro;

public class main {
	public static void main(String[] args) {
		int a=9;
		int b=2;
		int c;
		
//		System.out.println();	
//		//phép chia muốn chia hết thì một trong 2 thành phần tham gia chia là số thực
//		float f=5/2;
//		System.out.println(f);
//		f=5f/2;
//		System.out.println(f);
//		float c=(float)a/b;
//		System.out.println(c);
////		
//		//Toán tử 1 ngôi:
//		/*
//		 * +- dấu âm dương
//		 * ++ tăng 1 đơn  vị
//		 * -- giảm 1 đơn vị
//		 */
//		a++;
//		System.out.println(a);
//		
//		a--;
//		System.out.println(a);
//		boolean bl=true;
//		bl=!bl;
//		System.out.println(bl);
		
		//3 Toán tử:
		//dùng dể biểu diễn mqh giữa các toán hạng
		// ==ss bằng
		// != khác
		//<  ,  >,  >=,  <=
		boolean kq=a>0;
		System.out.println(kq);
		// $ Toán tử logic:
		//&&  phép Và 
		//|| phép Hoặc
		//dùng để nối các biểu thức điều kiện đơn vào vơi nhau để tạo thành các điều kiện tổng thể
		kq= a>=0 && a!=2;
		System.out.println(kq);
		
		// Toán tử 3 ngôi(?:): Nhận vào 3 toan hạng(a?b:c)
		int diem=9;
		String xeploai= diem>8?"Tốt":"Khá";
		//gồm 3 toán hạng:
		//toán hạng thứ nhất: là biểu thức điều kiện đứng trước dấu ?
		//toán hạng thứ hai: đứng sau dấu ? (kiểu bất kì)
		//toán hạng thứ 3: đứng sau dấu : (kiểu bất kì)
		//ngăn cach toán hạng thứ 2 và 3 là dấu :   
		//Kiểu của toán hạng 2 và 3 phải cùng kiểu với biến ở bên trái dấu bằng
		System.out.println(xeploai);
		int k=a>5 ? 5: a< 0 ? 0 : a;
		System.out.println(k);
		
		//6 toán tử  thao tác Bit
		a= 60; //  0011 1100
		b=13;  //  0000 1101
		c=a&b; //  0000 1100 // nhân bit
		System.out.println(c);
		//hoặc bit --------tất cả ra 1 trừ 0 vs 0
		a= 60;		 //  0011 1100
		b=13; 		 //  0000 1101
		int d= a|b;  //  0011 1101==>61
		System.out.println(d);
		// cộng modul ^ XOR-----giống nhau thì ra 0, khác nhau thì ra 1
		a= 60;		 //  0011 1100
		b=13; 		 //  0000 1101
		int e= a^b;  //  0011 0001==>49
		System.out.println(e);
		
		// quay Bit-- đảo 0 thành 1 và 1 thành 0
		a= 60;		 //  0011 1100
		int f=~a; 	 // 1100 0011 (-61  dấu âm mã bù 2)
		System.out.println(f);
		
		//phép dịch bit----xê dịch vị trí của bit hiện tại sang trái hoặc phải n vị trí
		// >> dịch phải
		// << dịch trái
		//ứng dụng trong phép nhân (hoặc chia) cho các số dạng 2 mũ n(2,4,6,8,16,32,64...)
		int g=a>>2; //a dịch phải 2 bit
		System.out.println(g);
		int h=a<<2; //a dịch trái 2 bit
		System.out.println(h);
		//dịch phải n bit thì chia cho 2 mũ n
		//dịch trái n bit thì nhân cho 2 mũ n
		a=1;
		b=2;
		c=3;
		int z= max(a,b,c);
		System.out.println(max(a,b,c));
		System.out.println(test(b));
		System.out.println(gt(3));
	}
	//Định nghĩa hàm:
	//hàm là cách đặt tên cho 1 khối code thực hiện 1 công việc nào đó, khi chúng ta muốn dùng lại nhiều lần thì thực hiện gọi lại hàm đó, 
	//
	//Hàm được viết trong thân class
	//hàm phải được hcir rõ kiểu dl trả về
	//trong hàm phải có lệnh return theo đúng kiểu của hàm đó
	 static int max(int a, int b, int c) {
		int  kq=a>b ? a:b;
		kq=kq>c ? kq:c;
		return kq;
	}
	 static boolean test(int a)
	 {
		 boolean kq=a%2==0? true:false;
		 return kq;
	 }
	 static int gt(int a) {
		 if(a==0) return 1;
		 return a*gt(a-1);
	 }
	 //tham chiếu-tham trị
	 //tham chiếu: giá trị sẽ được copy và truyền đi
	 //tham trị : địa chỉ sẽ được copy và truyền đi
	 
	 //phép gán:
	 //tất cả các kiểu dl nguyên thủy đều là tham trị
	 //các kiểu dl cấu trúc là gán tham chiếu(mảng, Object, Class)
	 
	 
	 //Truyền tham số vào hàm:
	 //đối với các kiểu nguyên thủy thì giá trị sẽ được copy và đưa vào trong hàm
	 //với các biến kiểu cấu trúc, địa chỉ được copy và đưa vào trong hàm
	 
	 //mảng: kiểu tham chiếu(các tahy đổi khi truyền )
	 
}
