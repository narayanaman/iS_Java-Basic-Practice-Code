//PRINT THE ODD NUMBER WHICH IS DIVISIBLE BY 3
public class odd_Printing {
    public static void main(String []args){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%2==1){
                System.out.println(i);
            }
        }
    }
}
