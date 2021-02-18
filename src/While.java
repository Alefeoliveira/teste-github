import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x <= 100) {
			
			x++;
			
			System.out.println(x);
			
		}
		
		
		
		
		sc.close();

	}

}
