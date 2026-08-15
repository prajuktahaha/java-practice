import java.util.Scanner;
public class useridentity {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user : ");
        String name = sc.nextLine();
        UserF(name);
        System.out.println("Enter the age of the user : ");
        int age = sc.nextInt();
        UserF(age);
    }
    public static String UserF( String name){
        return name;
    }
    public static int UserF( int age){
        return age;
    }
    
}
