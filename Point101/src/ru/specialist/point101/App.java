package ru.specialist.point101;

public class App {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(3, 5);
		Point p3 = new Point(-1, 2);
		
		p1.draw();
		System.out.println("Расстояние: " + p1.distance());
		p2.draw();
		System.out.println("Расстояние: " + p2.distance());
		p3.draw();
		System.out.println("Расстояние: " + p3.distance());

	}

}
