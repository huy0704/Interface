package advance.dev.models;

public abstract class Shape {

	
		public abstract double chuVi();
		public abstract double dienTich();
		
		public String toString() {
			return String.format("Circle cv:%.2f - dt:%.2f",chuVi(),dienTich());
			
		}
	

}