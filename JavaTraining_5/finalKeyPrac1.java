public class finalKeyPrac1 {
    final int max = 89;
    void change(){
        // max = 110; cannot reassign final variable
    }
    public static void main(String[] args) {
        finalKeyPrac1 f  = new finalKeyPrac1();
        f.change();
    }
}
