// before super constructor child constructor can't be called
class Person{
    Person(){
        System.out.println("This is person class constructor");
    }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("This is student class constructor");
        // super();  Error if called after child constructor
    }
}
public class superConstructor {
    public static void main(String[] args) {
       new Student();
    }
}
