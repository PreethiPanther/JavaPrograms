import java.util.Scanner;

public class FactoryPatternobject {
	public static void main(String[] args) {
		ShapeFactory shape = new ShapeFactory();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shape");
		String shapetype = sc.nextLine();
		//Shape s1= shape.getShape("CIRCLE");
		//s1.display();
		
		Shape s2= shape.getShape(shapetype);
		s2.display();
		
		//Shape s3= shape.getShape("RECTANGLE");
		//s3.display();
	}
}
