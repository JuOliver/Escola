/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

//classe
//Classe Student herda da classe User
//Conceito de polimorfismo (Student)
public class Student extends User { 
    //visibilidade - privada
    private int yearRegistration;
    private int currentSemester;
    private Course course;

    public int getYearRegistration() {
        return yearRegistration;
    }

    public void setYearRegistration(int yearRegistration) {
        this.yearRegistration = yearRegistration;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
