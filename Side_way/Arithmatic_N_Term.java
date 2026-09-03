import java.util.Scanner;
public class Arithmatic_N_Term{
    public static void main(String [] args){
        int n,a=2;
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enetr the Term which Have to Go :");
        n=Sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(a +" ");
            a+=3;
        }
    }
}