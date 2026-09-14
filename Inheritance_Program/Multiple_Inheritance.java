interface  father{
    public void fathertraits();
}
interface mother{
    public void mothertraits();
}

class Son implements father,mother{
    public void fathertraits(){
        System.out.println("Got height from Father ");
    }
    public void mothertraits(){
        System.out.println("Got Mind From Mother ");
    }
    void display(){
        System.out.println("That is From Son ");
    }
}

public class Multiple_Inheritance extends Son{
    public static void main(String []args){
        Son S1=new Son();
        S1.fathertraits();
        S1.mothertraits();
        S1.display();
    }
}
