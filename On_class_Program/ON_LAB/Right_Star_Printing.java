public class Right_Star_Printing {
    public static void main(String []args){
        int S=5;
        for(int i=1; i<=S; i++){
             for(int k=1; k<=5-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
