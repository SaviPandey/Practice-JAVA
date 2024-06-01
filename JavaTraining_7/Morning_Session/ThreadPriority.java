public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Inside Run Method");
    }
    public static void main(String[] args) {
        ThreadPriority t1  = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        System.out.println("Get Prority : "+ t1.getPriority());
        System.out.println("Get Prority : "+ t2.getPriority());
        System.out.println("Get Prority : "+ t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        //t3.setPriority(21) ; will throw IllegalArgument Exception 
        System.out.println("After Changing Priority: "+ t1.getPriority());
        System.out.println("After changing Priority: " + t2.getPriority());
        System.out.println("After changing Priority: " + t3.getPriority());

        //Main Thread
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread Priority:" + Thread.currentThread().getPriority());

        //Main Thread Priority is set to 10
        Thread.currentThread().setPriority(10);
        System.out.println("After Changing Main Thread Priority: " + Thread.currentThread().getPriority() );


    }
}
