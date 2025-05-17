    //FinalKeywordExample 
    public class FinalKeywordExample {

    final int x = 10; // final variable

    final void display() { // final method
        System.out.println("Value of x: " + x);
    }
    public static void main(String[] args) {
        FinalKeywordExample obj = new FinalKeywordExample();
        obj.display();
    }
}

