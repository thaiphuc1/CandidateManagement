/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public class Internship extends Candidate{
    private String majors, universityName;
    private int semester;

    public Internship() {
    }

    public Internship(String majors, String universityName, int semester) {
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    public Internship(String majors, String universityName, int semester, String candidateID, String firstName, String lastName, String adddress, String email, int candidateType, int birthDate, String phoneNumber) {
        super(candidateID, firstName, lastName, adddress, email, candidateType, birthDate, phoneNumber);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
