package Bai2;

public class main {
	public static void main(String[] args){
		Shape sq = new Square(5);
		Shape tr = new EquilateralTriagle(3);
		Shape ci = new Circle(4);
		moveObject(sq);
		moveObject(tr);
		moveObject(ci);
		measure(sq);
		measure(tr);
		measure(ci);
	}

	public static void moveObject(Moveable m){
		m.moveUp();
		m.moveRight();
		m.moveDown();
		m.moveLeft();
	}

	public static void measure(MeasureAble m){
		float area = m.getArea();
		float perimeter =  m.getPerimeter();
		String name = m.getName();
		System.out.println(name+" - area:"+area +", perimeter :"+perimeter);
	}
}
