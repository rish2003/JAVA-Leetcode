package OOPS.Encapsulation;

// public class Encapsulation {
// //  System.out.println("Encapsulation in Java");
//     public void display(){
//         System.out.println("Encapsulation in Java");
//     }
// }

public class Student{
     int age;
     String name;
     int rollNo;
     char grade;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}


