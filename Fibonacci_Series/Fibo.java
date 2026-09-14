import java.util.Scanner;
public class Fibo{
    public static void main(String [ ]args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter How many Trun of Go Fibonacci  : ");
        n=sc.nextInt();

        int first_no=0,Sce_no=1,next;
        
        for(int i=0;i<=n; i++){
            next=first_no+Sce_no;
            System.out.print(" "+next+" ");
            first_no=Sce_no;
            Sce_no=next;
        }
    }
}