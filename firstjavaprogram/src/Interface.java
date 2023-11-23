interface morning{
    void display();
}
interface afternoon{
    void display1();
}
interface night{
    void display2();
}
class sunday implements morning{
    @Override
    public void display() {
        System.out.println("good morning");
    }
}
class monday implements morning, afternoon, night {
    @Override
    public void display() {
        System.out.println("\nmonday morning");
    }

    @Override
    public void display1() {
        System.out.println("monday afternoon");
    }

    @Override
    public void display2() {
        System.out.println("monday night");
    }
}
public class Interface {
    public static void main(String[] args) {
        sunday obj = new sunday();
        obj.display();
        monday obj1 = new monday();
        obj1.display();
        obj1.display1();
        obj1.display2();
    }
}
