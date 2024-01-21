/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca_february;

import java.io.File;
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
    
    try{
        Scanner statusFile = new Scanner(new FileReader("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\CA_February\\status.txt"));
        someLine = statusFile.nextLine();
        
        System.out.println(someLine);
        
    }catch (Exception e) {
        System.out.println("File error");
    }
    }
        
        
        
        
        
    }      
}
