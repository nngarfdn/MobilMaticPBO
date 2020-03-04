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
public class MobilBiasa {
    private String noPlat;
    private int kecepatan;
    private String perseneleng;
    
    
    

    public MobilBiasa(String noPlat) {
        this.noPlat = noPlat;
        kecepatan = 0;
        perseneleng = "N" ;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getPerseneleng() {
        return perseneleng;
    }
    
    public void gas(){
        if (perseneleng.equals("1") || perseneleng.equals("2") || perseneleng.equals("3")
                || perseneleng.equals("4") || perseneleng.equals("5")) {
            kecepatan = kecepatan + 5 ;
          
        } else if (perseneleng.equals("R") && kecepatan < 0){
            kecepatan = kecepatan - 5 ; 
        } else {
            kecepatan = 0 ;
        }
    }
    
    public void rem(){
        if (kecepatan < 0) {
            kecepatan = kecepatan + 5 ;
        } else if(kecepatan > 0) {
            kecepatan = kecepatan - 5;
        } else {
            kecepatan = 0 ;
        }
    }
    
    public String oper(String persenelengApa){
        if(persenelengApa.equals("N")) {
                perseneleng = persenelengApa;
                return perseneleng;
        } else if(perseneleng.equals("N") || kecepatan > 0){
            if(persenelengApa != "N" && persenelengApa!= "R") {
                    perseneleng = persenelengApa ;
                    return perseneleng;
            }else if(perseneleng.equals("N") || kecepatan== 0)  { 
            perseneleng = "R" ;
            return perseneleng;
            }
        } 
        
        
        return perseneleng;
        
    }
    
   
    public String toString() {
        return "MobilBiasa{" + "noPlat=" + noPlat + ", kecepatan=" + kecepatan + ", perseneleng=" + perseneleng + '}';
    }
   

    
}
