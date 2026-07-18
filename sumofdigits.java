import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit of a number : ");
        int n = sc.nextInt();
        int sum  = 0 ;
        for( ;n!=0 ; n/=10){
            sum = sum + (n%10);
        }
        System.out.println(sum);
    }
}
