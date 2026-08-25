import java.util.Scanner;
public class Arr_SUM_Product {
    public static void main(String []args){
        int rows,cols;
        int Sum=0,Product=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of Rows :");
        rows=sc.nextInt();
        System.out.println();
        System.out.print("Enter the Number of Columns :");
        cols=sc.nextInt();
        int [][]arr=new int[rows][cols];
        System.out.println("Enter Your Matrix :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==j){
                    Sum=Sum+arr[i][j];
                    Product=Product*arr[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal element "+Sum);
        System.out.println("Product of Diagonal element "+Product);
        System.out.println("It's your Matrix :" + arr[rows][cols]);
    }
}
