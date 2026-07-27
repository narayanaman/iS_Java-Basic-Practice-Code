
import java.util.Scanner;

public class RATING {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int rating;
        System.out.println("Enter The Rating Between  1 & 5");
        rating = Sc.nextInt();

        switch (rating) {
            case 1:
                System.out.println("1-Star");
                break;
            case 2:
                System.out.println("2-Star");
                break;
            case 3:
                System.out.println("3-Star");
                break;
            case 4:
                System.out.println("4-Star");
                break;
            case 5:
                System.out.println("5-Star");
                break;
            default:
                System.out.println("Invalid Rating");
                break;
        }
    }
}
