import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] al = new Aluguel[10];

		System.out.println("Quantos quartos para alugar ? ");
		int quartos = sc.nextInt();

		for (int i = 0; i < quartos; i++) {

			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();

			System.out.println("Nome do estudante: ");
			String nome = sc.nextLine();
			System.out.println("Email do estudante: ");
			String email = sc.nextLine();
			System.out.println("Numero do quarto: ");
			int quartoalugado = sc.nextInt();
			al[quartoalugado] = new Aluguel(nome, email);

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (al[i] != null) {
				System.out.println(i + ": " + al[i]);
			}
		}

		sc.close();
	}

}
