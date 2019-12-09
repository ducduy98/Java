package Bai2;

public class Circle extends Shape {
	int r;
	int x=100,y=100;

	public Circle(int r) {
		super();
		this.r = r;
	}
	@Override
	public void moveUp() {
		this.y-=15;
		System.out.println("CIRCLE UP:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveRight() {
		this.x+=15;
		System.out.println("CIRCLE RIGHT:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveDown() {
		this.y+=15;
		System.out.println("CIRCLE DOWN:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveLeft() {
		this.x-=15;
		System.out.println("CIRCLE LEFT:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public float getArea() {
		return (float) (r*r*Math.PI);
	}

	@Override
	public float getPerimeter() {
		return (float) (2*Math.PI*r);
	}

	@Override
	public String getName() {
		return "Hình Tròn";
	}
}
