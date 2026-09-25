/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package student;

import student.Student;
import java.util.ArrayList;

/**
 * @author Lucas Brdar
 */
public class StudentList {

    public static void main(String[] args) {
  
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Goulash", 991835135, 22.0));
        students.add(new Student("goon", 995199205, 23.0));
        students.add(new Student("jaufhad", 918341135, 26.0));
        students.add(new Student("oaskdoasd", 991835112, 0.0));
        students.add(new Student("John D. Student", 991835137, 99.0));
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getID());
            System.out.println(students.get(i).getGrade());
            System.out.println("---------------------------");
        }
    }
    
    public static double GetClassAverage(Student[] students){
        double totalGrade = 0;
        for (Student student : students) {
            totalGrade += student.getGrade();
        }

        return totalGrade / (students.length + 1);
    }
    
    public static Student FindTopStudent(Student[] students) {
        Student highestStudent = new Student("NULL", 0, 0.0);
        
        double highestGrade = 0;
        for (Student student : students) {
            if (student.getGrade() > highestGrade) {
                highestStudent = student;
                highestGrade = student.getGrade();
            }
        }
        
        return highestStudent;
    }
}
