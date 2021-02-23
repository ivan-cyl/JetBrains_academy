package Java_basics.Conditional_statement.The_army_of_units;

import java.util.Scanner;

public class The_army_of_units {
    public static void main(String[] args) {
        /**
         * In a computer game, each gamer has an army of units.
         *
         * Write a program that will classify the army of your enemies corresponding to the following rules:
         *
         * Units: Category
         *
         * less than 1: no army
         *
         * from 1 to 19: pack
         *
         * from 20 to 249: throng
         *
         * from 250 to 999: zounds
         *
         * 1000 and more: legion
         *
         * The program should read the number of units and output the corresponding category.
         *
         * Sample Input 1:
         * 5
         *
         * Sample Output 1:
         * pack
         *
         * Sample Input 2:
         * 303
         *
         * Sample Output 2:
         * zounds
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("no army");
        } else if (number <= 19) {
            System.out.println("pack");
        } else if (number <= 249) {
            System.out.println("throng");
        } else if (number <= 999) {
            System.out.println("zounds");
        } else System.out.println("legion");

        /*
        由于已知前提条件以满足，所以后面判断语句的代码便无须对已满足之前判断语句的条件的进一步约束，但是这样虽然简化了代码，但是可能并不易读，所以根据需求可以对其进行方法的封装，既能保证代码的简洁又可以使后来者明白代码含义，避免不必要的麻烦
         */

        //可读性良好的代码
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        if (number1 < 1) {
            System.out.println("no army");
        } else if (number >= 1 && number <= 19) {
            System.out.println("pack");
        } else if (number >= 20 && number <= 249) {
            System.out.println("throng");
        } else if (number >= 250 && number <= 999) {
            System.out.println("zounds");
        } else if (number >= 1000) {
            System.out.println("legion");
        }

        //可以对解法一的改进
        Scanner scanner1 = new Scanner(System.in);

        int n = scanner1.nextInt();

        if (n < 1) {
            System.out.println("no army");
        } else if (n < 20) {
            System.out.println("pack");
        } else if (n < 250) {
            System.out.println("throng");
        } else if (n < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
