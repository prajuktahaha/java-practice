public class Arraysmethods {
    public static void main(String[] args) {
        int [] numbers = {9 , 5 , 7 , 8 , 6};
        System.out.println(numbers);
        change(numbers);
        printArrays(numbers);
    }
    public static void change(int [] numbers){
        numbers [0] = 1;
        numbers [1] = 2 ;
    }
    public static void printArrays(int [] numbers){
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println("the Arrays changed to : " + numbers[i]);
        }
    }
}
