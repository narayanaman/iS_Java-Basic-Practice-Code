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
class Grand_Child extends Son{
    public void Grand_Child(){
        System.out.println("That is Grand Child Method ");
    }
}

public class Hybrid_inheritance extends Grand_Child{
    public static void main(String []args){
        Grand_Child GC=new Grand_Child();
        GC.display();
        GC.mothertraits();
        GC.fathertraits();
        GC.Grand_Child();
    }
}
