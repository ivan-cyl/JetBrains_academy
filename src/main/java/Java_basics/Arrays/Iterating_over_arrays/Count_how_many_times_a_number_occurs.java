package Java_basics.Arrays.Iterating_over_arrays;

import java.util.Scanner;

public class Count_how_many_times_a_number_occurs {
    public static void main(String[] args) {
        /**
         * Write a program that reads an array of ints and an integer number n.
         *
         * The program must check how many times n occurs in the array.
         *
         * Input data format
         * The first line contains the size of the input array.
         *
         * The second line contains elements of the array separated by spaces.
         *
         * The third line contains n.
         *
         * Output data format
         *
         * The result is only a single non-negative integer number.
         *
         * Sample Input 1:
         * 6
         * 1 2 3 4 2 1
         * 2
         *
         * Sample Output 1:
         * 2
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] ints = new int[number];
        for (int i = 0; i < number; i++) {
            ints[i] = scanner.nextInt();
        }
        int temp = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < number; i++) {
            if (temp == ints[i]) {
                num++;
            }
        }
        System.out.println(num);

        /*
        通过使用两个for语句进行循环，一个用于接受输入，另一个用于判断查找，最后输出结果
         */
    }
}
