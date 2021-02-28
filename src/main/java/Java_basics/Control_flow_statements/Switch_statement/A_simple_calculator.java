package Java_basics.Control_flow_statements.Switch_statement;

import java.util.Scanner;

public class A_simple_calculator {
    public static void main(String[] args) {
        /**
         * Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.
         *
         * The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.
         *
         * The calculator should support:
         *
         * addition: "+"
         * subtraction: "-"
         * integer division: "/"
         * multiplication: "*"
         * If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".
         *
         * If the input operator is not one from the list, the program should output "Unknown operator".
         *
         * Note: it's recommended to use the switch statement in your solution.
         *
         * Sample Input 1:
         * 10000000000 + 20000000000
         *
         * Sample Output 1:
         * 30000000000
         *
         * Sample Input 2:
         * 3000 / 0
         *
         * Sample Output 2:
         * Division by 0!
         *
         * Sample Input 3:
         * 10000 ! 300
         *
         * Sample Output 3:
         * Unknown operator
         */

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String string = scanner.next();
        long num2 = scanner.nextLong();
        switch (string) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else System.out.println("Division by 0!");
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

        /*
        使用三目运算符，简化解决方法
         */

        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        String op = sc.next();                  //char op = sc.next().charAt(0);
        long n2 = sc.nextLong();
        switch (op) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n2 == 0 ? "Division by 0!" : n1 / n2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
