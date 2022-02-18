/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

/**
 *
 * @author xavie
 */
public class AccidenteRadioactivo extends Persona {
    private int edad;
    private String tipoAccidente;

    public AccidenteRadioactivo(String nombre, String poder, String debilidad, String HereoVillano, int fuerza, String mental, String Fisica) {
        super(nombre, poder, debilidad, HereoVillano, fuerza, mental, Fisica);
        this.edad=edad;
        this.tipoAccidente=tipoAccidente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }
        public void final_choice(Persona p1,Persona p2){
            
    }

    @Override
    public String toString() {
        return "AccidenteRadioactivo{" + "edad=" + edad + ", tipoAccidente=" + tipoAccidente + '}';
    }
        

    }
    
            
    

