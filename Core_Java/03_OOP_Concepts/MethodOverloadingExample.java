public class MethodOverloadingExample {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    void greet(String name, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Hello " + name + " (" + i + ")");
        }
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.greet();
        obj.greet("Prashant");
        obj.greet("Singh", 3);
    }
}
