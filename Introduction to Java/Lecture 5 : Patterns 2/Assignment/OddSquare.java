/* Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357 */


import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i =1;

        while (i<= n){
            int j =1;
            int num = (2*i -1);
            while (j <= n){
                if (j > 0){
                    System.out.print(num);
                    num = num +2;
                }
                 if (num > (2*n)-1){
                     num = 1;
                 }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
