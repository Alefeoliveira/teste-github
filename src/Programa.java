import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	
		int higher = max(a,b,c);
		
		showResult(higher);
		
			
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		
		int result;
			
			if(a > b && a > c) {
				result = a;
			}else if(b > c) {
				result = b;
			}else {
				result = c;
			}
			
		return result;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
