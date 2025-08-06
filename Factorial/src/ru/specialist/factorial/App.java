package ru.specialist.factorial;

public class App {
	
	public static void  doFactorial (int n) {
		 if (n < 0) {
			 System.out.println("Факториал не опреределен ");
			 return;
	    }
		 
		int result = 1;
		
		for (int i=1;i<=n;i++) {
			result *= i;
		}
		System.out.printf("%d! = %d%n", n, result);
	}

	public static void main(String[] args) {
		
		doFactorial(1);
	}

}
