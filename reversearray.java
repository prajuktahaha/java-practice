import java.util.Scanner;
public class reversearray {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();
        int [] arr = new int [s];
        System.out.println("Enter the array : ");
        for(int i = 0 ; i < s ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse the array : ");
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
