package Java_basics.Introduction_to_Java.Printing_data;

class Mian {
    public static void main(String[] args) {
        /**
         * Write a program that prints the following three lines:
         * first
         * second
         * third
         */
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");

        /**
         * You need to write a program to display the resulting grid of a Tic-Tac-Toe game.
         * The grid is shown below.
         *
         * O X X
         * O X O
         * X O X
         */
        System.out.println("O X X");
        System.out.println("O X O");
        System.out.println("X O X");

        /**
         * Write a program that prints numbers from 0 to 9, but in the backward order. All numbers must be in the same line. Separate them by a space.
         * The output should be the following:
         * 9 8 7 6 5 4 3 2 1 0
         */

        System.out.println("9 8 7 6 5 4 3 2 1 0");
        //or
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        /*
        虽然使用for语句使编码变得更加“高级”但是，为了实现该需求这样是极其不恰当的，完全没有必要复杂化编程
        While the use of a for statement makes coding more "advanced," it is extremely inappropriate to implement this requirement, and there is no need to complicate programming at all
         */
    }
}
