package ru.specialist.arraynew;

import java.util.Scanner;
import java.util.Arrays;

public class App {
	
	public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("размер массива - ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
	
	public static double findMedian(int[] array) {
        Arrays.sort(array);

        if (array.length % 2 == 1) {
            return array[array.length/2];
        } else {
            return (array[array.length/2-1] + array[array.length/2])/2.0;
        }
    }

	public static void main(String[] args) {
		int[] array = inputArray();
		double median = findMedian(array);
        System.out.println("Медиана  - " + median);

	}

}
