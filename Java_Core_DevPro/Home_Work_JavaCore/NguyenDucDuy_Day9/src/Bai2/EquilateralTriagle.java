package Bai2;

public class EquilateralTriagle extends Shape  {
	int a;
	int x=100,y=100;
	public EquilateralTriagle(int a) {
		super();
		this.a = a;
	}
	@Override
	public void moveUp() {
		this.y-=20;
		System.out.println("TRIANGLE UP:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveRight() {
		this.x+=20;
		System.out.println("TRIANGLE RIGHT:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveDown() {
		this.y+=20;
		System.out.println("TRIANGLE DOWN:[x="+this.x+",y="+this.y+"]");
	}

	@Override
	public void moveLeft() {
		this.x-=20;
		System.out.println("TRIANGLE LEFT:[x="+this.x+",y="+this.y+"]");
	}
	@Override
	public float getArea() {
		return (float) (a*a*(Math.sqrt(3)/4));
	}
	@Override
	public float getPerimeter() {
		return 3*a;
	}
	@Override
	public String getName() {
		return "Tam giác đều ";
	}

}
