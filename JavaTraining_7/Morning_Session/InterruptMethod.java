class MyThread extends Thread {
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
                //here current threads goes to sleeping state and another thread goes
            }
        }
        catch(InterruptedException e){
            System.out.println("[ Child thread ] => Interrupted exception occurred");
        }
    }
}

public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException{
        MyThread m = new MyThread();
        m.start();
        //main thread calls interrupt() method on child method
        m.interrupt(); //if target thread is not in waiting or sleeping  also if waiting time is already over  then interrupt will not affect that thread. This is only case where interrupt call is wasted
        for(int i=0; i<5; i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
