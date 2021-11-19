import java.util.*;

public class Quersumme {
	public static void main(String[] args) {
		ArrayList<Integer> ergebnis = test();
		countFrequencies(ergebnis);
		letztesFeld();

		// wenn die zahl im radius teilbar ist dann wird die quersumme gebildet und in
		// eine Liste getan
		// dann wird die Quersumme jede dieser Zahlen gebildet und in eine neue Liste getan
		// countFrequencies zählt das vorkommen von jeder Quersumme 
		
	}

	public static ArrayList<Integer> test() {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Von: ");
		int eingabe1 = scan.nextInt();
		System.out.println("Bis: ");
		int eingabe2 = scan.nextInt();
		System.out.println("Teilbar durch: ");
		int eingabe3 = scan.nextInt();
		for (int i = eingabe1; i <= eingabe2; i++) {
			if (i % eingabe3 == 0) {
				list1.add(i);
			}
		}
		System.out.println("----------------------------");

		for (Integer integer : list1) {
			int summe = 0;
			while (0 != integer) {
				summe = summe + (integer % 10);
				integer = integer / 10;
			}

			list2.add(summe);
		}
        
		return list2;
        
	}

	public static void countFrequencies(ArrayList<Integer> list) {

		Map<Integer, Integer> tm = new TreeMap<Integer, Integer>();

		for (Integer i : list) {
			Integer j = tm.get(i);
			tm.put(i, (j == null) ? 1 : j + 1);

		}

		for (Map.Entry<Integer, Integer> value : tm.entrySet()) {
			System.out.println("Quersumme " + value.getKey() + " " + "kommt" + ": " + value.getValue() + " mal vor");
		}
	}

	public static void letztesFeld() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Von: ");
		int eingabe1 = scan.nextInt();
		System.out.println("Bis: ");
		int eingabe2 = scan.nextInt();
		System.out.println("Teilbar: ");
		int eingabe3 = scan.nextInt();
		int counter = 0;
		for (int i = eingabe1; i <= eingabe2; i++) {
			if (i % eingabe3 == 0) {
				counter++;
			}
		}
		System.out.println("Von: " + eingabe1 + " bis " + eingabe2 + " gibt es also insgesamt: " + counter
				+ " Zahlen die durch " + eingabe3 + " teilbar sind");
        
	}

}
