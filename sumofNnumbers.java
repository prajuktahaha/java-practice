import java.util.Scanner;
public class sumofNnumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println("sum of " + n +  "  numbers  is " + sum );

        System.out.println((n*(n+1))/2);
    }
}
