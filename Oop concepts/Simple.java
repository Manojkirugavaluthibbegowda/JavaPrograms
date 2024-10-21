import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}

class Student{
        // Data Members
        int roll;
        String name;
        float marks;

        // Member Functions
        Student()
        {
            roll = 2;
            name = "Manoj";
            marks = 90.0f;
        }

        void display()
        {
            System.out.println("Roll No: "+roll);
            System.out.println("Name: "+name);
            System.out.println("Marks: "+marks);
        }

}