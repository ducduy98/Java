package Shape;

import devpro.Moveable;

public class circle implements Moveable{
	int x,y;
	public circle(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void moveUp(int distance) {
		y-=(int)(distance*0.7f);
		System.out.println(this);
	}

	@Override
	public void moveDown(int distance) {
		y+=(int)(distance*0.7f);
		System.out.println(this);
	}

	@Override
	public void moveLeft(int distance) {
		x-=(int)(distance*0.7f);
		System.out.println(this);
	}

	@Override
	public void moveRight(int distance) {
		x+=(int)(distance*0.7f);
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "circle [x=" + x + ", y=" + y + "]";
	}

}
