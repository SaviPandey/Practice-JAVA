class MyThread extends Thread {
    public void run()  {
        for(int i=0; i<10; i++){
            try {
                System.out.println(i + "    ");
                Thread.sleep(800);
            }
            catch(InterruptedException ie){}
        }
    }
}
public class SleepMethod  {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
}
