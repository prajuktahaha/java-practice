import java.util.Scanner;
public class minnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int s = sc.nextInt();
        int [] arr = new int[s];
        System.out.println("Enter the Array : ");
        for(int i = 0 ; i < s ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(min >  arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum number in an array is : " + min);
    }
}
