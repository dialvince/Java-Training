package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		career = "Software Engineer";
		System.out.println("My career is:" + career);
		
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		career = " Web Developer";
		double salary = hoursperweek * weeksperyear * rate;
		System.out.println("My career as a " +  career + " at the rate of " + rate + " per hour is $ " + salary + "per year.");
		
	}

}
