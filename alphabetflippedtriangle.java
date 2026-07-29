import java.util.Scanner;

public class alphabetflippedtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            char ch = 'A';
            for(int j = 1 ; j <= n+1-i ; j++){
                System.out.print((char) (ch + j - 1));
            }
            System.out.println();
        }
    }
}
