package Java_basics.Control_flow_statements.Branching_statements;

import java.util.Scanner;

public class Bus_tour {
    public static void main(String[] args) {
        /**
         * A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
         *
         * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?
         *
         * The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.
         *
         * You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.
         *
         * Sample Input 1:
         * 234 8
         * 465 453 981 463 1235 871 475 981
         *
         * Sample Output 1:
         * Will not crash
         *
         * Sample Input 2:
         * 211 5
         * 871 205 123 871 1681
         *
         * Sample Output 2:
         * Will crash on bridge 2
         */

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int num = scanner.nextInt();
        int i = 0;
        for (; i < num; i++) {
            int temp = scanner.nextInt();
            if (height >= temp) {
//                System.out.println("Will crash on bridge " + i + 1);
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
//            else {
//                System.out.println("Will not crash");
//            }
        }
        if (i == num) {
            System.out.println("Will not crash");
        }

        /*
        此题因为如果bus高度大于等于桥的高度就要输出桥的位置（第几个），为了保持较好的阅读性，所以使用了for循环而不是while循环，二者均能实现相关功能，但是for循环可能会更加易读
        而此题我也犯了一些愚蠢的错误，我在else里使用System.out.println();而这样是错误的，这样我们就会造成一种错误，每次正确（可以）通过桥下都要打印一次，使代码不满足需求,而且此题我们需要使用i来进行计数以判断最后是否符合规范输出。因为使用i计数，可能就会使用i==num-1来作为判断准则，这可能就是错误所在，我们要明白最后退出循环时，num是等于i了（完整退出循环），而且在上面对字符串拼接时，需要使用括号增加优先级，不然就会造成字符串的拼接而不是整数的拼接，我是不会告诉你我全都中招了的
         */

        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numberOfBridges = sc.nextInt();
        int counter = 0;
        while (counter < numberOfBridges) {
            int bridgeHeight = sc.nextInt();
            counter++;
            if (bridgeHeight <= busHeight) {
                System.out.print("Will crash on bridge " + counter);
                break;
            }
            if (counter == numberOfBridges) {
                System.out.print("Will not crash");
            }
        }

        /*
        可能在实现本题上，while循环并不一定比for循环差，因为之前的思考不充分而妄下结论
         */

        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int n = sc2.nextInt();
        boolean r = true;
        int c = 0;
        for (int j = 0; j < n; j++) {
            int a = sc2.nextInt();
            r = b < a;
            if (!r) {
                c = j + 1;
                break;
            }
        }
        System.out.println(r ? "Will not crash" : "Will crash on bridge " + c);

        /*
        解决方法有多种，大家可以参考一下，使用Boolean用于判断也是十分巧妙
         */

    }
}
