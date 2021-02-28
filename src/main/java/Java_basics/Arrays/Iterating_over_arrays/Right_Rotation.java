package Java_basics.Arrays.Iterating_over_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Right_Rotation {
    public static void main(String[] args) {
        /**
         * A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.
         *
         * Write a program that performs a right rotation on an array by a given number.
         *
         * Input format:
         * The first line is an array of numbers.
         * The second line is the number of rotations.
         *
         * Output format:
         * Resulting array
         *
         * Sample Input 1:
         * 1 2 3 4 5
         * 1
         *
         * Sample Output 1:
         * 5 1 2 3 4
         *
         * Sample Input 2:
         * 1 2 3 4 5
         * 2
         *
         * Sample Output 2:
         * 4 5 1 2 3
         *
         * Sample Input 3:
         * 1 2 3 4 5
         * 8
         *
         * Sample Output 3:
         * 3 4 5 1 2
         *
         * Sample Input 4:
         * 11 21 1 41 51 78 90
         * 10000
         *
         * Sample Output 4:
         * 41 51 78 90 11 21 1
         */

        Scanner scanner = new Scanner(System.in);
        String[] strings = null;
        strings = scanner.nextLine().split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.valueOf(strings[i]);
        }
        int num = scanner.nextInt();
        int[] temp = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            temp[(i + num) % ints.length] = ints[i];
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(temp[i] + " ");
        }

        /*
        此题方法参考了上一题的一种方法，通过String[]数组来获取数据，进而将数据转换为int[]数组，依靠这个解决了未知数组大小而进行输入操作，后续右旋的操作参考了上一题最初的做法，并对其进行了一定优化，顺便优化了上一题的做法（使用取余来获取“距离差”）

        valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。

        该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
         */

        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int shift = sc.nextInt();

//        System.out.println(Arrays.toString(array));
//        System.out.println(shift);

        int modShift = shift % array.length; // minus one?

//        System.out.println(modShift);
        int temp1;
        int temp2;
        int tempPosition;
        for (int i = 0; i < modShift; i++) {
            temp2 = array[0];
            for (int j = 0; j < array.length; j++) {
                tempPosition = j + 1 < array.length ? j + 1 : 0;
                temp1 = array[tempPosition];
                array[tempPosition] = temp2;
                temp2 = temp1;
            }
        }
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));

        /*
        Arrays.stream将数组转换成流，Arrays.Stream 或 Stream.of 都可以将 Array 转换为 Stream，对于对象数组，都会调用Arrays.stream对于原始数组，Arrays.stream更方便，它可以直接返回固定大小的IntStream

         */

        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        String[] array1 = str.split(" ");
        String[] array2 = str.split(" ");
        int len = array1.length;
        int n = scanner1.nextInt();

        if (n > len) {
            n = n % len;
        }
        for (int i = 0; i < len; i++) {
            if (i < n) {
                array1[i] = array2[len - n + i];
                System.out.print(array1[i] + " ");
            } else {
                array1[i] = array2[i - n];
                System.out.print(array1[i] + " ");
            }
        }

        /*
        这题完全使用了String[]数组代替int[]数组，有效减少了转换为int[]数组的麻烦，但是右旋的方法可以优化，但是此是一种比较易读的方法
         */

        Scanner scanner2 = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner2.nextLine()
                .split(" "));
        Collections.rotate(list, scanner2.nextInt());
        list.forEach(x -> System.out.print(x + " "));

        /*
        极简的方法
        Arrays.asList将数组转化为list，可以在外面这样包一层ArrayList，这样就可以对数组操作了
        List list = Arrays.asList("a","ab","abc");
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
         */

        Scanner scanner3 = new Scanner(System.in);

        int[] array3 = Stream.of(scanner3.nextLine()
                .split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int shift2 = scanner3.nextInt() % array3.length;

        IntStream.range(0, array.length)
                .map(i -> array[(i + array.length - shift) % array.length])
                .forEach(x -> System.out.print(x + " "));

        /*

         */

        var scan = new Scanner(System.in);
        String[] arrStr = scan.nextLine().split("\\s");
        int rotation = scan.nextInt();
        Collections.rotate(Arrays.asList(arrStr), rotation);
        for (String elem : arrStr) {
            System.out.print(elem + " ");
        }
    }
}
