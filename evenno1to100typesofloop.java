public class a {
    public static void main(String[] args) {
       //print even no from 1 to 100
        //using while loop
        int i = 1;
        while(i<=100){
            i++;
        if(i % 2 == 0){
                System.out.println(i);
            }
            System.out.println(i);
        }
        //forloop
        for(int i = 0 ; i <= 100 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        //dowhile
        int i = 1;
        do{
            i++;
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        while(i<=100);
    }
}
