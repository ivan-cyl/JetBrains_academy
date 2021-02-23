package Java_basics;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        /**
         * In this stage, you will introduce yourself to the bot so that it can greet you by your name.
         *
         * Your program should print the following lines:
         *
         * Hello! My name is Aid.
         * I was created in 2020.
         * Please, remind me your name.
         * What a great name you have, {yourName}!
         *
         * You may change the name and the creation year of your bot if you want.
         *
         * Instead of {yourName}, the bot must print your name entered from the standard input.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String youName = scanner.next();

        System.out.println("What a great name you have, " + youName + "!");
    }
}

