/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca_february;

import java.io.FileReader;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author User
 */
public class CA_February {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//    File fileobj = new File("C:\Users\User\OneDrive\Desktop\status.txt");
//    Scanner in = new Scanner(fileobj);
    //Scan part that I'm not able to do atm
    try{
        Scanner statusFile = new Scanner(new FileReader("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\CA_February\\status.txt"));
        someLine = statusFile.nextLine();
        
        System.out.println(someLine);
        
    }catch (Exception e) {
        System.out.println("File error");
    }
    //Checking Workload numbers/letters area.
    
    public static boolean checkLength(String workload) {
        String totalNum = workload.substring(0,8);
        return (totalNum.length() == 8 || workload.length() == 9);
    }
    
    
    public static boolean checkForLetters(String workload) {
        String middleLetters = workload.substring(2, 4);
        return (middleLetters.matches("[A-Z]+"));
    }
    
    public static boolean checkForNums(String workload) {
        String lastNums = workload.substring(5,8);
        return (lastNums.matches("[0-9]+"));
    }
    
    public static boolean checkForFirstNums(String workload) {
        String firstNums = workload.substring(0,3);
        return (firstNums.matches("[0-9]+"));
    }
    
    public static boolean validatePPSN(String workload) {
        if (!checkLength(workload)) {
            System.out.println("Incorrect length");
            return false;
        }
        
        if (!checkForNums(workload)) {
            System.out.println("First 3 characters or last 3 characters are not numbers.");
            return false;
        }
        
        if (!checkForLetters(workload)) {
            System.out.println("Middle characters must be letters");
            return false;
        }
        
        System.out.println("Valid Workload number!");
        return true;
        
        
        
        
        
        
        
        
        
    }
        
        
        
        
        
    }      

