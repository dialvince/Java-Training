package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser os chrome");
		}
		
		String firstname = "Tim";
		String lastname = "Short";
		String SNN = "111111";
		
		System.out.println("There are " + SNN.length() + " digits in your SNN.");
		
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0,1));
		System.out.println(SNN.substring(5));
				

	}

}
