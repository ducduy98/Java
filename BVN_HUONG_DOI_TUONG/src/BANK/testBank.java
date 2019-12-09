package BANK;

public class testBank {
    public static void main(String[] args) {
        Account a =new Account(11,"DUY",10000);
        Account b=new Account(22,"HUY");
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.Nap_tien();
        a.SendMoney(b,1000);


    }
}
