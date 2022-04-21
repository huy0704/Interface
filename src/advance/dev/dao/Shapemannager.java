package advance.dev.dao;
import advance.dev.models.Shape;
public class Shapemannager implements Ishape {
		private Shape shapes[] =new Shape[5];
		private int index = 0;
		
		public void add(Shape shape) {
			if(index >= 5) index = 0;
			shapes[index] = shape;
			index++;
			
		}
		public void print() {
			for(Shape shape : shapes) {
				System.out.println(shape);
			}
		}
		

}