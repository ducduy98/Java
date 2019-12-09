package devpro;

public class Square extends Shape{
	int a;

	public Square(int a) {
		super();
		this.a = a;
	}

	@Override
	public float tinhDienTich() {
		return a*a;
	}


	
}
