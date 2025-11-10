class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println(name + " teaches " + subject);
    }
}

class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println(name + " studies in grade " + grade);
    }
}

class Staff extends Person {
    String role;
    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    void displayRole() {
        System.out.println(name + " works as " + role);
    }
}

public class ques9 {
    public static void main(String[] args) {
        new Teacher("Mr. Sharma", 40, "Math").displayRole();
        new Student("Ayush", 20, "B.Tech").displayRole();
        new Staff("Ravi", 35, "Librarian").displayRole();
    }
}

