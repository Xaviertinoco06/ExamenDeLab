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
public class Escuadron {
    private String nombreEscuadron;
    private String Lugar;
    private String  Base;
    private String lider;
    private boolean HereoVillano;
    ArrayList<Persona>miembros=new ArrayList();

    public String getNombreEscuadron() {
        return nombreEscuadron;
    }

    public void setNombreEscuadron(String nombreEscuadron) {
        this.nombreEscuadron = nombreEscuadron;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public boolean isHereoVillano() {
        return HereoVillano;
    }

    public void setHereoVillano(boolean HereoVillano) {
        this.HereoVillano = HereoVillano;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombreEscuadron=" + nombreEscuadron + ", Lugar=" + Lugar + ", Base=" + Base + ", lider=" + lider + ", HereoVillano=" + HereoVillano + ", miembros=" + miembros + '}';
    }
    
    
    
}
