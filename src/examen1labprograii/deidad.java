/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

/**
 *
 * @author xavie
 */
public class deidad extends Extraterrestres{
      private boolean creyentes;
    private String religion;
    
    public deidad(String nombre, String poder, String debilidad, String HereoVillano, int fuerza, int mental, int Fisica) {
        super(nombre, poder, debilidad, HereoVillano, fuerza, mental, Fisica);
    }
        public void final_choice(Persona p1,Persona p2){
    }

    @Override
    public String toString() {
        return "deidad{" + "creyentes=" + creyentes + ", religion=" + religion + '}';
    }
        
    
}
