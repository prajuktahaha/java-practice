//compare if area is greater than perimeter of the rectangle
import java.util.Scanner;
public class areaandperimeterofrectangle {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        if(area > perimeter){
            System.out.println("Yes area is greater than perimeter");
        }
        else{
            System.out.println("no");
        }
    }
}
