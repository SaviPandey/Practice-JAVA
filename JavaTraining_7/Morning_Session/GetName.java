public class GetName extends Thread {
    public void run(){
        System.out.println("Run Method");
    }
    public static void main(String[] args) {
        GetName g1 = new GetName();
        GetName g2 = new GetName();
        g1.start();
        g2.start();
    }

    
}
