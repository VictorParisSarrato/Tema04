
package ejer8;

/**
 * Programa que pide la edad de 2 alumnos y calcula la media
 * @author Victor París
 * @version NetBeans IDE 7.2.1
 */

public class Ejer8 {

    /** Genera un objeto de la clase {@link Alumno } para calcular la media de la suma, y después la muestra
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos variables
        int edad1, edad2, edad3;
        float media;
        //Creamos objetos
        Alumno al1, al2, al3;
        //instanciamos objetos
        al1 =new Alumno();
        al2 =new Alumno();
        al3 =new Alumno("juanito" , 20);
        /*
        al1.pedirDatosAlumno();
        al2.pedirDatosAlumno();
        al3.pedirDatosAlumno();
        */
        
        edad1=al1.getEdad();
        edad2=al2.getEdad();
        edad3=al3.getEdad();
        
        media=(float)(edad1 + edad2 + edad3)/3;
        
        System.out.println("\n\n\tLa media de edad es: " + media);
    }
}
