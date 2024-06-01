class A {
    public static synchronized void print(String name){ //Synchronized keyword  makes the threadto execute one by one and not randomly
        try {
            for(int i=0; i<3; i++){
                System.out.println("Batting : "+name);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){}    
    }
}
class MyThread1 extends Thread{
    public void run(){
        A.print("Sachin");
    }
} 
class MyThread2 extends Thread{
    public void run(){
        A.print("Savinay");
    }
} 
class MyThread3 extends Thread{
    public void run(){
        A.print("Dhoni");
    }
} 

public class SychronizedMethod {
    public static void main(String[] args) {
       new MyThread1().start();
       new MyThread2().start();
       new MyThread3().start();
    }
}
