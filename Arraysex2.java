public class arrayex2 {
    public static void main(String[]args){
        int [] arrays = {1 , 2  , -3 , 5 , 7};
        int sum = 0;
        int product = 1;
        double average;
        for(int i = 0 ; i < arrays.length ; i++){
            sum += arrays[i];
            product *= arrays[i];
        }
        average = (double)sum/arrays.length;
        System.out.println("The sum is : " + sum + " , The product is : " + product + " , The Average is : " + average);
    }
    
}
