package Java_basics.Control_flow_statements.Branching_statements;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        /**
         * Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". If the number is equal to 0, the program must stop reading and processing numbers.
         *
         * Input data
         *
         * A sequence of natural numbers, each number in a new line.
         *
         * Output data
         *
         * The sequence of words "even" and "odd". Each word in a new line.
         *
         * Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.
         *
         * Sample Input 1:
         * 1
         * 2
         * 3
         * 4
         * 0
         *
         * Sample Output 1:
         * odd
         * even
         * odd
         * even
         */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        /*
        此题题目给的比较明确，不需要储存数据，但是大多数情况下，我们所遇到的开发问题都不会给出具体的要求，因此就有可能会造成过分拆解问题，导致问题复杂化，得不偿失，我们在开发过程中，无论什么情况下，当我们想要存储数据时，都反思一下，我们是不是的确需要存储数据，是否有其他的解决方案来解决当前的问题，所以在日常开发中我们应该尽可能减少数据的存储，减少空间复杂度（保证良好的时间复杂度的情况下），当然我们也要尽可能将全局变量转换为局部变量，并且明确我们的需求。此题我使用的是break语句，这是因为我们目前学习break语句，所以我们使用该方法，当然也有其他方法
         */

        Scanner scanner1 = new Scanner(System.in);
        int input;
        while ((input = scanner1.nextInt()) != 0) {
            System.out.println(input % 2 == 0 ? "even" : "odd");
        }

        /*
        此解法，虽然有效减少了代码行数，使用了三目运算符和while直接判断方法，但是使用了全局变量，因此也有一些不足
         */

        Scanner scanner2 = new Scanner(System.in);

        while (scanner2.hasNextInt()) {
            int i = scanner2.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println(i % 2 == 0 ? "even" : "odd");
        }


        Scanner scanner3 = new Scanner(System.in);

        while (scanner3.hasNext()) {
            int num = scanner3.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        /*
        以上两种方法，我个人觉得并不是太好，没有较强的可读性，不建议使用，但其充分使用方法，也是一个不错的地方
         */
    }
}
