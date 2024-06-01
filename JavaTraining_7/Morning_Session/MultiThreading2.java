//Second way to implement with java.lang.Runnable  and overide the run() method also pass the obj of MyThread to new Thread
class MyThread implements Runnable {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
        
    }
}
class MultiThreading2{
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
 
    

