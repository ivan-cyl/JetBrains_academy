package Java_basics.Control_flow_statements.Branching_statements;

import java.util.Scanner;

public class The_un_ordered_sequence {
    public static void main(String[] args) {
        /**
         * Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false.
         *
         * Keep in mind, if a number has the same value as the following number, it does not break the order.
         * The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).
         *
         * Sample Input 1:
         * 9 8 7 6 5 4 3 2 1 0
         *
         * Sample Output 1:
         * true
         *
         * Sample Input 2:
         * 1 2 3 3 9 0
         *
         * Sample Output 2:
         * true
         *
         * Sample Input 3:
         * 1 2 5 5 2 3 0
         *
         * Sample Output 3:
         * false
         */

        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        int sup = temp;
//        boolean bool = true;
        int i = 0;
        int j = 0;
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            if (temp == 0) {
//                System.out.println(i % j == 0);
                System.out.println(i == j || i == 2 * j);
                break;
            } else if (temp < sup) {
                sup = temp;
//                bool=!bool;
                i += 1;
                j += 1;
            } else if (temp > sup) {
                sup = temp;
//                bool=!bool;
                i += 2;
                j += 1;
            } else continue;
        }

        /*
        使用while语句嵌套if……else语句完成，值得注意的是，需要选择正确的位置输出信息，以及最初sup和temp的取值。而且最重要的一点是我们如何判断数组是顺序还是逆序呢，我们首先可以想到使用Boolean值来储存，我首先采用的方法就是在else if语句下使用Boolean逆转的方式，但是我忽略了循环会持续改变Boolean值，因此我使用i和j用来计数，对结果进行取余以判断是否参与了两个不同的if语句中,但是可能由于存在0，所以需要使用减法来解决
         */

        Scanner scanner1 = new Scanner(System.in);
        int ascending = 0;
        int descending = 0;
        int firstNum = scanner.nextInt();
        int secondNum;
        while ((secondNum = scanner1.nextInt()) != 0) {
            if (secondNum > firstNum) {
                ascending++;
            }
            if (secondNum < firstNum) {
                descending++;
            }
            firstNum = secondNum;
        }
        System.out.println(ascending == 0 || descending == 0);

        /*
        此方法也是极其巧妙，使用变量存在，如果不涉及其他循环其值就会保证为0，这种方法是更加巧妙
         */

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        boolean c = true;
        boolean fl = true;
        boolean fm = true;
        while (sc.hasNext() && a != 0) {
            if (a < b && fl) {
                b = a;
                fm = false;
            }
            if (a > b && fm) {
                b = a;
                fl = false;
            }
            if (a < b && !fl) {
                c = false;
            }
            if (a > b && !fm) {
                c = false;
            }
            a = sc.nextInt();
            if (a == 0 || b == 0) {
                break;
            }
        }
        System.out.println(c);

        /*
        使用了Boolean存储数据，并且通过修改值来进行判断
         */

        Scanner scanner2 = new Scanner(System.in);

        boolean desc = false;
        boolean asc = false;
        String result = "true";
        int prev = scanner2.nextInt();
        while (scanner2.hasNextInt()) {
            int k = scanner.nextInt();
            if (k == 0) {
                break;
            }
            if (k > prev) {
                asc = true;
            }
            if (k < prev) {
                desc = true;
            }
            if (asc && desc) {
                result = "false";
                break;
            }
            prev = k;
        }
        System.out.println(result);

        /*
        此种解法和上一提类似，通过修改值来进行判断
         */

        var scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i1 = 0; i1 < str.length - 1; i1++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        boolean flg1 = true;
        boolean flg2 = true;
        for (int i1 = 1; i1 < str.length - 1; i1++) {
            if (arr[i - 1] > arr[i]) {
                flg1 = false;
            }
            if (arr[i - 1] < arr[i]) {
                flg2 = false;
            }
        }
        System.out.println(flg1 || flg2);


        Scanner scanner3 = new Scanner(System.in);
        boolean ascends = false;
        boolean descends = false;
        int firstInput = scanner3.nextInt();
        boolean shouldEnd = false;
        while (firstInput != 0 && !shouldEnd) {
            int nextInput = scanner.nextInt();
            if (nextInput == 0 || ascends && descends) {
                shouldEnd = true;
            } else if (firstInput < nextInput) {
                ascends = true;
            } else if (firstInput > nextInput) {
                descends = true;
            }
            firstInput = nextInput;
        }
        System.out.println(!(ascends && descends));


        Scanner scanner4 = new Scanner(System.in);
        String numString = scanner4.nextLine();
        String[] numArray = numString.split(" ");
        boolean boo = true;
        int action = numArray.length;
        switch (action) {
            case 1:
                boo = true;
                break;
            case 2:
                boo = true;
                break;
            default:
                if (Integer.parseInt(numArray[0]) <= Integer.parseInt(numArray[1])) { //check if nums are ascending
                    if (numArray[numArray.length - 1].equals("0")) {
                        for (int i2 = 0; i2 < numArray.length - 2; i2++) {
                            if (!(Integer.parseInt(numArray[i2]) <= Integer.parseInt(numArray[i2 + 1]))) {
                                boo = false;
                                break;
                            }
                        }
                    } else {
                        for (int i2 = 0; i2 < numArray.length - 1; i2++) {
                            if (!(Integer.parseInt(numArray[i2]) <= Integer.parseInt(numArray[i2 + 1]))) {
                                boo = false;
                                break;
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < numArray.length - 1; i2++) {
                        if (!(Integer.parseInt(numArray[i2]) >= Integer.parseInt(numArray[i2 + 1]))) {
                            //check if nums are descending
                            boo = false;
                            break;
                        }
                    }

                }
        }
        System.out.println(boo);

        /*
        总的思想是相似的，我们可以看多种不同的解决方法，来完成自己的思想的提升
         */
    }
}
