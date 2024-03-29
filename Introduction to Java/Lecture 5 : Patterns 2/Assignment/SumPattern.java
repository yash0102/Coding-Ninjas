/* Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15    */




import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;
        int sum = 0;

        while (row <= n){
            sum = sum + row;
            int col = 1;
            while (col <= row){
                System.out.print(col);
                if (col == row){
                    System.out.print('=');
                }else {
                    System.out.print('+');
                }
                col ++;
            }
            System.out.print(sum);
            System.out.println();
            row ++;
        }
    }
}
