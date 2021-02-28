import java.util.Scanner;

public class The_user_is_the_gamemaster {
    public static void main(String[] args) {
        /**
         * Description
         * Our program should be able to display the grid at all stages of the game. Now we’re going to write a program that allows the user to enter a string representing the game state and correctly prints the 3x3 game grid based on this input. We’ll also add some boundaries around the game grid.
         *
         * Objectives
         * In this stage, you will write a program that:
         *
         * Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only X, O and _ symbols.
         * Outputs a line of dashes --------- above and below the grid, adds a pipe | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.
         * Examples
         * Examples below show how your output should look.
         * Notice that after Enter cells: comes the user input.
         *
         * Example 1:
         *
         * Enter cells: O_OXXO_XX
         * ---------
         * | O _ O |
         * | X X O |
         * | _ X X |
         * ---------
         * Example 2:
         *
         * Enter cells: OXO__X_OX
         * ---------
         * | O X O |
         * | _ _ X |
         * | _ O X |
         * ---------
         * Example 3:
         *
         * Enter cells: _XO__X___
         * ---------
         * | _ X O |
         * | _ _ X |
         * | _ _ _ |
         * ---------
         */

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("---------");
        for (int i = 0; i < string.length(); i++) {
            if ((i % 3) % 3 == 0) {
                System.out.print("| ");
            }
            System.out.print(string.charAt(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println("|");
                //System.out.println();
            }
        }
        System.out.println("---------");

        /*
        此题目前的实现方法可能比较弱智，我们通过使用两个for循环分别完成对需求的解决，但是我们在接触项目的过程中，应该先满足最基本的要求，进而再对代码进行相关操作，完成对代码的重构，降低代码耦合性，提高代码可读性，提高拓展性，这是非常重要的
         此题需要注意对空格的使用，避免使用过度
         */

        String tic_tack = scanner.nextLine();

        // ---------
        // | O _ O |
        // | X X O |
        // | _ X X |
        // ---------
        char[] tic_tack_array = new char[10];
        for (int i = 1; i < tic_tack_array.length; i++) {
            tic_tack_array[i] = tic_tack.charAt(i-1);
        }
        String dots = "---------";
        String line1 = "| " + tic_tack_array[1] + " " + tic_tack_array[2] + " " + tic_tack_array[3] + " |";
        String line2 = "| " + tic_tack_array[4] + " " + tic_tack_array[5] + " " + tic_tack_array[6] + " |";
        String line3 = "| " + tic_tack_array[7] + " " + tic_tack_array[8] + " " + tic_tack_array[9] + " |";

        System.out.println(dots + "\n" + line1 + "\n" + line2 + "\n" + line3 + "\n" + dots);

        /*
        这个方法可能更好理解，但是依旧有着较大的局限性，感觉更傻了，但是也是不错的选择
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] ttt = scanner1.nextLine().toCharArray();

        System.out.println("---------");
        for (int i = 0;i < ttt.length;i += 3) {
            System.out.print("| ");
            System.out.print(ttt[i] + " ");
            System.out.print(ttt[i+1] + " ");
            System.out.print(ttt[i+2]);
            System.out.println(" |");
        }
        System.out.println("---------");
    }
}
