/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

/**
 *
 * @author xavie
 */
public class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private String HereoVillano;
    private int fuerza;
    private String mental;
    private String Fisica;
    private String escuadron;

    public Persona(String nombre, String poder, String debilidad, String HereoVillano, int fuerza, String mental, String Fisica) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad=debilidad;
        this.HereoVillano = HereoVillano;
        this.fuerza = fuerza;
        this.mental = mental;
        this.Fisica = Fisica;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHereoVillano() {
        return HereoVillano;
    }

    public void setHereoVillano(String HereoVillano) {
        this.HereoVillano = HereoVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public String getFisica() {
        return Fisica;
    }

    public void setFisica(String Fisica) {
        this.Fisica = Fisica;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public void final_choice(Persona p1,Persona p2){
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HereoVillano=" + HereoVillano + ", fuerza=" + fuerza + ", mental=" + mental + ", Fisica=" + Fisica + ", escuadron=" + escuadron + '}';
    }
}
