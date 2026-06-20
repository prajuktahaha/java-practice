import java.util.Scanner;
public class countdigit {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : " );
        int n = sc.nextInt();
        if(n>=1000 && n<=9999){
            System.out.println("its 4 digit no");
        }
        else{
            System.out.println("its not dumbo");
        }
    }
}
