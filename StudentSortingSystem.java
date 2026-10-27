import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade);

    
    }


}

public class StudentSortingSystem{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Sude", 80));
        students.add(new Student("Ayse", 60));
        students.add(new Student("Fatma", 90));

        Collections.sort(students);

        for(Student s : students){
            System.out.println(s.name + " - " + s.grade);
        }



    }
}