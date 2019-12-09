package Bai1;

public class Cylinder {
	float r;
	float h;
	float pi=(float) Math.PI;
//	public Cylinder (float banKinh,float chieuCao) {
//		this.r=banKinh;
//		this.h=chieuCao;
//	}
	public float dienTichDay() {
		return pi*this.r*this.r;
	}
	public float dienTichToanPhan() {
			return 2*pi*this.r*(this.r+this.h);
	}
	public float theTich() {
		return pi*this.r*this.r*this.h;
	}
	public void showInfo() {
		System.out.println("Thông tin::");
		System.out.println("Chiều cao :"+this.h);
		System.out.println("Bán kính :"+this.r);
		System.out.println("Diện tích toàn phần: "+this.dienTichToanPhan());
		System.out.println("Thể tích: "+this.theTich());
	}
}
