package Java_basics.Control_flow_statements.The_for_loop;

import java.util.Scanner;

public class The_for_loop {
    public static void main(String[] args) {
        /**
         * Your task is to find the roots of a cubic equation.
         *
         * The input contains four numbers: a, b, c, da,b,c,d.
         *
         * Output all the integer roots between 0 and 1000 (inclusive) for the equation ax^3+bx^2+cx+d=0ax
         * 3
         *  +bx
         * 2
         *  +cx+d=0 in ascending order.
         *
         * If the specified interval does not contain the roots of the equation, do not output anything.
         *
         * Remember, that cubic equation always has 3 roots, meaning it can't have more than 3 integer roots. Keep this in mind in order to optimize the code.
         *
         * Sample Input 1:
         * -1
         * 1
         * -1
         * 1
         *
         * Sample Output 1:
         * 1
         *
         * Sample Input 2:
         * 0
         * 1
         * -6
         * 5
         *
         * Sample Output 2:
         * 1
         * 5
         *
         * Sample Input 3:
         * 1
         * 1
         * 1
         * 1
         *
         * Sample Output 3:
         *
         */
        Scanner scanner = new Scanner(System.in);
        int number = 4;
        int[] ints = new int[number];
        for (int i = 0; i < number; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 1_000; i++) {
            if (ints[0] * i * i * i + ints[1] * i * i + ints[2] * i + ints[3] == 0) {
                System.out.println(i);
            }
        }

        /*
        看到本题的时候，我们可能慌了，认为需要完成对三次方方程的解，可能就慌了，但是我们只需要解决1000以内的整解
         */

    }
}
