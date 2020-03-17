package basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities = {"New York", "San Francisco", "Maiami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		System.out.println("_________________________");
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jearsey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		do {
		    System.out.println("STATE: " + states[i]);
		    i = i + 1;
		} while (i < 5);
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State Found!");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("PRINTING WITH FOR LOOP\n");
		
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}

	}
}
	
