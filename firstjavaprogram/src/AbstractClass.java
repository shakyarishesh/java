import java.sql.SQLOutput;

abstract class animal{
    abstract public void bark();
    abstract public void meow();
    public void display(){
        System.out.println("this is a normal method i.e. inside the abstract class");
    }
}
class dog extends animal{
    @Override
    public void bark() {
        System.out.println("dog is barking");
    }

    @Override
    public void meow() {
        System.out.println("dog doesn't meow");
    }
}
class cat extends animal{
    @Override
    public void bark() {
        System.out.println("cat doesn't bark");
    }

    @Override
    public void meow() {
        System.out.println("cat is moewing");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.bark();
        cat obj1 = new cat();
        obj1.meow();
        //accessing the method inside abstract class
        obj.display();
    }
}
