import java.util.Scanner;
import java.util.Arrays;
public class comparingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N1 = sc.nextInt();
        int [] Numbers1 = new int[N1];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < N1 ; i++){
            Numbers1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array");
        int N2 = sc.nextInt();
        int [] Numbers2 = new int[N2];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < N2 ; i++){
            Numbers2[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array");
        int N3 = sc.nextInt();
        int [] Numbers3 = new int[N3];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < N3 ; i++){
            Numbers3 [i] = sc.nextInt();
        }
        if(Arrays.equals (Numbers1 , Numbers2) && Arrays.equals (Numbers2 , Numbers3)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
