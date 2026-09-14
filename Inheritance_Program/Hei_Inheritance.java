class father{
    public
     void Property(){
        System.out.println("Father has property");
    }
}
class son extends father{
    public
     void bike(){
        System.out.println("Son has Bike ");
    }
}

class daughter extends father{
    public
     void scooty(){
        System.out.println("Daughter has Scooty");
    }
}

public class Hei_Inheritance{
    public static void main(String []args){
        son s1=new son();
        s1.Property();
        s1.bike();

        daughter d1=new daughter();
        d1.Property();
        d1.scooty();
    }
}