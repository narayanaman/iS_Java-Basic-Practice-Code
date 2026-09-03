public class Star {
    public static void main(String []args){
        int n=5;
        for(int i=1; i<=n; i++){

            // space ke liye

            for(int k=i; k<=n; k++){
                System.out.print(" ");
            }

            // Star ke liye

            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower body of Dimond.

        for(int i=n-1; i>=1; i--){
            for(int k=i; k<=n; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
