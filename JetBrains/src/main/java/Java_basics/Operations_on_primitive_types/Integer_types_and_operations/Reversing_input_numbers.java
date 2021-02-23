package Java_basics.Operations_on_primitive_types.Integer_types_and_operations;

import java.util.Scanner;

public class Reversing_input_numbers {
    public static void main(String[] args) {
        /**
         * Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.
         *
         * Sample Input 1:
         * 1 2
         *
         * Sample Output 1:
         * 2 1
         */
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i == 0) break;
            System.out.print(" ");
        }

        /*
        需要注意的是，务必需要导入使用的包
        在完成一个需求时，我们应该注意到我们所应该满足的需求，可以先用简单的方式进行书写，在功能完善后对其进行重构
         */

        Scanner sc = new Scanner(System.in);
        String[] k = sc.nextLine().split(" ");
        //合理使用split可以使代码变得简单易读
        System.out.println(k[1] + " " + k[0]);
    }
}
