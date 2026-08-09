
import java.util.Scanner;

public class isLargest {

    public static void main(String[] args) {
        int n = 0;
        System.out.print("Enetr size of Array :");
        Scanner Sc = new Scanner(System.in);
        n = Sc.nextInt();
        int[] arr = new int[n];

        System.out.println();
        System.out.print("Enter The Element of Array :");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Number is :" + max);
    }
}
