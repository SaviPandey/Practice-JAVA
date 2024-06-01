class MyThread extends Thread{
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("Daemon Thread "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);//setting daemon nature to thread but set it before t.start() always
        t.start();
        //main thread logic
        for(int i=0; i<5; i++){
            System.out.println("Main Thread "+i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
