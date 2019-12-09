package BANK;

import java.util.Scanner;

public class Account {
    static final double LAI_SUAT = 0.035;
    public static final double laiSuat = 0.035;
    private long accountID;
    private String accountName;
    private double money;

    public Account(long accountID, String accountName, double money) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.money = money;
    }


    public Account() {
    }

    public Account(long accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.money = 50;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return String.format("ID=" + this.accountID + ", AccName=" + this.accountName + ", $$=" + this.money);
    }

    public void Nap_tien() {
        double soTien;
        do {
            System.out.println("So tien nap vao tai khoan : ID="+this.accountID);
            soTien = new Scanner(System.in).nextDouble();
        } while (soTien < 0);
        this.money += soTien;
        System.out.println("Nap thanh cong!!");
        System.out.println(this.toString());
        System.out.println("*****************************************");
    }

    public void Rut(){
        double soTien;
        do {
            System.out.println("Nhap so tien muon rut:");
            soTien = new Scanner(System.in).nextDouble();
        }while (soTien<0||soTien>this.money);
        this.money-=soTien;
    }
    public void DaoHan(){
        this.money+=this.money*LAI_SUAT;
        System.out.println(this.toString());
    }
    public void SendMoney(Account b,double soTien){
        System.out.println(this.toString());
        System.out.println(b.toString());
        System.out.println("Chuyển từ "+this.getAccountName()+"toi "+b.getAccountName()
        +soTien);
        this.money-=soTien;
        b.money+=soTien;
        System.out.println(this.toString());
        System.out.println(b.toString());
    }

}
