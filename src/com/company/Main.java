package com.company;

import java.util.Scanner;

public class Main {

    public static void main2(String[] args) {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);


        int difficulty = 0;
        System.out.println("Choose your difficulty level. (1/2/3/4)");
        input = new Scanner(System.in);
        difficulty = Integer.parseInt(input.nextLine());
        while (difficulty < 1 || difficulty > 4) {
            System.out.println("Don't be cheeky. You can only choose between a difficulty of 1, 2, 3, and 4.");
            input = new Scanner(System.in);
            difficulty = Integer.parseInt(input.nextLine());
        }
        int x = (int) (Math.pow(10.0, (float) (difficulty)) * Math.random());
        int y = 0;
        System.out.println("Now you must guess the correct number. Good luck, " + name);
        int answer = 0;
        while (answer != x) {
            y++;
            input = new Scanner(System.in);
            answer = Integer.parseInt(input.nextLine());
            if (answer != x) {
                System.out.println("That's not right. Try harder, " + name);
            }

        }
        if (y == 1) {
            System.out.println("Congratulations, " + name + "! You guessed it right on the first try!");
        } else {
            System.out.println("Congratulations, " + name + ". It only took you " + y + " tries to do it.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Tell me your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        int difficulty = 0;
        System.out.println("Choose my difficulty level. (1/2/3/4)");
        input = new Scanner(System.in);
        difficulty = Integer.parseInt(input.nextLine());
        while (difficulty < 1 || difficulty > 4) {
            System.out.println("Don't be cheeky. You can only choose between a difficulty of 1, 2, 3, and 4.");
            input = new Scanner(System.in);
            difficulty = Integer.parseInt(input.nextLine());
        }
        int maxRange = (int) Math.pow(10, difficulty);

        System.out.println("Please think deeply of a number between 1 and " + maxRange + ".");
        System.out.println("Now tell me... is the number less than ");
    }
}
