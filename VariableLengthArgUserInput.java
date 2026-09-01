import java.util.Scanner;
public class varargs1 {
    public static int sum (int ... numbers){
        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many numbers u want to find sum of: ");
        int c = sc.nextInt();
        int [] Numbers = new int[c];
        for(int i = 0 ; i < c ; i++ ){
            System.out.println("Enter the number " +(i + 1) + " : ");
            Numbers[i] = sc.nextInt();
        }
        System.out.println("Sum is : " + sum(Numbers));
    }
}
