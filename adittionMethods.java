import java.util.Scanner;
public class additionMethods{
    public static int numberOne(){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        return one;
    }
    public static int numberTwo(){
        Scanner sc= new Scanner(System.in);
        int Two = sc.nextInt();
        return Two;
    }
    public static int sum (int numberOne , int numberTwo){
        int sum = numberOne + numberTwo;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Number 1 ");
       int one = numberOne();
        System.out.println("Number 2");
        int Two = numberTwo();
        System.out.println("Sum of the number is :  " + sum(one , Two));
    }
}
