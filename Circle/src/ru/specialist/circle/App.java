package ru.specialist.circle;

public class App {

	public static void main(String[] args) {
		int radius = 10;
		double lenCercle = 2 * Math.PI * radius;
		double sqCercle = Math.PI * Math.pow(radius, 2);
		System.out.printf("Длина окр-ти - %6.2f\nПлощадь круга - %6.2f\n", lenCercle, sqCercle);
		

	}

}
