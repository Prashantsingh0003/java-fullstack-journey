public class StudentDetails {
    int rollNo;
    String name;

    // Constructor
    public StudentDetails(int roll, String nm) {
        rollNo = roll;
        name = nm;
    }

    // Method
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails(101, "Prashant");
        s1.display();
    }
}
