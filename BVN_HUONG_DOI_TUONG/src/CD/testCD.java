package CD;

import java.util.Scanner;

public class testCD {
    public static void main(String[] args) {
        CDManager manager= new CDManager();
        CD a=new CD();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong CD:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            manager.AddOne();
        }
        manager.display();
    }
}
