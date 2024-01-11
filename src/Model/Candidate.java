/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public class Candidate {
    private String candidateID, firstName, lastName, adddress, email, phoneNumber;
    private int birthDate, candidateType;
    

    public Candidate() {
    }

    public Candidate(String candidateID, String firstName, String lastName, String adddress, String email, int candidateType, int birthDate, String phoneNumber) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adddress = adddress;
        this.email = email;
        this.candidateType = candidateType;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%3s %3s| %-6s | %-8s | %-6s | %-15s | %-6s", firstName, lastName, birthDate, adddress, phoneNumber, email, candidateType);
    }
    
    
    
}
