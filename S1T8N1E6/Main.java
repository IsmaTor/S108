package S1T8N1E6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
		//.stream = per agafar una llista (plantilla)
		//.sorted = agafar la llista per compararla
		//.comparing = compara 
		//.thenComparing = combina comparadors
	public static void decreix(ArrayList<String> plantilla) {
		List<String> jugadors = plantilla.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
	System.out.println(jugadors);
	}

	public static void main(String[] args) {
		
ArrayList<String> plantilla = new ArrayList<String>();
		
		plantilla.add("Schmeichel");
		plantilla.add("Cafú");
		plantilla.add("Puyol");
		plantilla.add("Nesta");
		plantilla.add("Maldini");
		plantilla.add("Xavi");
		plantilla.add("Iniesta");
		plantilla.add("Baggio");
		plantilla.add("Messi");
		plantilla.add("Ronaldo");
		plantilla.add("Stoichkov");
		plantilla.add("1");
		plantilla.add("9");
		plantilla.add("5");
		
		//plantilla.forEach( (jugadors) -> { System.out.println(jugadors); } );
		
		Main.decreix(plantilla);
		// TODO Auto-generated method stub

	}

}
