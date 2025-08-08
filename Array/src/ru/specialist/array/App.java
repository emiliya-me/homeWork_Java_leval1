package ru.specialist.array;

import java.util.Scanner;

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
	
	public static int[] analyzeArray(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{0, 0, 0};
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        return new int[]{min, max, sum};
    }
	
	 public static void print(int min, int max, int sum) {
	        System.out.println("\nРезультат");
	        System.out.printf("Min: %d\nMax: %d\nSum: %d\n", min, max, sum);
	    }

	public static void main(String[] args) {
		 int[] array = inputArray();
		 int[] analysisResult = analyzeArray(array);
		 print(analysisResult[0], analysisResult[1], analysisResult[2]);
	}

}
