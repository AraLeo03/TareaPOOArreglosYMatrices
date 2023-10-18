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
public class Alumno {

    private String nombre;
    private ArrayList<Float> calificaciones;
    private int matricula;

    public Alumno() {
        this.nombre = "Chancho";
        this.matricula = 0;
        calificaciones = new ArrayList();
    }

    public Alumno(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        calificaciones = new ArrayList();
    }

    public void agregarCalificacion(float calificacion) {
        calificaciones.add(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float calcularPromedio() {
        float promedio = 0;
        for (Float calificacion : calificaciones) {
            promedio += calificacion;
        }
        return promedio / calificaciones.size();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +", "+ "Matricula: " + matricula;
    }
}
