//HierarchicalInheritanceExample

// Parent Class
class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

// Child Class 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

// Child Class 2
public class HierarchicalInheritanceExample extends Shape {
    void drawSquare() {
        System.out.println("Drawing Square");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayShape();
        c.drawCircle();

        HierarchicalInheritanceExample s = new HierarchicalInheritanceExample();
        s.displayShape();
        s.drawSquare();
    }
}