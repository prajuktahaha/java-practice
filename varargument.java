public class varargs1 {
    public static int sum (int ... numbers){
        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.println("sum of two number is : " + sum(22 , 66 ));
        System.out.println("sum of three number is : " + sum(22 , 33 , 66 ));
        System.out.println("sum of five number is : " + sum(22 ,33 , 44 , 55, 66 ));

    }
}
