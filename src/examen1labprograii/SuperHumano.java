/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

/**
 *
 * @author xavie
 */
public class SuperHumano extends Persona {
    private String SuperPoder;
    
    public SuperHumano(String nombre, String poder, String debilidad, String HereoVillano, int fuerza, String mental, String Fisica) {
        super(nombre, poder, debilidad, HereoVillano, fuerza, mental, Fisica);
        
    }

    public String getSuperPoder() {
        return SuperPoder;
    }

    public void setSuperPoder(String SuperPoder) {
        this.SuperPoder = SuperPoder;
    }
    public void final_choice(Persona p1,Persona p2){
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "SuperPoder=" + SuperPoder + '}';
    }
    
    
    
}
