package Java_basics.Simple_programs.Scanning_the_input;

import java.util.Scanner;

public class Scanning_the_input {
    public static void main(String[] args) {
        /**
         * Write a program that reads three strings and outputs them in the reverse order, each in a new line.
         *
         * Sample Input 1:
         * Java
         * Programming
         * Language
         *
         * Sample Output 1:
         * Language
         * Programming
         * Java
         */
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        System.out.println(input3);
        System.out.println(input2);
        System.out.println(input1);
        /*
        虽然在IDEA开发的过程中，我们不用手动导入包，但是我们不能忘记，我们使用的功能的确使用了包
        While we didn't have to import packages manually during the development of IDEA, we couldn't forget that the functionality we were using did use packages

        还有我们应该注意到使用赋值符号时应该使用空格进行分隔（喔，我老是忘记）
        Also, we should note that assignment symbols should be separated by Spaces (oh, I always forget).

        当然该问题也不仅仅只有一种解决方法，我们还有其他方法可以完成操作
        Of course, there is not just one solution to this problem, there are other ways to do it
         */

        Scanner scanner1 = new Scanner(System.in);
        int n = 4;
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner1.nextLine();
        }
        for (int j = n - 1; j >= 0; j--) {
            System.out.println(strings[j]);
        }

        /*
        当然需要注意的是，我们的需求是进行倒序输出，且for循环中n的取值是否考究
         */

        /**
         * Write a program that reads four words and outputs them in the same order, each in a new line.
         *
         * Sample Input 1:
         * Hello
         * Java
         * Future programmer
         *
         * Sample Output 1:
         * Hello
         * Java
         * Future
         * programmer
         */

        Scanner scanner3 = new Scanner(System.in);
        String input11 = scanner3.next();
        String input22 = scanner3.next();
        String input33 = scanner3.next();
        String input44 = scanner3.next();
        System.out.println(input11);
        System.out.println(input22);
        System.out.println(input33);
        System.out.println(input44);

        Scanner scanner4 = new Scanner(System.in);
        int m = 4;
        String[] strings1 = new String[m];
        for (int i = 0; i < m; i++) {
            strings1[i] = scanner4.next();
        }
        for (int j = 0; j < m; j++) {
            System.out.println(strings1[j]);
        }

        /*
        这一题与上一题有着极大的相似之处，通过对m（n）的修改，便可以解出该题
        This problem is very similar to the previous one, and can be solved by modifying m (n)

        当然也有好的方法，非常巧妙，但是需要补充一点知识点
        String next（）读取输入的下一个单词，以空格作为分隔符，返回输入的字符串
        int hasNext()读取下一个单词，以空格作为分隔符，返回检测输入中是否还有其他单词
        String nextLine()读取输入的下一行内容，返回一个字符串
       */

        Scanner scanner5 = new Scanner(System.in);
        while (scanner5.hasNext()) {
            System.out.println(scanner5.next());
        }

        /**
         * Write a program that reads five words from the standard input and outputs each word in a new line. The words should be in the same order.
         *
         * Sample Input 1:
         * This Java platform
         * is adaptive
         *
         * Sample Output 1:
         * This
         * Java
         * platform
         * is
         * adaptive
         */
        //此题同理可以使用上一题补充方法，此方法极为巧妙且有良好的拓展性，低耦合的程序，且有良好的可读性
        Scanner scanner6 = new Scanner(System.in);
        while (scanner6.hasNext()) {
            System.out.println(scanner6.next());
        }

        /*
        可以使用split方法来完成新的实现方法
        split() 方法根据匹配给定的正则表达式来拆分字符串
        而且可以使用增强 for 循环，可以简化题目输出
         */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arrOfStr = str.split(" ");
            for (String a : arrOfStr) {
                System.out.println(a);
            }
        }

        /*
        使用单个for循环即可实现相关操作，比较巧妙，因为nextLine是通过回车来判断的
         */
        Scanner scanner7 =  new Scanner(System.in);
        String[] a = new String[5];

        for (int i = 0; i < 5; i++) {
            a[i] = scanner7.next();
            System.out.println(a[i]);
        }
    }
}
