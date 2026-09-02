import java.util.Scanner;
import java.util.Arrays;
public class MinMaxInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int [] arrays = new int [n];
        for(int i = 0 ; i < arrays.length ; i++){
            System.out.println("Enter the " +  (i + 1 ) + "number");
            arrays[i] = sc.nextInt();
        }
        System.out.println("the array is : " + Arrays.toString(arrays));

        int min = arrays [0];
        int max = arrays [0];
        for(int i = 0 ; i < arrays.length ; i++){
            if(arrays[i] > max){
                max = arrays[i];
            }
            if(arrays[i] < min){
                min = arrays[i];
            }
        }
        System.out.println("The Max is : " + max + " , the min is : " + min);
    }
    
}
