package Java_basics.Control_flow_statements.The_while_and_do_while_loops;

import java.util.Scanner;

public class Collatz_conjecture {
    public static void main(String[] args) {
        /**
         * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
         *
         * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.
         *
         * For example, if the number n = 17, then the sequence looks as the following:
         * 17 52 26 13 40 20 10 5 16 8 4 2 1
         * Such a sequence will stop at number 1 for any primary natural number n.
         *
         * Output format:
         * Sequence of integers in a single line, separated by spaces.
         *
         * Sample Input 1:
         * 17
         *
         * Sample Output 1:
         * 17 52 26 13 40 20 10 5 16 8 4 2 1
         *
         * Sample Input 2:
         * 1
         *
         * Sample Output 2:
         * 1
         */

        Scanner scanner = new Scanner(System.in);
//        int[] ints = new int[100];
        int number = scanner.nextInt();
        System.out.print(number + " ");
        while (number != 1) {
//            int i = 0;
            if (number % 2 == 0) {
                number /= 2;
//                ints[i] = number;
//                i++;
                System.out.print(number + " ");
            } else {
                number = number * 3 + 1;
//                ints[i] = number;
//                i++;
                System.out.print(number + " ");
            }
        }
//        for (int i = 0; i < 100; i++) {
//            if (ints[i] != 1) {
//                System.out.print(ints[i] + " ");
//            }
//        }

        /*
        虽然我最终成功完成了该问题，但是我却犯了一个较大的错，首先一开始我就是使用System.out.println();，这导致了输出的不规范。我在一开始是时候是使用数组来保存数据，于是我使用了定义一个100大小的数组，这个很疯狂，因为我们无法得知我们会产生多少数据，这样要么不够要么浪费空间，为什么我会使用数组呢，因为结果需要由一排数字交替组成，而且每一个数据都是在不同时间（甚至较长时间）产生的，因此我就主观臆断为需要使用数组来存储，这是片面的
         */

        /**
         * Labels are for cans not for people
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i = 0;
        System.out.print(n + " ");
        while (n != 1) {
            int a = n % 2 == 0 ? n / 2 : (n * 3) + 1;
            System.out.print(a + " ");
            n = a;
        }

        /*
        使用三目运算符来来代替if……else语句
         */

        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner.nextInt();
        while (number1 >= 1) {
            System.out.print(number1 + " ");
            if (number1 == 1) {
                number1--;
                break;
            }
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
    }
}
