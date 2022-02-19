/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1labprograii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author xavie
 */
public class Examen1LabPrograII {

    static String meta;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Persona> heroe = new ArrayList();
    static ArrayList<Persona> malo = new ArrayList();
    static ArrayList<Escuadron> escuadron = new ArrayList();
    static ArrayList<Universo> universo = new ArrayList();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Universo\n2.Escuadranos\n3.Personajes\n4.Salir\nIngrese Opcion= ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    Universo();
                    break;

                case 2:
                    Escuadron();
                    break;

                case 3:
                    Personaje();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void Universo() {
        int opcion;
        do {
            System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Salir\nIngrese Opcion= ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    CrearUniverso();
                    break;

                case 2:
                    //ModificarUniverso();
                    break;

                case 3:
                    //EliminarUniverso();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void Escuadron() {
        int opcion;
        do {
            System.out.println("1.Crear\n2. Modificar\n3. Eliminar\n4.Salir\nIngrese Opcion=");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    crearEscuadra();
                    break;

                case 2:
                    //ModificarSquad();
                    break;

                case 3:
                    //EliminarSquad();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void Personaje() {
        int opcion;
        do {
            System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Salir\nIngrese Opcion= ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    CrearPersonaje();
                    break;

                case 2:
                    //ModificarPersonaje();
                    break;

                case 3:
                    //EliminarPersonaje();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void CrearUniverso() {
        System.out.println("Crear Universo");

        System.out.println("Ingrese el nombre de un universo: ");
        meta = scan.next();
        if (buscarUniverso(meta) == null) {
            universo.add(new Universo(meta));
            System.out.println("Bienvenido al universo: " + meta);
        } else {
            System.out.println("Ya existe");
        }
    }

    public static Universo buscarUniverso(String Universo) {
        for (Universo meta : universo) {
            if (universo.equals(meta.getNombre())) {
                return meta;
            }
        }
        return null;
    }

    public static void crearEscuadra() {
        System.out.println("Nombre del Escuadron: ");
        String nombreEscuadron = scan.next();

        System.out.println("Heroe o Villano: ");
        String HereoVillano = scan.next();

        System.out.println(" Lider : ");
        String lider = scan.next();

        System.out.println("Ubicacion de la Base: ");
        String lugar = scan.next();

        if (buscarUniverso(meta) == null) {
            escuadron.add(new Escuadron(nombreEscuadron, HereoVillano, lider,lugar));
            System.out.println("Bienvenido al esucadron: "+escuadron);
        } else {
            System.out.println("ya existe la esucadra");
        }
    }

    public static Escuadron buscarEsquadron(String Escuadron) {
        for (Escuadron escuadra : escuadron) {
            if (escuadron.equals(escuadra.getNombreEscuadron())) {
                return escuadra;
            }
        }
        return null;
    }

    public static void printPersonajes() {
        for (Persona Heroe : heroe) {
            System.out.println(Heroe.toString());
        }
    }

    public static void CrearPersonaje() {
        System.out.println("Crear Personaje");
        System.out.println("\nIngrese el Nombre: ");
        String nombre = scan.next();
        System.out.println("\nCual es el poder: ");
        String poder = scan.next();
        System.out.println("\nHeroe o Villano: ");
        String HereoVillano = scan.next();
        System.out.println("\nLa debilidad: ");
        String debilidad = scan.next();
        System.out.println("Nivel de fuerza: ");
        int fuerza = scan.nextInt();
        System.out.println("Iq: ");
        int mental = scan.nextInt();
        System.out.println("Musculo");
        int fisica=scan.nextInt();
        System.out.println("\nTipo de personajes\n1. Normal\n2.SuperHumano\n3.Accidente\n4.Extraterrestre \n5. Explosivo\nIngrese tipo: ");
        int opcion = scan.nextInt();
        if(HereoVillano.equals("Heroe")){
            switch(opcion){
                case 1:
                    heroe.add(new PersonaNormal(nombre, poder, debilidad, HereoVillano, fuerza, mental, fisica));
                break;
                
                case 2:
                   
                    break;
                case 3:
                    heroe.add(new (nombre,poder,debilidad,HereoVillano,fuerza,mental,fisica));
                    break;
                
                    
                    
            }
        }

    }
    
}
