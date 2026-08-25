// wriet a program to add 2 Matrix .

import java.util.Scanner;
public class Add_Matrix{
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int  rows,cols;
        System.out.println("Enter the number  of Rows :");
        rows=Sc.nextInt();
        System.out.println("Enter the number of columns :");
        cols=Sc.nextInt();

        int a[][]=new int [rows][cols];
        int b[][]=new int [rows][cols];
        int SUM[][]=new int [rows][cols];

        System.out.println("Enetr the First Matrix :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enetr the Second Matrix :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                b[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Addition of Matrix  :");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                SUM[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Printing SUM of Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(SUM[i][j]+"  ");
            }
        }
    }
}