/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Internship;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class Execution {
    private Validation valid = new Validation();
    private ArrayList<Candidate> list = new ArrayList<>();
    private ArrayList<Experience> listEx = new ArrayList<>();
    private ArrayList<Fresher> listFr = new ArrayList<>();
    private ArrayList<Internship> listIn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    
    
    public void addExperience(Candidate nv){
        if(valid.checkBirthDate(nv.getBirthDate()) && valid.checkPhone(nv.getPhoneNumber()) && valid.checkEmail(nv.getEmail()) 
                && valid.checkYearOfE(((Experience) nv).getExpInYear())){
            if(nv.getCandidateType() == 0){
            listEx.add((Experience)nv);
            list.add(nv);
            System.out.println("Add succesful");}
        }
    }
    
    public void addFresher (Candidate nv){
       if(valid.checkBirthDate(nv.getBirthDate()) && valid.checkPhone(nv.getPhoneNumber()) && valid.checkEmail(nv.getEmail()) 
                && valid.checkRank(((Fresher) nv).getGraduationRank())){
           if (nv.getCandidateType() == 1){
               list.add(nv);
               listFr.add(((Fresher)nv));
           System.out.println("Add succesful");
           }
           
         }
    }
    
    public void addIntern(Candidate nv){
        if(valid.checkBirthDate(nv.getBirthDate()) && valid.checkPhone(nv.getPhoneNumber()) && valid.checkEmail(nv.getEmail())){
            if (nv.getCandidateType() == 2){
               list.add(nv);
               listIn.add(((Internship)nv));
           System.out.println("Add succesful");
           }
        }    
    }
    
    public void printExperience(){
        for (Experience nv : listEx) {
            System.out.println(nv.toString());
        }
    }
    
    public void printFresh(){
        for (Fresher a : listFr) {
            System.out.println(a.toString());
        }
    }
    
    public void printIntern(){
        for (Internship b : listIn) {
            System.out.println(b.toString());
        }
    }
    
    public void printAll(){
        System.out.println("===========EXPERIENCE CANDIDATE============");
        printExperience();
        System.out.println("==========FRESHER CANDIDATE==============");
        printFresh();
        System.out.println("===========INTERN CANDIDATE==============");
        printIntern();
    }
    
    public Candidate searchCandidate(String name, int type){
        for (Candidate a : list) {
            if(a.getFirstName().equalsIgnoreCase(name) || a.getLastName().equalsIgnoreCase(name)){
                if(type == a.getCandidateType()){
                    return a;
                }
                else if(type == a.getCandidateType()){
                    return a;
                }
                else {
                    return a;
                }
            }
            
        }
        
                System.out.println("Candidate not found!");
            
        return null;
    }
    
    public void deleteCandidate(String name, int type){
        if(type == 0){
            for (Experience a : listEx) {
                if(a.getFirstName().equalsIgnoreCase(name) || a.getLastName().equalsIgnoreCase(name)){
                    listEx.remove(a);
                }
            }
        }
    }
    
    public void updateCandidate(String name, int type){
       // : Candidate name (First Name + Last Name), Birth Date, Address, Phone, Email and Candidate type
        Candidate nv = searchCandidate(name, type);
        System.out.println("1. Update First Name ");
        System.out.println("2. Update Last Name ");
        System.out.println("3. Update Birth Date ");
        System.out.println("4. Update Address ");
        System.out.println("5. Update Phone ");
        System.out.println("6. Update Email ");
        System.out.println("7. Update Candidate Type ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                sc = new Scanner(System.in);
                System.out.println("Plese Enter New First Name : ");
                String fName = sc.nextLine();
                nv.setFirstName(fName);
                System.out.println("Update successful!");
                break;
            case 2:
                System.out.println("Plese Enter New Last Name : ");
                String lName = sc.nextLine();
                nv.setLastName(lName);
                System.out.println("Update successful!");

                break;
            case 3:
                System.out.println("Plese Enter New Birth Date : ");
                int date = sc.nextInt();
                if(valid.checkBirthDate(date)){
                nv.setBirthDate(date);
                    System.out.println("Update successful!");
                }
                break;
            case 4:
                sc = new Scanner(System.in);
                System.out.println("Plese Enter New Address : ");
                String address = sc.nextLine();
                
                nv.setAdddress(address);
                System.out.println("Update successful!");
                break;
            case 5:
                sc = new Scanner(System.in);
                System.out.println("Plese Enter New Phone : ");
                String phone = sc.nextLine();
                if(valid.checkPhone(phone)){
                nv.setPhoneNumber(phone);
                System.out.println("Update successful!");
                }
                break;
            case 6:
                sc = new Scanner(System.in);
                System.out.println("Please Enter New Email : ");
                String email = sc.nextLine();
                if(valid.checkEmail(email)){
                    nv.setEmail(email);
                    System.out.println("Update successful!");

                }
            case 7:
                System.out.println("Please Enter New Candidate Type : ");
                int typeC = sc.nextInt();
                nv.setCandidateType(typeC);
                System.out.println("Update successful!");

                
            default:
                throw new AssertionError();
        }
        
        
    }
    
    
}
