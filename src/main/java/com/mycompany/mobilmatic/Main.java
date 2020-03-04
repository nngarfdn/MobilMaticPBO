/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobilmatic;

/**
 *
 * @author praktikan
 */
public class Main {
    public static void main(String[] args) {
        MobilBiasa biasa = new MobilBiasa("AB12345IG");
        MobilMatic matic = new MobilMatic("B1234M") ;
        
        biasa.oper("R");
        System.out.println(biasa);
        biasa.oper("N");
        biasa.gas();
        
        System.out.println(biasa);
        System.out.println(biasa);
        biasa.oper("1");
        biasa.gas();
        biasa.gas();
        
        System.out.println(biasa);
    }
    
  
   
}
