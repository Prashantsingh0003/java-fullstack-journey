class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Interest Rate: " + s.getRateOfInterest() + "%");
        System.out.println("HDFC Interest Rate: " + h.getRateOfInterest() + "%");
    }
}