import java.util.Scanner;
public class countdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int c = 0;
        for(c = 0 ; n!=0 ; n/=10){
            c++;
        }
        System.out.println("this is a " +  c  + "digit number");
    }
}
