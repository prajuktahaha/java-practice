import java.util.Scanner;
public class greetingsmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SayHi();
        System.out.println("Enter the name u want to greet");
        String name = sc.nextLine();
        SayHi(name);
    }
    public static void SayHi(){
        System.out.println("Hi");
    }
    public static void SayHi(String name){
        System.out.println("Hi " + name);
    }
}
