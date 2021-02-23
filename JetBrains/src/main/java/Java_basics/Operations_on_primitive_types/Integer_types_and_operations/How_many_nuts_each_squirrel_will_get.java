package Java_basics.Operations_on_primitive_types.Integer_types_and_operations;

import java.util.Scanner;

public class How_many_nuts_each_squirrel_will_get {
    public static void main(String[] args) {
        /**
         * N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
         * Input data format
         * There are two positive numbers N and K, each of them is not greater than 10000.
         *
         * Sample Input 1:
         * 3
         * 14
         *
         * Sample Output 1:
         * 4
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k / n);
    }
}
