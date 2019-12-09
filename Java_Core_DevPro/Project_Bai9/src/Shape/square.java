package Shape;

import devpro.Moveable;
import interfaces.DataCallback;

public class square implements Moveable ,DataCallback{
	int x,y;
	public square(int x,int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public void moveUp(int distance) {
		y-=distance;		
		System.out.println(this);
	}

	@Override
	public void moveDown(int distance) {
		y+=distance;	
		System.out.println(this);
	}

	@Override
	public void moveLeft(int distance) {
		x-=distance;
		System.out.println(this);
	}

	@Override
	public void moveRight(int distance) {
		x+=distance;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "square [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void onDataDone(String s) {
		System.out.println("Square: có dữ liệu :"+s);
		
	}
 

}
