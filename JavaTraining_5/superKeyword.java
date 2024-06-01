class vehicle{
    int speed = 170;
}
class car extends vehicle{
    int speed = 130; 
    void show(){
        System.out.println("Speed = "+super.speed);
    }  
}
public class superKeyword {
    public static void main(String[] args) {
        car c = new car();
        c.show();
    }
}
