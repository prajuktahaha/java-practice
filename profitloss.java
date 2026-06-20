import java.util.Scanner;
public class profitloss {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of SP");
        double SP = sc.nextDouble();
        System.out.println("Enter the vaue of CP");
        double CP = sc.nextDouble();
        if(SP > CP){
            System.out.println("its profit of " + (SP-CP));
            System.out.println("Profit % = " + ((SP - CP) / CP * 100));
        }
        else if (SP < CP){
            System.out.println("its loss of " + (CP-SP));
            System.out.println("Loss % = " + ((CP - SP) / CP * 100));
        }
        else{
            System.out.println("see again");
        }
    }
}
