import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 15.5678;
		String nome = "Maria";
		int idade = 26;
		double renda = 2650.50;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println(y);
		System.out.printf("Resultado = %.2f Metros%n", x);
		System.out.println("Resultado = "+x+" Metros");
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome,idade,renda);
		

	}

}
