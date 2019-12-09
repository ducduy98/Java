package Bai2;

public class Square extends Shape {
	int a;
	int x=100,y=100;
	public Square(int a) {
		super();
		this.a = a;
	}
	
	@Override
	public void moveUp() {
		this.y-=10;
		System.out.println("SQUARE UP:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveRight() {
		this.x+=10;
		System.out.println("SQUARE RIGHT:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveDown() {
		this.y+=10;
		System.out.println("SQUARE DOWN:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveLeft() {
		this.x-=10;
		System.out.println("SQUARE LEFT:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public float getArea() {
		return a*a;
	}

	@Override
	public float getPerimeter() {
		return 4*a;
	}

	@Override
	public String getName() {
		return  "Hình vuông";
	}
	
}
