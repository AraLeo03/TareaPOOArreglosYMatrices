
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package uabc_01182833.manejoalumnos;
import java.util.Scanner;
/**
 *
 * @author comp01h
 */
public class ManejoAlumnos {
/**
    public static void main(String[] args) {
        Grupo grupo=new Grupo();
        Alumno a1 = new Alumno("Leo Araujo", 1182833);
        a1.agregarCalificacion(90);
        a1.agregarCalificacion(70);
        a1.agregarCalificacion(60);
        
        Alumno a2=new Alumno("Maria Juarez",118456);
        a2.agregarCalificacion(90);
        a2.agregarCalificacion(90);
        a2.agregarCalificacion(90);
        
        Alumno a3=new Alumno("Rosa Fer",3569998);
        a3.agregarCalificacion(100);
        a3.agregarCalificacion(100);
        a3.agregarCalificacion(90);
        
        grupo.agregarAlumno(a1);
        grupo.agregarAlumno(a2);
        grupo.agregarAlumno(a3);
        
        
        System.out.println("Nombre: " + a1.getNombre() + "\nMatricula: " + a1.getMatricula() + "\n");
        System.out.println("Promedio: " + a1.calcularPromedio());
        
        System.out.println("ESTADISTICA DEL GRUPO");
        System.out.println("Grupo: "+grupo.getNumero()+" "+grupo.getMateria()+"Promedio del grupo: "+grupo.calcularPromedio());
        System.out.println(grupo.mostrarAlumnos());
        
        System.out.println("CONEL toString");
        System.out.println(grupo);

    }
     */
    public static void main(String[] args){
        Scanner leerCadenas = new Scanner(System.in);
        Scanner leerNumeros = new Scanner(System.in);
        
        System.out.println("Numero de grupo:");
        int g = leerNumeros.nextInt();
        System.out.println("Materia:");
        String m = leerCadenas.nextLine();
        Grupo grupo=new Grupo(g,m);
         
        System.out.println("Dame el nombre completo del alumno:");
        String nombre = leerCadenas.nextLine();
        System.out.println("Dame la matricula del alumno "+nombre+":");
        int matricula = leerNumeros.nextInt();
        
        Alumno a = new Alumno(nombre,matricula);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Dame la calificacion "+(i+1)+":");
            a.agregarCalificacion(leerNumeros.nextFloat());
        }
        grupo.agregarAlumno(a);
        System.out.println("Promedio grupo: "+grupo.calcularPromedio());
    }
}
