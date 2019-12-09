package CD;

import java.util.Scanner;

public class CD {
    private int id;
    private String name;
    private String singer;
    private int numberSong;
    private double price;

    public CD(int id, String name, String singer, int numberSong, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numberSong = numberSong;
        this.price = price;
    }

    public CD() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberSong() {
        return numberSong;
    }

    public void setNumberSong(int numberSong) {
        this.numberSong = numberSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", numberSong=" + numberSong +
                ", price=" + price +
                '}';
    }
    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap ma CD");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten CD:");
        this.name=sc.nextLine();
        System.out.println("Ten ca si:");
        this.singer=sc.nextLine();
        System.out.println("Nhap so bai hat:");
        this.numberSong=sc.nextInt();
        System.out.println("Nhap gia thanh:");
        this.price=sc.nextDouble();
    }
}
