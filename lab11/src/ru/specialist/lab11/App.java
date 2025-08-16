package ru.specialist.lab11;

public class App {
    public static void main(String[] args) {
        List list = new List() 
            .add(15)
            .add(6)
            .add(13)
            .add(99)
            .add(1);

        System.out.println(list.contains(13)); 
        System.out.println(list.indexOf(1)); 
        System.out.println(list.get(1)); 

    }
}
