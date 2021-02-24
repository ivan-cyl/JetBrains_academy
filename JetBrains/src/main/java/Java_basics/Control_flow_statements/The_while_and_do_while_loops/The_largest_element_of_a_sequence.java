package Java_basics.Control_flow_statements.The_while_and_do_while_loops;

import java.util.Scanner;

public class The_largest_element_of_a_sequence {
    public static void main(String[] args) {
        /**
         * Given the sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.
         *
         * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
         *
         * S/ample Input 1:
         * 1
         * 7
         * 9
         * 0
         *
         * Sample Output 1:
         * 9
         */

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int temp = 0;
        do {
            temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
        } while (temp != 0);
        System.out.println(max);

        /*
        这题可能会使用数组对数据进行存储，然后再进行遍历，但这是没必要的，我们的需求仅仅是为了取出最大值，而完全没有必要对数据进行存储，这样是不值得的，徒增了空间复杂度
         */

        Scanner scanner1 = new Scanner(System.in);
        int max1 = 0;
        while (scanner1.hasNext()) {
            int elem = scanner1.nextInt();
            max1 = elem > max1 ? elem : max1;
        }
        System.out.println(max1);

        /*
        同样也可以使用三目运算符进行求解
         */
    }
}