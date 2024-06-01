interface RBI{
    void findInterest();
}
class SBI implements RBI{
    public void findInterest(){
        System.out.println("SBI interest logic");
    }
}
class PNB implements RBI{
    public void findInterest(){
        System.out.println("PNB interest logic");
    }
}
class MHB implements RBI{
    public void findInterest(){
        System.out.println("MHB interest logic");
    }
}
public class MultipleClass {
    public static void main(String[] args) {
        RBI r1, r2, r3;
        r1 = new SBI();
        r2  = new PNB();
        r3 = new MHB();
        r1.findInterest();
        r2.findInterest();
        r3.findInterest();
    }
}
