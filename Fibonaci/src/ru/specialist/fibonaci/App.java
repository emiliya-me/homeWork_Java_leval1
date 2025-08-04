package ru.specialist.fibonaci;

public class App {

	public static void main(String[] args) {
		int numOne = 1;
		int numTwo = 1;
		
		System.out.println(numOne);
		System.out.println(numTwo);
		
		int result = numOne + numTwo;
		
		while (result < 1000) {
			System.out.println(result);
			numOne = numTwo;
			numTwo = result;
			result = numOne + numTwo;
		};
	}

}
