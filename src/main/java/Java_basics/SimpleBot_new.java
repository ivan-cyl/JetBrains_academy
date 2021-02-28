package Java_basics;

import java.util.Scanner;

public class SimpleBot_new {
    public static void main(String[] args) {
        /**
         * Description
         * Keep improving your bot by developing new skills for it. We suggest a simple guessing game that will predict the age of a user.
         *
         * It's based on a simple math trick. First, take a look at this formula:
         *
         * age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
         * The numbers remainder3, remainder5 and remainder7 are the remainders of division by 3, 5, and 7 respectively.
         *
         * It turns out that for each number ranging from 0 to 104 the calculation will result in the number itself. This perfectly fits the ordinary age range, doesn't it? Ask a user for the remainders and use them to guess the age!
         *
         * Objective
         * In this stage, you will introduce yourself to the bot. It will greet you by your name and then try to guess your age using arithmetic operations.
         *
         * Your program should print the following lines:
         *
         * Hello! My name is Aid.
         * I was created in 2020.
         * Please, remind me your name.
         * What a great name you have, Max!
         * Let me guess your age.
         * Enter remainders of dividing your age by 3, 5 and 7.
         * Your age is {yourAge}; that's a good time to start programming!
         * Read three numbers from the standard input. Assume that all the numbers will be given on separate lines.
         *
         * Instead of {yourAge}, the bot will print the age determined according to the special formula discussed above.
         *
         * Example
         * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
         *
         * Example 1: a dialogue with the bot
         *
         * Hello! My name is Aid.
         * I was created in 2020.
         * Please, remind me your name.
         * > Max
         * What a great name you have, Max!
         * Let me guess your age.
         * Enter remainders of dividing your age by 3, 5 and 7.
         * > 1
         * > 2
         * > 1
         * Your age is 22; that's a good time to start programming!
         * Use the provided template to simplify your work. You can change the text but not the number of printed lines.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }
}
