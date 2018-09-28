package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please choose which game you want to play (1/2)");
        Scanner input = new Scanner(System.in);
        String game = input.nextLine();
        while (!game.equals("1") && !game.equals("2")) {
            System.out.println("That is not one of your options. Do you want to play game 1 or 2?");
            input = new Scanner(System.in);
            game = input.nextLine();
        }
        if (game.equals("1")) {
            game1();
        }
        if (game.equals("2")) {
            game2();
        }
    }

    public static void game1() {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);


        int difficulty = 0;
        System.out.println("Choose your difficulty level. (1/2/3/4)");
        input = new Scanner(System.in);
        difficulty = Integer.parseInt(input.nextLine());
        while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4) {
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
    public static void game2() {
        System.out.println("Tell me your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        int difficulty = 0;
        System.out.println("Choose my difficulty level. (1/2/3/4)");
        input = new Scanner(System.in);
        difficulty = Integer.parseInt(input.nextLine());
        while (difficulty != 1 && difficulty != 2 && difficulty != 3 && difficulty != 4) {
            System.out.println("Don't be cheeky. You can only choose between a difficulty of 1, 2, 3, and 4.");
            input = new Scanner(System.in);
            difficulty = Integer.parseInt(input.nextLine());
        }
        int maxRange = ((int) Math.pow(10, difficulty)) + 1; int minRange = 0; int botAnswer = (maxRange + minRange) / 2; String answer; int y = 0;

        System.out.println("Please think deeply of a number between 1 and " + (maxRange - 1) + ".");
        boolean correct = false;
        String output = "I have discovered your number, " + botAnswer + ". It has taken me " + y + " tries to do it.";
        while (!correct) {
            System.out.println("Is the number (less) than, (greater) than, or (equal) to " + (maxRange+minRange)/2 + "?");
            input = new Scanner(System.in);
            answer = input.nextLine();
            while (!answer.equals("greater") && !answer.equals("less") && !answer.equals("equal")) {
                System.out.println("I need a real answer. Is it [[[less]]], [[[greater]]] than, or [[[equal]]] to " + botAnswer + "?");
                input = new Scanner(System.in);
                answer = input.nextLine();
            }
            if (answer.equals("greater")) {
                minRange = botAnswer;
            } else if (answer.equals("less")) {
                maxRange = botAnswer;
            }
            else correct = true;
            botAnswer = (maxRange + minRange) / 2;
            y ++;
            if (y == 1) {
                output = "I have found your number, " + botAnswer + " in just one try!";
            }
            if (botAnswer == maxRange || botAnswer == minRange) {
                correct = true;
                output = "ERR: User has lied on one of the prompts or number does not exist.";
            }
        }
        System.out.println(output);
    }
}
