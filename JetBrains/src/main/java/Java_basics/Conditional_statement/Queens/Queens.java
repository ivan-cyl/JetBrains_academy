package Java_basics.Conditional_statement.Queens;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Queens {
    public static void main(String[] args) {
        /**
         * You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
         *
         * Input data format
         *
         * Four integer numbers
         *
         * Output data format
         *
         * Type "YES" (uppercase) if they hit each other or "NO" if they don't.
         *
         * You may need a method that calculates the absolute value of the number, so here it is:
         * Math.abs(n)
         *
         * Queen is the most powerful and valuable attacking piece in the game of chess. It combines the powers of the bishop and the rook. It is able to move any number of unoccupied squares in a straight line: vertically, horizontally or diagonally.
         *
         *
         * These are all legal moves of the queen 1. Its coordinates are x_1 = 4, y_1 = 4x
         *
         * Sample Input 1:
         * 1 1 3 3
         *
         * Sample Output 1:
         * YES
         *
         * Sample Input 2:
         * 1 1 4 3
         *
         * Sample Output 2:
         * NO
         *
         * Sample Input 3:
         * 2 2 5 2
         *
         * Sample Output 3:
         * YES
         */

        int number = 2;
        int[][] ints = new int[number][number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
        if (ints[0][0] == ints[1][0] || ints[0][1] == ints[1][1] || abs(ints[0][0] - ints[1][0]) == abs(ints[0][1] - ints[1][1])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /*
        可能在初次接触到该题目，会有一种跳跃感，会觉得题目难度有了较大的提高，你可能会有一定的恐惧感，同样我也有着较大的恐惧感，其实这题并不困难，加油。
        应该注意到数组无论是一维二维数组都是按照以0为索引,注意Java是由两个坐标进行除法操作，但是int类型会进行自动取整操作因此导致失败,当然我们也可以使用减法来实现，但是我们要注意到棋盘的分布情况，就是对角线问题，它可以是斜率为1或-1，因此要考虑绝对值的问题
         */

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int mathX = Math.abs(x2 - x1);
        int mathY = Math.abs(y2 - y1);
        if (x1 == x2) {
            System.out.println("YES");
        } else if (y1 == y2) {
            System.out.println("YES");
        } else if (mathX == mathY) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /*
        普通版本
         */
    }
}
