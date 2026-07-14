import java.util.Scanner;
public class ss{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 97 to 122 for a-z or 65 to 90 for A - Z : ");
        int n = sc.nextInt();
        System.out.println((char)(n));
    }
}
