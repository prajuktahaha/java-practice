import  java.util.Scanner;
import java.util.Arrays;
public class countOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arrays = new int[n];
        for(int i = 0 ; i < arrays.length ; i++){
            System.out.println("Enter the " + (i+1) +  "element");
            arrays[i] = sc.nextInt();
        }
        System.out.println("The array is " + Arrays.toString(arrays));
        System.out.println("enter the number you are searching for : ");
        int s = sc.nextInt();
        int c = 0;
        for(int i = 0 ; i < arrays.length ; i++){
            if(arrays[i] == s){
                c++;
            }
        }
        System.out.println(s + " it ocuured " + c + "times");


    }
}
