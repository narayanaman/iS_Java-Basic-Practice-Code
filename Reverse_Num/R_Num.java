import java.util.Scanner;
public class R_Num{
    public static void main(String [] args){
        int num,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number For Reverse : ");
        num=sc.nextInt();

        while(num != 0){
            int digit = num%10;
            rev = rev*10+digit;
            num=num/10;
        }
        System.out.print("Your Reverse Number : "+rev);
    }
}