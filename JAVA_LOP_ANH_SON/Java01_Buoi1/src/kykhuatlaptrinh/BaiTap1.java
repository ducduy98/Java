/*

 * Tên pakage sẽ ko được bắt đầu bằng chữ số, trong tên thì ko được chứa khoảng trắng,
 * không trùng với từ khóa của java, ko được chứa kí tự đặc biệt
 *
 com.nguyenducduy .service ===> Lỗi
 NGUYÊN TẮC ĐẶT TÊN:
 * Tên của package thì tất cả đều phải viết thường và ngăn cách nhau bởi dấu chấm nếu có nhiều từ
  VD: com.nguyenducduy.service
 *
 Không được đặt tên class vi phạm các quy định như package
 Nguyên tắc đặt tên class
 1.Tên class là 1 danh từ
 2.Tên class viết hoa chữ cái dầu của các từ
    VD: UserService...

 Tên của biến và phương thức: không được đặt tên vi phạm quy định như package
 Nguyên tắc dặt tên biến và phương thức:
    1.Tên biến và phương thức phải là 1 động từ
    2.Tên biến và phương thức bắt đầu bằng chữ thường nhưng nếu tên đó có từ 2 từ trở lên thì
     từ từ thứ 2 phải viết hoa chữ cái đầu
     VD: userName;
 */

package kykhuatlaptrinh;

import java.util.Scanner;

public class BaiTap1 {
    /*
    * Khi giải quyết 1 bài toán cần xác định input và output
    *
    * VD: Nhập vào 2 số a và b.TÍnh tổng 2 số a và b.
    * ==>Input: a,b
    * ==Output: tổng 2 số a và b
    * */
    public static void main(String[]args){
        /*
        * Các kiểu dữ liệu nguyên thủy trong java
        * 1.byte=>  1byte = 8bit
            * ==>Miền giá trị nằm trong[-128 ... 0... 127]
            * Có tính chất xoay vòng:
            * VD byte x=127; x=x+1;===> In ra x=-128
            * VD byte a=-128; a=a-1;===> In ra a=127
        * 2.short 1 short = 2byte =8bit
            * ==>Miền giá trị nằm trong[-2^15 ... 0... 2^15-1]
        * 3.int 1 int = 4byte=16 bit
            ** ==>Miền giá trị nằm trong[-128 ... 0... 127]
        * 4.long 1long=8byte=32bit
            *
            * Nếu:
            * byte x=126;
            * long b=320;
            * b=x; ===> gán x cho b, ta thu được b=126;
            * nhưng nếu gán x=b thì cần chú ý sẽ bị tràn và mất mát dữ liệu
        * 5.float :số thực 1 float= 4byte
        * 6.double :số thực 1 double= 8byte
        * 7.char : kiểu kí tự 1 char= 1 byte(ASCII)
        * 8.boolean : kiểu đúng sai true và false
        *

        * */
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào giá trị biến a: ");
        a=sc.nextInt();
        System.out.println("Nhập vào giá trị biến b: ");
        b=sc.nextInt();

        int tong=a+b;
        System.out.println("Tong a và b: "+ tong);

        int hieu=a-b;
        System.out.println("Hiệu a và b: "+ hieu);

        int tich=a*b;
        System.out.println("Tích a và b: "+ tich);

        float thuong= (float)a/b;   // Hoặc::    float thuong= (a*1.0f)/b;
        System.out.println("Thương a và b: "+ thuong);

        /*
        * Tiền tố: ++a; --b;
        * Hậu tố: a++;b--;
        */


        /*
        * Toán tử 3 ngôi:
        * (biểu thức 1) ? (biểu thức 2) : (biểu thức 3)
        * ==>> biểu thức 1: bbiểu thức điều kiện ==> true hoặc false.
        *
        *
        * */
        int max=(a > b) ? a:  b;

        System.out.println("Max a, b là: "+max);

        /*
        * Toán tử logic: &&, ||,!,==,!=
        * */
        if(a==0){
            if(b==0){
                System.out.println("PT vô số nghiệm");
            }
            else System.out.println("Pt vô nghiệm");
        }
        else{
            System.out.println("PT có nghiệm là:"+(float)-b/a);
        }
    }






}
