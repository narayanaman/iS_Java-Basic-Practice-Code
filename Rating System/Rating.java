import java.util.Scanner;

public class Rating{
    public static void main(String []args){
        int Rating;
        System.out.print("Enetr Your FeedBack : ");
        Scanner sc=new Scanner(System.in);
        Rating=sc.nextInt();
        switch(Rating){
            case 1:
            System.out.println("Star - 1");
            break;
            case 2:
            System.out.println("Star - 2");
            break;
            case 3:
            System.out.println("Star - 3");
            break;
            case 4:
            System.out.println("Star - 4");
            break;
            case 5:
            System.out.println("Star - 5");
            break;
            default:
            System.out.println("Invalid Input");
        }

    }
}