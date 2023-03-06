/* Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
* */




import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // for star border we need to print '*' before & after every statement

        System.out.println('*');

        // Upper Part
//            1
//            121
//            12321
//            1234321
//            123454321

        for(int i=1; i<=n; i++) {

            System.out.print('*');

            //Two inner loop

            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
//                1
//                12
//                123
//                1234
//                12345

            for(int j=i-1; j>=1; j--) {
                System.out.print(j);
            }
//                1
//                 21
//                  321
//                   4321

            System.out.print('*');
            System.out.println();
        }

        //  Lower Part
//           1234321
//           12321
//           121
//           1

        for(int i=n-1; i>=1; i--) {

            System.out.print('*');
            // Two inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
//                1234
//                123
//                12
//                1
            for(int j=i-1; j>=1; j--) {
                System.out.print(j);
            }
//                     321
//                    21
//                   1
            System.out.print('*');
            System.out.println();
        }
        System.out.print('*');
    }
}
