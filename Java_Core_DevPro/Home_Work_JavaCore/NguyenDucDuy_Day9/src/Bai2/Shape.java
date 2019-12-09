package Bai2;

public  abstract class Shape implements Moveable,MeasureAble {

	public abstract void moveUp();

	public abstract void moveRight() ;

	public abstract void moveDown();

	public abstract void moveLeft();
	
	public abstract float getArea();

	public abstract float getPerimeter();

	public abstract String getName();

}
