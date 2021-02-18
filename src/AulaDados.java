import java.util.Locale;
import java.util.Scanner;

public class AulaDados {

	public static void main(String[] args) {
		
		//	String x;
		//	int y;
		
		
		char z;
		double x = 2.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//x = sc.next();
		
		//y = sc.nextInt();
		
		z = sc.next().charAt(0);
		
		//x= sc.nextDouble();
		
		//System.out.println(x);
		System.out.println(z);
		//System.out.println(y);
		
		sc.close();
		
	}

}
