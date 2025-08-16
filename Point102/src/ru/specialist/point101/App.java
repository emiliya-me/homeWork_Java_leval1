package ru.specialist.point101;


public class App {

	public static void main(String[] args) {
		
		 Point[] points = {
				 new Point(),    
				 new Point(3, 4),
				 new Point(1, 1),
				 new Point(-2, 3),
				 new Point(5, 0)
		 };

		 System.out.println("До сортировки:");
		 printPoints(points);
		        
		 for(int i = 0; i < points.length-1; i++) {
			 for(int j = i+1; j < points.length; j++) {
				 if(points[i].distance() > points[j].distance()) {
					 Point temp = points[i];
		             points[i] = points[j];
		             points[j] = temp;
		          }
		      }
		 }

		System.out.println("\nПосле:");
		printPoints(points);
		
		}

		public static void printPoints(Point[] points) {
			for(Point p : points) {
				p.draw();
		        System.out.printf("Расстояние: %.2f\n", p.distance());
		    }
	}

}
