package lab;

public class Assignment {

	public static void main(String[] args) {
		Student stud1 = new Student("Accenture", "123456789");
		Student stud2 = new Student("Atas", "9897654321");
		
		stud1.enroll("English");
		stud2.enroll("Math");
		
				

	}

}

class Student{
	//Properties
	 private static int ID = 1000;
	 private String UID;
	 private String name;
	 private String SSN;
	 private String email;
	 private String course;
	 
	 public Student(String name, String ssn) {
		 ID++;
		 this.name = name;
		 this.SSN = SSN;
		 setuserID();
		 setEmail(); 
	 }
	 
	 private void setEmail() {
		 email = name +  "_" + ID + "@univversitymail.com";
		 System.out.println("Your Email: " + email);
	 }
	 
	 private void setuserID() {
		 int random = (int) (Math.random() * 100);
		 UID = ID + random + SSN.substring(6);
		 System.out.println("User ID: " + UID);
	 }
	 
	 public void enroll(String course) {
		 this.course = this.course + "\n" + course;
		 
		 
	 }
	 public void payTuition() {
		 
	 }
	 public void checkBalance() {
		 
	 }
	 public void  showCourses() {
		 
	 }
	 
	
}
