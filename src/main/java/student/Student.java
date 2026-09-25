/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Lucas
 */
public class Student {

    private String name;
    private int id;
    private double grade;
    
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    public void setGrade(double newGrade){
        this.grade = newGrade;
    }
    
    public double getGrade() {
        return this.grade;
    }
    
    public int getID() {
        return this.id;
    }
    
    public void setID(int newID) {
        this.id = newID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
}
