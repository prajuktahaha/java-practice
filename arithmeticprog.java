//display AP 2 , 5 , 8 ,11 upto n terms
import java.util.Scanner;
public class arprogression {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int [] arr = {2 , 5 , 8 , 11};
        System.out.println("how many n terms : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n && i < arr.length ; i++){
            System.out.print(a+i*d);
        }
        System.out.println(arr[i] + " ");
    }
}
