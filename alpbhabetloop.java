import java.util.Scanner;
public class alphabetloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            char ch = ((char) ('A' + i-1));
            for(int j = 1 ; j<=n ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
