package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 45;
		String suncondition = "overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and tshirt");
		}
		else if ((temperature > 60) && (suncondition == "sunny")) {
			System.out.println("It's cold. Wear long sleeves");
			System.out.println("bring umbrella");
		}
		else if ((temperature > 50) || (suncondition == "overcast")) {
			System.out.println("This is a cool day. Stay at home dork!");
		}
		else {
			System.out.println("Looks cold. Stay at home");
		}
			System.out.println("The program is ending");
	}
}
