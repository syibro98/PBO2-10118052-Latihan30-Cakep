/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan30.cakep;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk memasukkan kata yoi dan enggak
 * 
 */
public class PBO210118052Latihan30Cakep {
   
    // Colors
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "Kamu" + GREEN + " ngerjain sendiri" + YELLOW
                + " latihan 17 sampe" + BLUE + " latihan 30 ini?");
        System.out.print(BLUE + "Jawab " + RED + "(Yoi/Enggak) : " + RESET);
        
        String answear = scanner.next();
        
        System.out.println();
        if(answear.toLowerCase().equals("yoi")) {
            System.out.println(RED + "Cakep Bener. " + MAGENTA + "Good Job");
        } else {
            System.out.println(RED + "Tetep cakep sih.");
            System.out.println(CYAN + "Sing penting paham konsep nya yee.");
            System.out.println(RESET + "Keep the code works dude");
        }
    }
    
}