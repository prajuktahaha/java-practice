import java.util.Scanner;
public class primenumbersbetweentwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        for (int i = first ; i <= second ; i++){
            if(isPrime(i) == 1){
                System.out.println(i);
            }
        }
    }
    public static int isPrime (int num){
        if(num <= 1){
            return 0;
        }
        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
