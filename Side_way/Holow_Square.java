public class Holow_Square {
    public static void main(String []args){
        int j=1,i=1;
        for(i=1; i<=5; i++){
            if(i==1 || i==5){
                for(j=1; j<=5; j++){
                    System.out.print("*");
                }
            }
             else{
                    if(j==1 || j==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
// *****
// *   *
// *   *
// *   *
// *****