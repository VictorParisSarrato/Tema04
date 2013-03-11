/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;

import java.util.Scanner;

/**
 * Clase que calcula la suma de edades y su media
 * @author Victor París
 * @version NetBeans IDE 7.2.1
 */
public final class Alumno {
    String nombre;
    int edad;

    /**
     * Pide que introduzcas el nombre y la edad del alumno
     */
    public Alumno() {
        pedirNombre();
        pedirEdad();
    }
    
    /**
     * Obtiene el valor del nombre y la edad
     * @param nombre nuevo valor del nombre
     * @param edad nuevo valor de la edad
     */
    public Alumno(String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }
    
    /**
     * Pide el nombre de los alumnos
     */
    void pedirNombre() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\n\tInserte el nombre del alumno: ");
        nombre=teclado.nextLine();
    }
    
    /**
     * Pide la edad de los alumnos
     */
    void pedirEdad(){
        Scanner teclado=new Scanner(System.in);
        System.out.print("\n\tInserte la edad del alumno: ");
        edad=teclado.nextInt();
    }
    
    /**
     * Obtiene la edad de los alumnos
     * @return 
     */
    int getEdad(){
        return edad;
    }
        
        
 }
