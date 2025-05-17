  class Animal {
    //SingleInheritanceExample
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child Class
public class SingleInheritanceExample extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        SingleInheritanceExample dog = new SingleInheritanceExample();
        dog.eat();
        dog.bark();
    }
}
