import java.util.HashMap;
import java.util.Scanner;

class Student {

    private int id = 0;
    String name;
    int roll_no;
    String branch = "CSE";
    boolean ispresent = false;

    Student(String name, int roll, String branch) {

        id++;
        this.name = name;
        this.id = id;
        this.roll_no = roll;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", branch='" + branch + '\'' +
                ", ispresent=" + ispresent +
                '}';
    }
}

class Operation {
    // Create a Student Database

    static HashMap<Integer , Student> studentHashMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static void Create_Student() {
        System.out.print("Enter Student name:");
        String name = sc.next();
        System.out.print("Enter the branch:");
        String branch = sc.next();
        System.out.print("Enter the Roll_No:");
        int roll_no = sc.nextInt();

        Student student = new Student(name, roll_no, branch);
        studentHashMap.put(roll_no,student);
        System.out.println("Student Created...");
        System.out.println(roll_no);
    }

    static void Update_Student() {
        System.out.print("Enter roll number of student to update: ");
        int roll_no = sc.nextInt();

        if (studentHashMap.containsKey(roll_no)){
            Student student = studentHashMap.get(roll_no);

            System.out.print("Update the name: ");
            String name = sc.next();
            System.out.print("Update the branch: ");
            String branch = sc.next();

            student.name = name;
            student.branch = branch;

            System.out.println("Student Updated...");
        } else {
            System.out.println("No student with this roll_no");
        }
    }

    static void Delete_Student() {
        System.out.print("Enter roll number of student to delete: ");
        int roll_no = sc.nextInt();

        if (studentHashMap.containsKey(roll_no)){
            studentHashMap.remove(roll_no);
            System.out.println("Student Deleted ...");
        } else {
            System.out.println("No student with this roll_no");
        }
    }

    static void Mark_Attendance() {
        System.out.print("Enter roll number of student to Mark_present: ");
        int roll_no = sc.nextInt();

        if (studentHashMap.containsKey(roll_no)){
            Student student = studentHashMap.get(roll_no);
            student.ispresent = false;
            System.out.println("Attendace Marked...");
        } else {
            System.out.println("No student with this roll_no");
        }

    }
    static void Get_Student() {
        System.out.println("Students are " + studentHashMap);
    }
    static void Exit() {
        System.out.println("Exited....");
    }

}

public class Main extends Operation{
    public static void main(String[] args) {

        System.out.println("1 - Create a student");
        System.out.println("2 - Update a student");
        System.out.println("3 - Delete a student");
        System.out.println("4 - Mark Attendance of a student");
        System.out.println("5 - Get all student");
        System.out.println("6 - Exit the task");


        while(true) {

            System.out.print("Enter choice from (1-6):");
            int choice = sc.nextInt();

            switch(choice){
                case 1 -> Create_Student();
                case 2 -> Update_Student();
                case 3 -> Delete_Student();
                case 4 -> Mark_Attendance();
                case 5 -> Get_Student();
                case 6 -> {
                    Exit();
                    return;
                }
            }
        }
    }

}
