package HANGTHUCPHAM;

import java.time.LocalDate;

public class testHangThucPham {

    public static void main(String[] args) {
        HangThucPham hangThucPham=new HangThucPham("H01","Banh",123.332, LocalDate.parse("2019-10-31"), LocalDate.parse("2021-10-31"));
        System.out.println(hangThucPham.toString());
        if (hangThucPham.kiemTraHSD()){
            System.out.println("Con HSD");
        }else System.out.println("HetHan");
    }

}
