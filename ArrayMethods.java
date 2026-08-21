import java.util.Scanner;
import java.util.Arrays;
public class arraysmethods {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int [] num = new int[N];
        System.out.println("Enter " + N + " integer");
        for(int i  = 0 ; i < N ; i++){
            num[i] = sc.nextInt();
        }
        Change(num , sc);
        PrintFinalArray(num);
        sc.close();
    }
    public static void Change(int [] num , Scanner sc){
        System.out.println("Enter the index u want to change : ");
        int i = sc.nextInt();
        System.out.println("Enter the value you want to change : ");
        int value  = sc.nextInt();
        num[i] = value;
    }
    public static void PrintFinalArray(int [] num){
        System.out.println("the final modified Array is : " + Arrays.toString(num));
    }
    
}
