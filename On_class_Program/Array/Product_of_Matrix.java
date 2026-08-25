import java.util.Scanner;
public class Product_of_Matrix{
    public static void main(String []args){
        Scanner Sc=new Scanner (System.in);
        int rows,cols;
        System.out.println("Enter the no of Rows of First Matrix :  ");
        rows=Sc.nextInt();
        System.out.println("Enter the no of cols of First Matrix :  ");
        cols=Sc.nextInt();

        int [][]arr=new int[rows][cols];
        System.out.print("Enter the Matrix of Element :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=Sc.nextInt();
            }
        }
        int r2,c2;
        System.out.println("Enter the no of Rows in Second Matrix :");
        r2=Sc.nextInt();
        System.out.println("Enter the no of cols in Second Matrix :");
        c2=Sc.nextInt();
        
    }
}