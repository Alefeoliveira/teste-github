import java.util.Locale;
import java.util.Scanner;

public class OperadorCumulativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min;
		double conta = 50.0;
		
		min = sc.nextInt();
		
		if(min > 100) {
			conta += (min - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta R$ %.2f%n", conta);
		
		sc.close();

	}

}
