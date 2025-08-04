package ru.specialist.name;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ваше имя - ");
		String userName = scanner.nextLine();
		
		if (userName.isEmpty()) {
			System.out.print("Привет, незнакомец!");
		}
		else {
			System.out.printf("Привет, %s!\n", userName);
		}

	}

}
