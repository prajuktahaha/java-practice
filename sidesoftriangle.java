import java.util.Scanner;
public class sidesoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sides of the Triangle : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A < B+C && B < C+A && C < A+B){
            System.out.println("yes ! it forms a triangle");
        }
        else{
            System.out.println("No it doesnt");
        }
    }
}
