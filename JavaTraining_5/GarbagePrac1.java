public class GarbagePrac1 {
    public static void main(String[] args) {
        GarbagePrac1 g1 = new GarbagePrac1();
        GarbagePrac1 g2 = new GarbagePrac1();
        System.out.println(g1);
        System.out.println(g2);
        g1 = null; //now both objects are eligible for garbage collector
        g2 = null;
        System.out.println(g1);
        System.out.println(g2);
       
    }
   
    

}
