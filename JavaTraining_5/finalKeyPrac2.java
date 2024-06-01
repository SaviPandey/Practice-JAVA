class FinalMethod{
    final void demo(){
        System.out.println("FinalMethod Class Method");
    }
}
class ABC extends FinalMethod{
    // void demo(){           //Cant override final method                    
    //     System.out.println("ABC class method");
    // }
}
public class finalKeyPrac2 {

    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.demo();
    }
}
