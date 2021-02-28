package Java_basics.Arrays.Iterating_over_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclically_shifting_elements {
    public static void main(String[] args) {
        /**
         * Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right: a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).
         *
         * Input data format
         *
         * The first line of the input contains the number of elements in the array. The second line contains the elements of the array.
         *
         * Output data format
         *
         * The single line should contain all shifted elements of the array. Elements must be separated by the space character.
         *
         *  Report a typo
         * Sample Input 1:
         *
         * 5
         * 1 2 3 4 5
         * Sample Output 1:
         *
         * 5 1 2 3 4
         */

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] ints = new int[num];
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        int[] temp = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == num - 1) {
                temp[0] = ints[i];
            } else {
                temp[i + 1] = ints[i];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(temp[i] + " ");
        }

        /*
        此题使用了大量的for语句，第一个for用于获取数据，第二个for用于对数组进行转换，第三个for用于输出。我们需要注意的是第二个for语句，因为此语句中的第一个if语句中，应该注意判断条件，因为是从原数组的0索引开始，因此到达原数组最后一个元素时应该放到新数组的0索引处
         */

        Scanner scanner1 = new Scanner(System.in);
        int len = scanner1.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner1.nextInt();
        }
        System.out.print(array[array.length - 1] + " ");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");

        }

        /*
        简化对数组转换的方式，非常巧妙，有效节省了程序的时间复杂度空间复杂度，我们往往可能会因为为了所谓的程序的高大上二复杂了程序的编写，而可能不屑于这些可能不那么高明的做法，这样既可以解决问题又有着较好的时间空间复杂度，我们不能复杂化问题
         */

        Scanner scanner2 = new Scanner(System.in);
        int size = scanner2.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size - 1; i++) {
            a[i + 1] = scanner2.nextInt();
        }
        a[0] = scanner2.nextInt();
        System.out.println(Arrays.toString(a).replaceAll("\\[|,|\\]", ""));

        /*
        此种方法更加巧妙，无敌，太巧妙了，使用toString方法并移除其他字符，绝了
         */

        Scanner scanner3 = new Scanner(System.in);
        int num2 = scanner3.nextInt();
        int[] ints2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            ints[i] = scanner3.nextInt();
        }
        int[] temp2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            temp2[(i + 1) % num2] = ints2[i];
        }
        for (int i = 0; i < num; i++) {
            System.out.print(temp2[i] + " ");
        }

    }
}
