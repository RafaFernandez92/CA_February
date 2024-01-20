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
    
    File fileobj = new File("C:\Users\User\OneDrive\Desktop\status.txt");
    Scanner input = new Scanner(fileobj);
    
    while(input.hasNext())
    {
        String a = input.nextLine();
        System.out.println(a);
    }
        
        
        
        
        
    }      
}
