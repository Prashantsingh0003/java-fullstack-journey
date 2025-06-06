class Student {
    private int rollNo;  //private modifier
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Prashant Singh");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}