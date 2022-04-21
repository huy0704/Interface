package advance.dev.models;

public class Circle extends Shape {
	public double bk;
	

	public Circle(double bk) {
		super();
		this.bk = bk;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * bk;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * bk * bk;
	}
	

}
