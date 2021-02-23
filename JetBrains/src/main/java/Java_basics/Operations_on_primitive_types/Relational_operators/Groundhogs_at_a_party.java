package Java_basics.Operations_on_primitive_types.Relational_operators;

import java.util.Scanner;

public class Groundhogs_at_a_party {
    public static void main(String[] args) {
        /**
         * Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups. But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20 Reese's peanut butter cups, inclusive unless it is the weekend, in which case they will need 15 to 25 Reese's peanut butter cups, inclusive.
         *
         * Write a Java program that reads two values:
         *
         * the first is the number of Reese's peanut butter cups;
         * the second is a boolean representing whether it is the weekend.
         * The program must print the boolean value that indicates the party is successful or not.
         *
         * Sample Input 1:
         * 5 true
         *
         * Sample Output 1:
         * false
         *
         * Sample Input 2:
         * 16 false
         *
         * Sample Output 2:
         * true
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean bool = scanner.nextBoolean();
        System.out.println(number >= 10 && number <= 20 && bool == false || number >= 15 && number <= 25 && bool == true);

        /*
        此题依旧使用了之前题目的简化方法，这是一种比较简单的方法，虽然代码更加简洁，但是可读性并没有上升，且无论是时间复杂度还是空间复杂度并没有质的飞跃，而却大大地加大了他人阅读代码的难度，这样做是不好的，我们如果在大型的开发中，应该将其封装为function
         */

        Scanner scanner1 = new Scanner(System.in);
        int cups = scanner1.nextInt();
        boolean isWeekend = scanner1.nextBoolean();
        System.out.print(isWeekend ? cups >= 15 && cups <= 25 : cups >= 10 && cups <= 20);

        /*
        类似的，我们可以使用三目运算符来进行输出，虽然进一步简化了代码，但同时也加大了运算的难度
         */
    }
}
