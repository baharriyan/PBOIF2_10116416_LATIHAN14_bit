/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10116416_latihan14_bit;

/**
 *
 * @author Riyan Bahar
 * Nama  : Riyan Bahar
 * Kelas : IF-2
 * Nim   : 10116416
 * 
 */
public class PBOIF2_10116416_LATIHAN14_bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        
        /* 12 = 0000 1100 */
        c = a & b;
        System.out.println("a & b = " + c);
        
        /* 61 = 0011 1101 */
        c = a | b;
        System.out.println("a | b = " + c);
        
        /* 49 = 0011 0001 */
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        
        /* 61 = 1100 0011 */
        c = ~a;
        System.out.println("~a = " + c);
        
        c = a << 2;
        System.out.println("a << 2 = " + c);
        
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
      
    }
    
}
