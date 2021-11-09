package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areax = x.area(); 
		double areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle X area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("Larger area: x");
		} else {
			System.out.println("Larger area: y");

		}

		sc.close();


	}

}