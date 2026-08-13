import java.util.Scanner;
public class rough{
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        Point p1 = new Point();
        System.out.println("Enter the value of x : ");
        p1.x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        p1.y = sc.nextInt();
        System.out.println("x : " + p1.x + " y  : " + p1.y);
        change(p1 , sc);
        System.out.println("x : " + p1.x + " y : " + p1.y );
    }
    public static void change(Point p , Scanner sc){
        System.out.println("what number u want to change for x : ");
        p.x = sc.nextInt();
        System.out.println("what number u want to change for y : ");
        p.y = sc.nextInt();
    }
}
class Point{
    int x;
    int y;
}
