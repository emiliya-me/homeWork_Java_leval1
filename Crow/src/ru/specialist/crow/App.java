package ru.specialist.crow;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Сколько ворон - ");
		int crow = scanner.nextInt();
		String word;
		
		int rest = crow % 100;
		
		if (rest >= 11 && rest <= 14) {
			word = "ворон";
		}
		else {
			word = switch(crow % 10) {
			case 1 -> "ворона";
			case 2 -> "вороны";
			case 3 -> "вороны";
			case 4 -> "вороны";
			default -> "ворон";
			
			};
		};

		
		System.out.printf("Там - %d %s\n", crow, word);
	}

}
