
import java.util.Scanner;

public class Table_Printing {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Hello Sir/Mam Please Enetr a Random Number :");
        num = Sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
