/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import Controller.Execution;
import Controller.Validation;
import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Internship;
import View.Menu;
import java.util.Scanner;
/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{

    private static String[] ch = {"Experience", "Fresher","Internship","Searching", "Exit"};
    private Execution list = new Execution();
    Scanner sc = new Scanner(System.in);
    Validation valid = new Validation();
    public Main(){
        super("CANDIDATE MANAGEMENT SYSTEM", ch);
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
   
    @Override
    public void execute(int ch) {
        
        switch(ch) {
            case 1:  do {
                    addExperience();
                    System.out.println("Do you want to add another Experience? (Y/N)");
                    String choice = sc.next();
                    if ("n".equalsIgnoreCase(choice)) {
                        printall();
                        break; 
                    }
                } while (true);
                break;
            
            case 2:  do {
                    addFresh();
                    System.out.println("Do you want to add another Fresher? (Y/N)");
                    String choice = sc.next();
                    if ("n".equalsIgnoreCase(choice)) {
                        
                        printall();
                        break; 
                    }
                } while (true);
                break;
            case 3 :  
                 do {
                    addIntern();
                    System.out.println("Do you want to add another Intership? (Y/N)");
                    String choice = sc.next();
                    if ("n".equalsIgnoreCase(choice)) {
                       printall();
                        break; 
                    }
                } while (true);
                break;
            case 4: 
                
                printall();
                System.out.println("---------------------------------------------------");
            search();
           
            break;
        }
    }
    public void printall(){
        
            list.printAll();
    }
    public void addExperience() {
    try {
        System.out.println("Enter Candidate ID: ");
        String id = sc.next();
        System.out.println("Enter First Name Candidate: ");
        String fName = sc.next();
        System.out.println("Enter Last Name Candidate: ");
        String lName = sc.next();
        System.out.println("Enter Birth Date Candidate: ");
        int date = sc.nextInt();
         sc = new Scanner(System.in);
        System.out.println("Enter Address Candidate: ");
        String address = sc.nextLine();
        System.out.println("Enter Email Candidate: ");
        String email = sc.nextLine();
        System.out.println("Enter Phone Candidate: ");
        String phone = sc.next();
        System.out.println("Enter Candidate Type: ");
        int type = sc.nextInt();
        System.out.println("Enter year of experience: ");
        int year = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter Professional Skill: ");
        String skill = sc.nextLine();

        
        if (!valid.checkBirthDate(date) || !valid.checkPhone(phone) || !valid.checkYearOfE(year)) {
            throw new IllegalArgumentException("Invalid input. Please enter valid values.");
        }

        Experience ex = new Experience(year, skill, id, fName, lName, address, email, type, date, phone);
        list.addExperience(ex);

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        sc.nextLine(); 
        addExperience();
    }
}

public void addFresh() {
    try {
        System.out.println("Enter Candidate ID: ");
        String id = sc.next();
        System.out.println("Enter First Name Candidate: ");
        String fName = sc.next();
        System.out.println("Enter Last Name Candidate: ");
        String lName = sc.next();
        System.out.println("Enter Birth Date Candidate: ");
        int date = sc.nextInt();
         sc = new Scanner(System.in);
        System.out.println("Enter Address Candidate: ");
        String address = sc.nextLine();
        System.out.println("Enter Email Candidate: ");
        String email = sc.nextLine();
        System.out.println("Enter Phone Candidate: ");
        String phone = sc.next();
        System.out.println("Enter Candidate Type: ");
        int type = sc.nextInt();
        System.out.println("Enter Graduate Time: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter Rank of Education: ");
        String rank = sc.next();
         sc = new Scanner(System.in);
        System.out.println("Enter Name of University: ");
        String uni = sc.nextLine();

        
        if (!valid.checkBirthDate(date) || !valid.checkPhone(phone) || !valid.checkRank(rank)) {
            throw new IllegalArgumentException("Invalid input. Please push enter to try again.");
        }

        Fresher fr = new Fresher(year, rank, uni, id, fName, lName, address, email, type, date, phone);
        list.addFresher(fr);

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
         sc = new Scanner(System.in);
        addFresh();
    }
}

public void addIntern() {
    try {
        System.out.println("Enter Candidate ID: ");
        String id = sc.next();
        System.out.println("Enter First Name Candidate: ");
        String fName = sc.next();
        System.out.println("Enter Last Name Candidate: ");
        String lName = sc.next();
        System.out.println("Enter Birth Date Candidate: ");
        int date = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter Address Candidate: ");
        String address = sc.nextLine();
        System.out.println("Enter Email Candidate: ");
        String email = sc.nextLine();
        System.out.println("Enter Phone Candidate: ");
        String phone = sc.next();
        System.out.println("Enter Candidate Type: ");
        int type = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter Major Candidate: ");
        String major = sc.nextLine();
        System.out.println("Enter Name of University: ");
        String uni = sc.nextLine();
        System.out.println("Enter Semester: ");
        int ses = sc.nextInt();

        
        if (!valid.checkBirthDate(date) || !valid.checkPhone(phone)) {
            throw new IllegalArgumentException("Invalid input. Please enter valid values.");
        }

        Internship intern = new Internship(major, uni, ses, id, fName, lName, address, email, type, date, phone);
        list.addIntern(intern);

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
         sc = new Scanner(System.in);
        addIntern();
    }
}
    
    public void search(){
        System.out.println("Enter Name Candidate : ");
        String fName = sc.next();
        System.out.println("Enter Type Candidate : ");
        int id = sc.nextInt();
        System.out.println(list.searchCandidate(fName, id));
    }
    public void update(){
        System.out.println("Enter Name Candidate : ");
        String fName = sc.next();
        System.out.println("Enter Type Candidate : ");
        int id = sc.nextInt();
        list.updateCandidate(fName, id);
        
    }
    public void delete(){
        System.out.println("Enter Name Candidate : ");
        String fName = sc.next();
        System.out.println("Enter Type Candidate : ");
        int id = sc.nextInt();
        list.deleteCandidate(fName, id);
    }
}
