package devpro;

public class Retangle extends Shape{
	int a,b;
	
	public Retangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public float tinhDienTich() {
	
		return (float) a*b;
	}

}
