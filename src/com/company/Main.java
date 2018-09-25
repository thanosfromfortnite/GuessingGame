package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("CHOOSE YOUR DIFFICULTY LEVEL. (1/2/3/4)");
        input = new Scanner(System.in);
        int difficulty = Integer.parseInt(input.nextLine());
        int x = (int) (Math.pow(10.0, (float) (difficulty)) * Math.random());
        int y = 0;
        System.out.println("Now you must guess the correct number.");
        System.out.println(x);
    }
}
