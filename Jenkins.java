

class Student {
    String name;
    int rollNumber;
    String course;

    // Constructor to initialize student details
    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Jenkins {
    public static void main(String[] args) {

     Student s = new Student("Misbha",89,"Devops");
     s.displayDetails();
        
    }
}


