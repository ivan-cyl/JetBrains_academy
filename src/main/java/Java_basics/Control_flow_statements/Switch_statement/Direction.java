package Java_basics.Control_flow_statements.Switch_statement;

import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        /**
         *  Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) and outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move" depending on the entered number). If it is a number that does not belong to any of the listed directions, the program should output "error!"
         *
         * Note: the output text should exactly match the sample, including the letters’ case and location of spaces.
         *
         * Sample Input 1:
         * 1
         *
         * Sample Output 1:
         * move up
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}
