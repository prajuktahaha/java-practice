//print series 1 , n , 2 , n-1 , 3 , n-2.....
import java.util.Scanner;
public class ss{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int i = 1;
        int j = n;
        while(i<=j){
            System.out.println(i);

            if(i!=j){
                System.out.println(j);
            }
            i++;
            j--;
        }
    }
}
