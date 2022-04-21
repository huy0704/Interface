package advance.dev;
import java.util.Scanner;

import advance.dev.dao.Ishape;
import advance.dev.dao.Shapemannager;
import advance.dev.models.Circle;
import advance.dev.models.Rectangle;
import advance.dev.models.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ishape shapemanger = new Shapemannager();
		System.out.println("Nhap vao 5 hinh");
		System.out.println("nhap vao 2 hinh tron ");
		for (int i = 0; i < 2; i++) {
			System.out.println("nhap ban kinh");
			double bk = sc.nextDouble();
			Circle cr = new Circle(bk);
			sc.nextLine();
			shapemanger.add(new Circle(bk));
			cr.chuVi();
			cr.dienTich();
			
		System.out.println("nhap a");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap b ");
		double b = sc .nextDouble();
		sc.nextLine();
		shapemanger.add(new Rectangle(a, b ));
		Rectangle re = new Rectangle(a, b);
		re.chuVi();
		re.dienTich();
		
		
			
		}
		
		System.out.println("nhap vao  1 hinh tam giac");
		Triangle tr = new Triangle(10,13,15);
		System.out.println("nhap a");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap b");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap c");
		double c = sc.nextDouble();
		sc.nextLine();
		tr.chuVi();
		tr.dienTich();
		shapemanger.add(new Triangle(a, b, c ));
	}

}