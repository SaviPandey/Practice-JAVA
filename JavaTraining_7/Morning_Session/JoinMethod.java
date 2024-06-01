class MyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(800);
            }
            catch(InterruptedException ie){}
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        m.start();
        m.join(); //main thread calls child thread to join, and wait until it complete
        for(int i=0; i<10; i++){
            System.out.println("Main Method");
        }

    }
}
