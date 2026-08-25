import java.util.Scanner;
public class isShiftClock {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of an Array :");
        n=sc.nextInt();
        int []arr =new int [n];
        System.out.println("Enetr the Element inside an Array :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing original Array :");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the no of digit to shift :");

        int d=sc.nextInt();
        int []temp =new int [n];
        for(int i=0; i<n; i++){
            temp[(i+d)%n]=arr[i];
        }
        System.out.println("Printing array after shift :");
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" ");
        }
    }
}