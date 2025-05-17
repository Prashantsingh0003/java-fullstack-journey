//SuperKeywordExample
class Person {
    String name = "Person";

    void show() {
        System.out.println("Name: " + name);
    }
}

public class SuperKeywordExample extends Person {
    String name = "Prashant";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
        super.show(); // Call parent method
    }

    public static void main(String[] args) {
        SuperKeywordExample obj = new SuperKeywordExample();
        obj.display();
    }
}
