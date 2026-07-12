//print 99 , 95 , 91 , 87
import java.util.Scanner;
public class ss {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int x = sc.nextInt();
        int [] arr = new int[x];
        System.out.println("Enter the array : ");
        for(int i = 0 ; i < x ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the n term : ");
        int n = sc.nextInt();
        int a = arr[0];
        int d = arr[1]-arr[0];
        int AP = a + (n-1) * d;
        System.out.println("for the" + n + "th term the AP is" + AP);
    }
}
