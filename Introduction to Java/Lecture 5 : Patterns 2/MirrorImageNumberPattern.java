/* Print the following pattern for the given N number of rows.
Pattern for N = 4
   1
  12
 123
1234

The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1
    12
  123
Sample Input 2:
4
Sample Output 2:
      1
    12
  123
1234 */




import java.util.Scanner;

public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;

        while(i <= n){
            int space = 1;
            while (space <= n-i){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while (star <= i){
                System.out.print(star);
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
