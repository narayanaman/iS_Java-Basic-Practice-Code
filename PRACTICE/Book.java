//  1. Create a Book Class with title and Price . ,,
//  Create to objects and display details.

class Books{
    void display(){
        String title="Gita";
        int price=250;

        System.out.println("Title :"+title);
        System.out.println("Price :"+price);

    }
}

public class Book {
    public static void main(String []args){
        Books b1=new Books();
        b1.display();
    }
}
