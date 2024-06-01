class MyThread extends Thread{
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("Child Thread");
            Thread.yield(); //if no yield(), there me be more no. of times main thread will be
        }
    }
    
}
class YieldMethod {
    public static void main(String[] args) {
        MyThread y = new MyThread();
        y.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
