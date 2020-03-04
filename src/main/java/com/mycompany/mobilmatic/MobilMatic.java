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
public class MobilMatic {
    private String noPlat;
    private int kecepatan;
    private String perseneleng;
    
    
    

    public MobilMatic(String noPlat) {
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
    
    public void oper(String persenelengApa){
        if ( (kecepatan > 0 || perseneleng.equals("N")) && (persenelengApa.equals("D"))) {
            perseneleng = persenelengApa ;
         }
        else if ( (kecepatan < 0 || perseneleng.equals("R")) && (persenelengApa.equals("R"))) {
            perseneleng = persenelengApa;
        }
    }
    
        public int gas(){
        if (perseneleng.equals("D")) {
            kecepatan = kecepatan + 5 ;
            return kecepatan;
          
        } else if (perseneleng.equals("R")){
            kecepatan = kecepatan - 5 ;
            return kecepatan;
        } else {
            kecepatan = 0 ;
            return kecepatan;
        }
    }
        
        public int rem(){
        if (kecepatan < 0) {
            kecepatan = kecepatan + 5 ;
            return kecepatan;
        } else if(kecepatan > 0) {
            kecepatan = kecepatan - 5;
            return kecepatan ;
        } else {
            kecepatan = 0 ;
            return kecepatan;
        }
    }

    @Override
    public String toString() {
        return "MobilMatic{" + "noPlat=" + noPlat + ", kecepatan=" + kecepatan + ", perseneleng=" + perseneleng + '}';
    }
            
            
    
}
