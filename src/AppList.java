import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("Bob");
		lista.add("Alex");
		lista.add("Alefe");
		lista.add("Ana");
		lista.add("Teus");
		lista.add(3, "Marco vei");
		
		System.out.println(lista.size());
		

		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------");
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("------------");
		List<String> result = lista.stream().filter(i -> i.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------");
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
