import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of desire multiplication table you want : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            int mul = n*i;
           System.out.println(n + "x" + i + "=" + (mul));
        }
    }
}
