/* Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  ***
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   ***
  *****
 ******* */




import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i= 1;

        while(i<=n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(' ');
                spaces++;
            }

            int star = 1;
            while (star <= (2 * i - 1)) {
                // 2*1 - 1 = 1(*) , 2*2 - 1 = 3(***), 2*3 - 1 = 5(*****) , 2*4 - 1 = 7(********)
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
