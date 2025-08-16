package ru.specialist.itogovaya;

import java.util.Scanner;
import java.util.Random;

public class App {
    
    public static final int MAX_ATTEMPTS = 10;
    public static final int GIVE_UP_NUMBER = 0;

    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0; 
        int attemptCount = 0; 
        
        System.out.println("Я загадал число от 1 до 100. У тебя " + MAX_ATTEMPTS + " попыток!");
        System.out.println("Введи 0, если хочешь сдаться.");

        do {
            System.out.print("Попытка " + (attemptCount + 1) + ": ");
            
            userGuess = scanner.nextInt();
            
            if (userGuess == GIVE_UP_NUMBER) {
                System.out.println("Игра окончена. Загаданное число было: " + secretNumber);
                break;
            }
            
            
            attemptCount++;
            
            if (userGuess > secretNumber) {
                System.out.println("слишком много");
            } else if (userGuess < secretNumber) {
                System.out.println("слишком мало");
            }
            
        } while (attemptCount < MAX_ATTEMPTS && userGuess != secretNumber);
        
        if (userGuess == secretNumber) {
            System.out.printf("Поздравляю! Ты угадал за %d попыток!\n", attemptCount);
        } else if (userGuess != GIVE_UP_NUMBER) {
            System.out.println("Попытки закончились! Загаданное число было: " + secretNumber);
        }
        
        scanner.close();
    }
}