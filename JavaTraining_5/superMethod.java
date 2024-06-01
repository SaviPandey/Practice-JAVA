class person{
    void message(){
        System.out.println("I am a person");
    }
}
class student extends person{
    void message(){
        System.out.println("I am a student");
    }
    void display(){
        message(); //will invoke current class message
        super.message(); // will invoke parent class message
    }
}
public class superMethod {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}
