package ru.specialist.texr;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("..", "test.txt");
        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
        int chart = 0;
        int word = 0;
        int stripe = 0; 
        
        for(String line : lines) {
            System.out.println(line);
            stripe++;
            chart += line.length();
            word += line.split("\\s+").length;
        }
        
        System.out.println("Количество строк: " + stripe);
        System.out.println("Количество символов: " + chart);
        System.out.println("Количество слов: " + word);

	}

}
