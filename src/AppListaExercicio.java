import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Emplyoee;

public class AppListaExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Emplyoee> listaEmployee = new ArrayList<>();
		
		System.out.println("How many emplyoees will be registered ? ");
		int numberOfEmplyoees = sc.nextInt();
		
		
		for(int i=0; i < numberOfEmplyoees;i++) {
			sc.nextLine();
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			Emplyoee emp = new Emplyoee(id, name, salary);
				
			listaEmployee.add(emp);
					
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		Integer pos = position(listaEmployee, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!!!!");
		}else {
			System.out.println("Enter The percentage: ");
			double percent = sc.nextDouble();
			listaEmployee.get(pos).increaseSalary(percent);
			
		}
		
		System.out.println("List of Employees");
		for(Emplyoee emp : listaEmployee) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Emplyoee> lista, int id) {
		for(int i=0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
