package advance.dev.models;

public class Rectangle extends Shape  {
	public double a;
	public double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (a+b);
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return a * b;
	}

}