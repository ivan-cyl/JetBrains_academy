package Java_basics.Arrays.Array;

import java.util.Arrays;

public class Initializing_an_array_of_longs {
    public static void main(String[] args) {
        /**
         * Create an array of longs named longNumbers with three elements 100000000001, 100000000002, 100000000003.
         *
         * Then output the array.
         *
         * Use the provided code template.
         *
         * long type is used to store big integer values. To indicate long value use L or l literal. Otherwise, it is considered as int.
         *
         * long twentyTwo = 22L; // L or l is a literal for longs
         */

        long[] longNumbers = {100_000_000_001L, 100_000_000_002L, 100_000_000_003L};
        System.out.println(Arrays.toString(longNumbers));

        /*
        使用先声明，在进行初始化和实例化，记得我们之间说过的，要对数字进行优化（使用_分隔数字）
         */

        long[] longNumbers1 = new long[3];
        longNumbers1[0] = 100_000_000_001L;
        longNumbers1[1] = 100_000_000_002L;
        longNumbers1[2] = 100_000_000_003L;
        System.out.println(Arrays.toString(longNumbers));
    }
}
