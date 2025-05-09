package application;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + rectangle.areaRectangle());
		System.out.println("PERIMETER = " + rectangle.perimeterRectangle());
		System.out.println("DIAGONAL = " + rectangle.diagonalRectangle());
		
		sc.close();
	}

}
