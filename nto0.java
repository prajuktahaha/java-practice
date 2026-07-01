import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of desire number : ");
        int n = sc.nextInt();
        for(int i = n ; i>0 ; i--){
            System.out.println(i);
        }
    }
}
