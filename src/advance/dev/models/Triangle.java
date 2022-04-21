package advance.dev.models;

public class Triangle extends Shape {
	public double a;
	public double b;
	public double c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi();
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	

}