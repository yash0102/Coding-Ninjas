import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int firstHalf = (n+1)/2;
        int secondHalf = n/2;

        // first Half
        int i =1;
        while(i <= firstHalf){
            int space = 1;
            while (space <= firstHalf -i){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while( star <= (2*i -1)){
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }

        // second Half
        int j = secondHalf;
        while (j >= 1){
            int space =1;
            while(space <= (secondHalf - j +1)){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while( star <= (2*j)-1){
                System.out.print('*');
                star++;
            }
            System.out.println();
            j--;
        }
    }
}
