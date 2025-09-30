package PublicClass;
public class Student {
    public static void main(String[] args) {
        StudentDeets student1 = new StudentDeets("Rishabh", 21, "Delhi", 7.72f);
        StudentDeets student2 = new StudentDeets("Himanshu", 22, "Noida", 8.5f);
        System.out.println(student1.name + " " + student1.age + " " + student1.Address + " " + student1.gpa);
        System.out.println(student2.name + " " + student2.age + " " + student2.Address + " " + student2.gpa);
    }
}