import java.util.Scanner;
public class incrementusingmethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        Increment(x);
    }
    public static void Increment(int x){
        x++;
        System.out.println(x);
    }
}
