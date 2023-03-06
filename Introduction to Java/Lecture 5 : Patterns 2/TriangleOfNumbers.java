/* Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654 */




import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n){
            int space = 1;
            while (space <= n-i){
                System.out.print(' ');
                space++;
            }
            int num = 1;
            int p = i;
            while (num <=i){
                System.out.print(p);
                p++;
                num++;
            }
            int dec = 2*i-2;
            int j =1;
            while (dec >= j){
                System.out.print(dec);
                dec-- ;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
