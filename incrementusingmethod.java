public class incrementusingmethod{
    public static void increment(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);
    }
}
