package Java_basics.Control_flow_statements.The_while_and_do_while_loops;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        /**
         * Ann puts MM money in the bank. The bank increases Ann's deposit by PP percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?
         *
         * The input contains three integers M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
         * Output the answer to Ann's question.
         *
         * Sample Input 1:
         * 1 100 8
         *
         * Sample Output 1:
         * 3
         *
         * Sample Input 2:
         * 100 15 120
         *
         * Sample Output 2:
         * 2
         */

        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int i = 0;
        while (m < k) {
            m = m * (1 + p / 100);
            i++;
        }
        System.out.println(i);

        /*
         这题可能比较简单，使用小学应用题就可以完成，但是我们需要注意一个细节，就是这个输入的比率是百分之多少%，所以需要除以100，再因为涉及到除法，所以可能会产生小数，为了结果的准确性，我们需要使用float和double类型，推荐使用double类型
          */
    }
}
