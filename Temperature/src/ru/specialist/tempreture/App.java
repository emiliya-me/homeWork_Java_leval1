package ru.specialist.tempreture;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Температура в градусах цельсия - ");
		double tempretureCelcia = scanner.nextDouble();
		double tempretureFaringete = tempretureCelcia * 9 / 5 + 32;
		System.out.printf("Температура в градусах фарингейта - %.2f\n", tempretureFaringete);

	}

}
