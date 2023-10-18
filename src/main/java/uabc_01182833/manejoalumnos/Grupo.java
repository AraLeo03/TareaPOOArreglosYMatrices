/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc_01182833.manejoalumnos;

import java.util.ArrayList;

/**
 *
 * @author comp01h
 */
public class Grupo {

    private ArrayList<Alumno> alumnos;
    private int numero;
    private float promedio;
    private String materia;

    public Grupo() {
        this.numero = 250;
        this.promedio = 66;
        this.materia = "POO";
        alumnos = new ArrayList();
    }

    public Grupo(int numero, float promedio, String materia) {
        this.numero = numero;
        this.promedio = promedio;
        this.materia = materia;
        alumnos = new ArrayList();
    }
    
    public Grupo(int numero, String materia){
        this.numero = numero;
        this.materia = materia;
        alumnos = new ArrayList();
    }

    public float calcularPromedio() {
        float promedio = 0;
        for (Alumno alumno : alumnos) {
            promedio += alumno.calcularPromedio();
        }
        this.promedio=promedio/alumnos.size();
        return this.promedio;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public String mostrarAlumnos() {
        String todos = "";
        for (Alumno alumno : alumnos) {
            todos += alumno + "\n";
        }
        return todos;
    }
    public String mostrarAlumnos2() {
        StringBuilder sb = new StringBuilder();
        for (Alumno alumno : alumnos) {
            sb.append(alumno).append("\n");
        }
        return sb.toString();
    }

    public int getNumero() {
        return numero;
    }

    public float getPromedio() {
        return promedio;
    }

    public String getMateria() {
        return materia;
    }
    

    @Override
    public String toString() {
        return "Grupo: "+numero + "\nalumnos:\n" + alumnos + ", numero: " + numero + ", promedio: " + promedio + ", materia: " + materia;
    }
    
    
}
