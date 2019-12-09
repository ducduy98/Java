package devpro;

public class Triangle extends Shape{
	int a,b,c;
	
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		float p=(a+b+c)/2;
		return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}



}
