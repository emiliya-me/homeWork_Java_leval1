package ru.specialist.factorialnew;

public class App {
	
	public static void doFactorial(int n) {
        if (n < 0) {
            System.out.println("Факториал не определен для отрицательных чисел");
            return;
        }
        
        int result = 1;
        
        try {
            for (int i = 1; i <= n; i++) {
                result = Math.multiplyExact(result, i);
            }
            System.out.printf("%d! = %d%n", n, result);
        } catch (ArithmeticException exception) {
            System.out.printf("Арифметическое переполнение при вычислении факториала %d!%n", n);
        }
    }

	public static void main(String[] args) {
		 doFactorial(32);
	}

}
