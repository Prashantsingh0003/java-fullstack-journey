//MultilevelInheritanceExample

// Grandparent Class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Parent Class
class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 80 km/hr");
    }
}

// Child Class
public class MultilevelInheritanceExample extends Car {
    void fuel() {
        System.out.println("Fuel type is Petrol");
    }

    public static void main(String[] args) {
        MultilevelInheritanceExample car = new MultilevelInheritanceExample();
        car.move();
        car.speed();
        car.fuel();
    }
}


