package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(sum(4));
		
		System.out.println(factorial(4));
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Minimum:" + Minimum(numbers));
		System.out.println("Maximum:" + Maximum(numbers));
		System.out.println("Average:" + Average(numbers));
	}
	
	public static int Average(int[] array) {
		int sum = 0;
		for (int n=0; n<array.length; n++) {
			sum = sum + array[n];
		}
		return sum/array.length; 
	}
	
	public static int Minimum(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;	
	}
	
	public static int Maximum(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	
	
	public static int sum(int n) {
		int sum = 0;
		for (int a = 1; a <= n; a++) {
			System.out.print(sum + " + " + a);
			sum = sum + a;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return factorial(n-1) * n;
	}
}
