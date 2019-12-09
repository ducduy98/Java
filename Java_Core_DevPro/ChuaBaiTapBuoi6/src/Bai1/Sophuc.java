package Bai1;

import java.util.Random;

public class Sophuc {
	float r,i;
	public Sophuc(){
		this.r=0;
		this.i=0;
	}
	public Sophuc(int thuc,int ao) {
		this.r=thuc;
		this.i=ao;
	}
	public float getPhanthuc() {
		return r;		
	}
	public float getPhanao() {
		return i;		
	}
	public Sophuc cong(Sophuc b) {
		Sophuc c=new Sophuc();
		c.r=this.r+b.r;
		c.i=this.i+b.i;
		return c;
		
	}
	public Sophuc tru(Sophuc b) {
		Sophuc c=new Sophuc();
		c.r=this.r-b.r;
		c.i=this.i-b.i;
		return c;		
	}
	public Sophuc nhan(Sophuc b) {
		Sophuc c=new Sophuc();
		c.r=this.r*b.r-this.i*b.i;
		c.i=this.r*b.i+this.i*b.r;
		return c;		
	}
	public Sophuc chia(Sophuc b) {
		Sophuc c=new Sophuc();
		c.r=(this.r*b.r+this.i*b.i)/(b.r*b.r+b.i*b.i);
		c.i=(b.r*this.i+this.r*b.i)/(b.r*b.r+b.i*b.i);
		return c;		
	}
	public String toString()
	{
		if(this.r!=0&&this.i>=0) {
			return String.format("[%.1f+%.1fi]", r,i);
		}else if(this.r!=0&&this.i<0) {
			return String.format("[%.1f-%.1fi]", r,-i);
		}else if(this.r==0) {
			return String.format("[%.1fi]",i);
		}else {
			return String.format("[%.1fi]",i);
		}
	}
	public static Sophuc getRandomCmp() {
		Random ran= new Random();
		int r=ran.nextInt(21)-10; //ran.nextInt(21)==>lay random tu 0-20
		int i=ran.nextInt(21)-10;
		return new Sophuc(r,i);
	}
}
