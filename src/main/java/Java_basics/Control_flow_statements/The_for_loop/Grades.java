package Java_basics.Control_flow_statements.The_for_loop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        /**
         * Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.
         *
         * In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.
         *
         * The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.
         *
         * Sample Input 1:
         * 13
         * 2
         * 5
         * 5
         * 5
         * 5
         * 3
         * 2
         * 4
         * 3
         * 3
         * 3
         * 2
         * 3
         *
         * Sample Output 1:
         * 3 5 1 4
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] ints = new int[number];
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        for (int i = 0; i < number; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) {
            if (ints[i] == 5) {
                A++;
            } else if (ints[i] == 4) {
                B++;
            } else if (ints[i] == 3) {
                C++;
            } else if (ints[i] == 2) {
                D++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);

        /*
        此题并不困难,只需要通过if嵌套的方法来对输入的数据进行判断并进行判断
         */

        Scanner scanner1 = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int size = scanner1.nextInt();
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner1.nextInt();
        }
        scanner.close();
        for (int j : n) {
            if (j == 5) {
                a++;
            } else {
                if (j == 4) {
                    b++;
                } else {
                    if (j == 3) {
                        c++;
                    } else {
                        d++;
                    }
                }
            }
        }
        System.out.printf("%d %d %d %d", d, c, b, a);

        /*
        以上代码是有三目运算符重构产生的，三目运算符是一个不错的解决方案，但是过于难读uu
        */
    }
}