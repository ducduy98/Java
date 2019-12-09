package devpro;

public class Circle extends Shape{
	float r;
	
	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public float tinhDienTich() {
		return (float) (Math.PI*r*r);
	}

}
