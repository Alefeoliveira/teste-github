import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Vector2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		Products[] vect = new Products[n];
		double sum = 0.0;
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.println("AVG price: " + avg);
		
		
		
		sc.close();
	}

}
