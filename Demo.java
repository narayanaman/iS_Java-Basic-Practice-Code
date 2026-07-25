
import java.util.Scanner;

public class Demo {

    void name() {
        System.out.println("Hello");
    }

    void Adult() {
        int age = 20;
        if (age >= 18) {
            System.out.println("You are Adult And you can vote");
        } else if (age >= 20) {
            System.out.println("You Can Drive the Car or Vehicales");
        } else {
            System.out.println("You Can't vaote Or Drive");
        }
    }

    void Loop(){
        int number=0;
        for(int i=0; i<=number*10; i++){
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Say hello");
        Demo aa = new Demo();
        aa.name();
        Demo adult=new Demo();
        adult.Adult();
        Demo loop=new Demo();
        loop.Loop();
        Sc.close();
    }

}
