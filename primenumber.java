import java.util.Scanner;
public class prime {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if(n <= 1){
        System.out.println("not prime");
        return ;
        }
        for(int i = 2 ;  i * i <= n ; i++){
            if (n % i == 0){
                System.out.println("Its not prime");
            return;
        }
        }
        System.out.println("Prime");
    }
}
