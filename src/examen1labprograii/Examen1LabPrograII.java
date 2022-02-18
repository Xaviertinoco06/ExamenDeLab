/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1labprograii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author xavie
 */
public class Examen1LabPrograII {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Persona> heroe = new ArrayList();
    static ArrayList<Persona> malo = new ArrayList();
    static ArrayList<Escuadron> escuadron = new ArrayList();
    static ArrayList<Universo> universo = new ArrayList();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Universo\n2.Escuadranos\n3.Personajes\n4.Salir\nIngrese Opcion= ");
            opcion = read.nextInt();
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
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    CrearUniverso();
                    break;

                case 2:
                    ModificarUniverso();
                    break;

                case 3:
                    EliminarUniverso();
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
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    crearSquad();
                    break;

                case 2:
                    ModificarSquad();
                    break;

                case 3:
                    EliminarSquad();
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
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    CrearPersonaje();
                    break;

                case 2:
                    ModificarPersonaje();
                    break;

                case 3:
                    EliminarPersonaje();
                    break;

                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void CrearUniverso() {
        String verse;
        System.out.println("Ingrese el nombre de un universo: ");
        verse = read.next();
        if (buscarUniverso(verse) == null) {
            universo.add(new Universo(verse));
            System.out.println("Se ha creado el universo: " + verse + "!!!");
        } else {
            System.out.println("Ya existe un universo con este nombre");
        }
    }

    public static Universo buscarUniverso(String Universo) {
        for (Universo verse: universo) {
            if (universo.equals(verse.getNombre())) {
                return verse;
            }
        }
        return null;
    }

    public static void crearSquad() {
        System.out.println("Ingrese el nombre del escuadron: ");
        String uni = read.next();
        System.out.println("Ingrese la ubicacion de la base: ");
        String lugar = read.next();
        System.out.println("Ingrese el lider del escuadron: ");
        String lider = read.next();
        System.out.println("Ingrese el tipo de escuadron (Heroe/Villano): ");
        String tipo = read.next();
        if (buscarUniverso(verse) == null) {
            universo.add(new Universo(verse));
            System.out.println("Se ha creado el universo: " + uni + "!!!");
        } else {
            System.out.println("Ya existe un universo con este nombre");
        }
    }

    public static Escuadron buscarSquad(String Escuadron) {
        for (Escuadron escuadra : escuadron) {
            if (escuadron.equals(escuadra.getNombreEscuadron())) {
                return escuadra;
            }
        }
        return null;
    }

    public static void CrearPersonaje() {
        System.out.println("Crear Personaje");
        System.out.println("\nIngrese el Nombre: ");
        String nombre = read.next();
        System.out.println("\nCual es el poder: ");
        String poder = read.next();
        System.out.println("\nHeroe o Villano: ");
        String tipo = read.next();
        System.out.println("\nLa debilidad: ");
        String debilidad = read.next();
        System.out.println("Nivel de fuerza: ");
        int edad = read.nextInt();
        System.out.println("Vida: ");
        int hp = read.nextInt();
        System.out.println("\n****Tipo de Aldeanos****\n1. Normal\n2. Pacifista\n3. Herrero\n4. Agronomo\n5. Explosivo\nIngrese una opcion: ");
        int opcion = read.nextInt();
        if (buscarUni(apellido) != null) {
            switch (opcion) {
                case 1:
                    agregarGuerrero(new Normales(nombre, apellido, edad, hp));
                    break;

                case 2:
                    System.out.println("Ingrese un discurso de paz: ");
                    String discurso = read.next();
                    agregarGuerrero(new Pacifista(nombre, apellido, edad, hp, discurso));
                    break;

                case 3:
                    agregarGuerrero(new Herrero(nombre, apellido, edad, hp));
                    break;

                case 4:
                    agregarGuerrero(new Agronomo(nombre, apellido, edad, hp));
                    break;

                case 5:
                    agregarGuerrero(new Explosivo(nombre, apellido, edad, hp));
                    break;

                default:
                    System.out.println("Opcion no valida!!");
                    break;
            }
        }
    }
}


    
            
