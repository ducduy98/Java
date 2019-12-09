package devpro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Predicate;

public class main {
	public static void main(String[] args) {
		//Collection: chỉ lưu được kiểu Object
		
		//List
		
		//ArrayList
		ArrayList<String> dsTen=new ArrayList<>();
		//thêm các phần tử vào 
		dsTen.add("Nguyễn Văn A");
		dsTen.add("Nguyễn Văn D");
		dsTen.add("Nguyễn Văn B");
		dsTen.add("Lê Văn H");
		int size=dsTen.size();//số lượng pt
		System.out.println("Size= "+size);
		
		//+có thể thêm bao nhiêu tùy thích
		//mảng lõi sẽ được cấp phát lại mỗi khi đầy
		
		//khi làm việc với các kiểu dl nguyên thủy thì ta phải làm việc với các wrapper class của nó
		//int==> Integer
		//float==> Float
		//double==>Double
		//byte==>Byte
		//short==> Short
		//long==>Long
		//char==>Character
		//boolean==>Boolean
		
		ArrayList<Integer> dsSoNguyen=new ArrayList<>();
		ArrayList<Character> dsKyTu=new ArrayList<>();
		
		Integer a=new Integer(2);// a là object 
		Integer b=3;//b là object
		int c=3;//biến nguyên thủy
		b.byteValue();
		
		dsSoNguyen.add(3);
		dsSoNguyen.add(5);
		dsKyTu.add('c');
		dsKyTu.add('v');
		
		//xóa phần tử
		dsTen.remove(0);//xóa theo index(pt đầu trong ds)
		//duyệt các pt trong arraylist
		//dùng vòng for
		for (int i = 0; i < dsTen.size(); i++) {
			String ten=dsTen.get(i);
			System.out.println(ten);
		}
		System.out.println("=============");
		//duyệt bằng foreach
		for(String ten:dsTen) {
			System.out.println(ten);
		}
		System.out.println("=============");
		//duyệt số nguyên
//		for(Integer i:dsSoNguyen) {
//			System.out.println(i);
//		}
		
		//
		
		//Xóa theo tham chiếu địa chỉ của Object
		//truyền Object cần xóa vào trong hàm remove()
		a=4;
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(a);
		dsSoNguyen.add(b);
		System.out.println("DS số nguyên trc khi xóa");
		for(Integer i:dsSoNguyen) {
			System.out.println(i);
		}
		dsSoNguyen.remove(a);//xóa theo object
		System.out.println("DS số nguyên sau khi xóa");
		for(Integer i:dsSoNguyen) {
			System.out.println(i);
		}
		
		//removeall-xóa pt theo 1 ds con
		//truyền vào 1 ds con thì các pt mà thuôc ds con sẽ bị xóa đi khỏi ds to
		
		dsSoNguyen.add(1);
		dsSoNguyen.add(3);
		dsSoNguyen.add(5);
		dsSoNguyen.add(9);
		System.out.println("DS số nguyên trc khi xóa");
		for(Integer i:dsSoNguyen) {
			System.out.println(i);
		}
		ArrayList<Integer>dsCon=new ArrayList<Integer>();
		dsCon.add(5);
		dsCon.add(7);
		dsCon.add(9);
		dsSoNguyen.removeAll(dsCon);
		System.out.println("DS số nguyên sau khi xóa");
		for(Integer i:dsSoNguyen) {
			System.out.println(i);
		}
		//addAll--nối 2 ds lại thành 1 ds lớn
		dsSoNguyen.addAll(dsCon);
		System.out.println("DS số nguyên sau khi Add dscon");
		for(Integer i:dsSoNguyen) {
			System.out.println(i);
		}
		dsSoNguyen.clear();//xóa toàn bộ các pt, đưa ds trở về rỗng
		dsSoNguyen.isEmpty();//true nếu là ds rỗng
		dsSoNguyen.contains(3);//kiểm tra xem trong ds có chưa 1 pt nào đó hay ko
		dsSoNguyen.contains(dsCon);//ktra xem trong dsSoNguyen có chứa tất cả các pt nằm trong dsCon hay ko
		dsSoNguyen.indexOf(a);//lấy index của object a trong ds
		dsSoNguyen.lastIndexOf(b);//lấy index của b trong ds, tìm theo chiều từ cuối về đầu
		//===========================================================
		
		
		
		//===========================================================
		//CÁC CÔNG VIỆC VS DS: thêm , sửa xóa, sắp xếp, Trộn
		//+Thêm:  dùng hàm add
				//có thể add vào vị trí tùy chọn
				dsSoNguyen.add(0, 100);//chèn số 100 vào vị trí thứ 1
				dsSoNguyen.addAll(0,dsCon);//chèn dscon vào đầu dsSoNguyen
		//+Sửa: lấy ra 1 pt và sửa nội dung
				System.out.println("DS số nguyên trc khi sửa:");
				for(Integer i:dsSoNguyen) {
					System.out.println(i);
				}
				//lấy pt cuối ds: 
				//Integer lastElement=dsSoNguyen.get(dsSoNguyen.size()-1);
				
				//sửa
				dsSoNguyen.set(dsSoNguyen.size()-1, 200);
				System.out.println("DS số nguyên sau khi sửa:");
				for(Integer i:dsSoNguyen) {
					System.out.println(i);
				}
		//++Xóa: dùng remove,removeall
		//+Sắp xếp: dùng hàm short
				dsSoNguyen.clear();
				Random ran=new Random();
				for (int i = 0; i < 30; i++) {
					dsSoNguyen.add(ran.nextInt(100));
				}
				System.out.println("DS số nguyên trước khi sắp xếp: ");
				for(Integer i:dsSoNguyen)
				{
					System.out.println(i);
				}
				//tạo comparator đế sắp xếp
				//anonymous class
				Comparator<Integer> comparator=new Comparator<Integer>() {

					@Override
					public int compare(Integer i1, Integer i2) {
						return i1>i2 ?  1:-1;//nếu i1>i2 thì return 1, ngc lại return -1
					}			
				};//mô tả tiêu chí sắp xếp.
				
				//sắp xếp dsSoNguyen
				dsSoNguyen.sort(comparator);
				System.out.println("DS số nguyên sau khi sắp xếp: ");
				for(Integer i:dsSoNguyen)
				{
					System.out.println(i);
				}
				
				//sắp xếp dsTen theo ABC
				dsTen.clear();
				dsTen.add("Phạm Văn Tuấn");
				dsTen.add("Lê Hồng Anh");
				dsTen.add("Trần Văn Bảng");
				dsTen.add("Nguyễn Kiều My");
				dsTen.add("Vũ Văn Hoàn");
				
				Comparator<String> comp =new Comparator<String>() {
					
					@Override
					public int compare(String name1, String name2) {
						//return name1.compareTo(name2);
						String shortName1=tachTen(name1);
						String shortName2=tachTen(name2);
						return shortName1.compareTo(shortName2);
					}

					private String tachTen(String fullName) {
						int id=fullName.lastIndexOf(" ");
						String shortName=fullName.substring(id+1);
						return shortName;
					}
				};
				dsTen.sort(comp);
				System.out.println("DS tên sau khi sắp xếp");
				for(String name: dsTen)
				{
					System.out.println(name);
				}
		//+Trộn danh sách: dùng  hàm Shufftle
				Collections.shuffle(dsSoNguyen);//trộn ds số nguyên
				System.out.println("DS số nguyên sau khi trộn");
				for(Integer i:dsSoNguyen) {
					System.out.println(i);
				}
		//+Tìm kiếm: ktra ds có chứa phần tử cần tìm hay ko
				boolean isExist=dsSoNguyen.contains(15);
				if(isExist) {
					int id=dsSoNguyen.indexOf(15);
					System.out.println("Số 15 nằm ở index"+id);
				}else {
					System.out.println("ko có số 15 trong ds");
				}
				
				//Lấy index của tất cả các số 15 trong ds
				size=dsSoNguyen.size();
				if(isExist) {
					System.out.println("Index của các số 15:");
					for (int i = 0; i < size; i++) {						
						if(dsSoNguyen.get(i)==15) {
							System.out.println(i);
						}
					}
				}else {
					System.out.println("ko có số 15 trong ds");
				}
				//***************************************//HẾT PHẦN ARRAYLIST
				
				
				//LinkedList--ds liên kết;
				//Khác Arraylist: cơ chế lưu trữ
				//khác: tốc độ truy cập ngẫu nhiên
				//ko cần phải cấp phát lại
				
				LinkedList<String> listStr=new LinkedList<>();
				listStr.add("Nguyễn Thị Mai");
				listStr.add("Lê Văn Tám");
				//listStr.addFirst(e);-thêm vào đầu
				//listStr.addLast(e);-- thêm vào cuối
				
				//lấy phần tử ra theo index
				listStr.get(1);//lấy pt ở index 1
				listStr.getFirst(); //lấy đầu
				listStr.getLast();//lấy cuối
				
				//***************************************//
				
				//VECTOR
				//giống arraylist : sd mảng để lưu trữ
				//khác arraylist: tốc độ tăng trưởng 200%(150% đối với arraylist)
				
				Vector<String> vtStr=new Vector<String>();
				//các hàm giống array
				
				//sd kiểu chung là List
				List<String> lst=new ArrayList<>();
				
				lst=new Vector<String>();
				
				//***************************************//
				//QUEUE-HÀNG ĐỢI
				
				Queue<String> myQueue=new LinkedList<String>();
				myQueue.add("Some One");//thêm pt vào cuối hàng
				myQueue.poll();//lấy 1 pt ở đầu hàng  ra khỏi hàng
				myQueue.peek();//xem pt ở đầu hàng.có thể lấy được pt đó nhưng ko bị xóa khỏi hàng
				
				//DEQUE
				Deque<String> deque=new LinkedList<String>();
				//stack(LIFO  last in first out)
				deque.push("element");//đẩy pt vào trong stack
				deque.pop();//lấy pt trên cùng ra khỏi stack
				deque.isEmpty();//kiểm tra xem stack có rỗng ko
				deque.peek();//xem pt trên cùng của stack
				//sd như hàng đợi
				deque.addFirst("e");//add vào đầu(front)
				deque.addLast("end");//add vào cuối(end)
				deque.pollFirst();//lấy ở đầu trước(front)
				deque.pollLast();//lấy ở đầu sau(end)
				
				//SET- tập hợp
				
				String seed ="AAAAAAAAAABBCCDEFGH123456";
				ArrayList<String> listLetter=new ArrayList<String>();
				for (int i = 0; i <20; i++) {
					String e=getLetter(seed);
					listLetter.add(e);
				}
				System.out.println("DS cac chu cai: ");
				printList(listLetter);
				
				//sử dụng set để lọc các pt trùng nhau
				Set<String> mySet =new HashSet<String>() ;
				for(String s:listLetter ) {
					mySet.add(s);
				}
				//in set
				System.out.println("các pt ko trùng nhau: ");
				for(String string: mySet) {
					System.out.println(string);
				}
				
				//SORTED SET
				SortedSet<String> sortedSet=new TreeSet<String>();
				sortedSet.comparator();
				
				
				//bổ sung ---COLLECTION 
				//removeIf--xóa các pt trong collection dựa theo 1 tiêu chí cho sẵn
				//VD: xóa các số ra khỏi listLetter 
				Predicate<String> filter=new Predicate<String>() {
					
					@Override
					public boolean test(String t) {
						
						return isNumber(t);
					}
				};
				listLetter.removeIf(filter);
				System.out.println("DS sau khi xóa số: ");
				printList(listLetter);
				
				
				//MAP-TẬP HỢP ÁNH XẠ
				//CÁC VD:
				//mã sinh viên(key): -value: tên Sinh viên
				//số--tên tháng
				//tên tháng tiếng việt--tên tháng tiếng anh
				Map<Integer, String> myMap=new HashMap<Integer, String>();
				myMap.put(1, "Jan");
				myMap.put(2, "Feb");
				myMap.put(3, "Mar");
				myMap.put(4, "Apr");
				myMap.put(5, "May");
				myMap.put(6, "Jun");
				myMap.put(7, "Jul");
				myMap.put(8, "Aug");
				myMap.put(9, "Sep");
				//lấy va;ue bằng cách truyền vào key
				myMap.get(5);//May
				myMap.get(10);//null
				
				//duyệt qua toàn bộ map
				//lấy keySet
				Set<Integer> keySet=myMap.keySet();
				for(Integer i:keySet) {
					System.out.println(myMap.get(i));
				}
				
				//vd map từ tiensg việt==> tiếng anh
				Map<String, String> dict= new HashMap<String, String>();
				dict.put("hello", "chào");
				dict.put("like", "thích");
				dict.put("girl", "con gái");
				
	}//endmain
	public static <T> void printList(List<T> list) {
		for(T o:list) {
			System.out.println(o);
		}
	}
	
	//123456=> true
	//123sdj=>false
	public static boolean isNumber(String s) {
		boolean res=true;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			res=res && (ch>=48 && ch<=57);
		}
		return res;
	}
	static Random ran=new Random();
	private static String getLetter(String seed) {
		int index=ran.nextInt(seed.length());
		return seed.substring(index,index+1);
	}
}
