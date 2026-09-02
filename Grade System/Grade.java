import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Tour Marks :");
        n=sc.nextInt();

        if(n>=90){
            System.out.println("Grade A");
        }else if(n>=80){
            System.out.println("Grade B");
        }else if(n>=60){
            System.out.println("Grade C");
        }else if(n>=40){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}