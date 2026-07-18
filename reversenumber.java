import java.util.Scanner;
public class reversenumber {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int rev = 0;
        for(rev = 0 ; n!=0 ; n/=10){
            rev = (rev*10)+(n%10);
        }
        System.out.println(rev);
    }
}
