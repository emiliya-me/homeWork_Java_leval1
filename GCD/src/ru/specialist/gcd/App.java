package ru.specialist.gcd;

public class App {
	
	public static int gcd(int numOne, int numTwo) {
		
		numOne = Math.abs(numOne);
		numTwo = Math.abs(numTwo);
		
		if (numOne == 0) {
			return  numTwo;
		}
		if (numTwo == 0) {
			return  numOne;
		}
		
		while (numTwo!=0) {
			int numFree = numOne %  numTwo;
			numOne = numTwo;
			numTwo = numFree;
		}
		return  numOne;
	}

	public static void main(String[] args) {
		System.out.println(gcd(1071, 462));

	}

}
