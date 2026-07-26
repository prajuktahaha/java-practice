import java.util.Scanner;
public class userstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = sc.nextLine();
        System.out.println("Enter an additional alphabet : ");
        char ch = sc.next().charAt(0);
        st = st + ch;
        System.out.println(st);
    }
}
