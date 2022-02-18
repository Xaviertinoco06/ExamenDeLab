/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

import java.util.ArrayList;

/**
 *
 * @author xavie
 */
public class Mutante extends Persona{
    ArrayList<String>factor=new ArrayList();
    
    public Mutante(String nombre, String poder, String debilidad, String HereoVillano, int fuerza, String mental, String Fisica) {
        super(nombre, poder, debilidad, HereoVillano, fuerza, mental, Fisica);
        
        
    }

    public ArrayList<String> getFactor() {
        return factor;
    }

    public void setFactor(ArrayList<String> factor) {
        this.factor = factor;
    }
    
    public void final_choice(Persona p1,Persona p2){
    }

    @Override
    public String toString() {
        return "Mutante{" + "factor=" + factor + '}';
    }
 
    
}
