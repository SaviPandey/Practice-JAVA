//Program to set Name of Thread
public class SetName extends Thread{
    public void run(){
            System.out.println("Runn() method");
    }
    public static void main(String[] args) {
        SetName t1 = new SetName();
        SetName t2 = new SetName();
        System.out.println("Name of T1: "+t1.getName());
        System.out.println("Name of T2: "+ t2.getName());

        t1.start();
        t2.start();
        t1.setName("Savinay");
        System.out.println("After Changing Name of t1 : "+ t1.getName());
        System.out.println("After Changing Name of t2 : "+ t2.getName());
        System.out.println("Current Thread Name :" + Thread.currentThread().getName()); //Main Thread
        //Garbage collector called as "Demon-thread" that runs in Back-ground
    }
    
}
