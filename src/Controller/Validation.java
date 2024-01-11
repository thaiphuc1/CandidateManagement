/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thaip
 */
public class Validation {
    public boolean checkBirthDate(int birthDate){
        if(birthDate >= 1900 && birthDate <= 2024){
            return true;
        }
        return false;
    }
    public boolean checkPhone(String phone){
        String regex = "\\d{10,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        
        return matcher.matches();
    }
    public boolean checkEmail(String email){
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,}$");
    }
    public boolean checkYearOfE(int year){
        if(year >= 0 && year <= 100){
            return true;
        }
        return false;
    }
    
    public boolean checkRank(String rank){
        if(rank.equalsIgnoreCase("Excellence") || rank.equalsIgnoreCase("Good") || rank.equalsIgnoreCase("Fair") || rank.equalsIgnoreCase("Poor")){
            return  true;
        }
        return  false;
    }
    
    
    
}
