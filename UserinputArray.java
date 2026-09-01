import java.util.Scanner;
import java.util.Arrays;
public class UserinputArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int [] numbers = new int [n];
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println("Enter the number you want " + (i+1) + ":");
            numbers[i] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(numbers));
    }
}
