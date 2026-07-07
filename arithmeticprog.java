//display AP 2 , 5 , 8 ,11 upto n terms
import java.util.Scanner;
public class arprogression {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {2 , 5 , 8 , 11};
        System.out.println(" enter the 'n'th term : ");
        int n = sc.nextInt();
        int a = arr[0];
        int d = arr[1] - arr[0];
        int AP = a + (n - 1) * d;
        System.out.println("for the" + n + "th term the AP is" + AP);
    }
}
//ok i did it very easy way u can do it better its noob commo
