import java.util.Scanner;
public class cl3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println(n);
        }
        else{
            System.out.println(-n);
        }
    }
}
