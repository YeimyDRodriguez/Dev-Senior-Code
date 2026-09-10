package com.plataforma.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private String codigo;
    private int capacidad;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, String codigo, int capacidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public boolean estaLleno(){
        return estudiantes.size() >= capacidad;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estaLleno()) {
            estudiantes.add(estudiante);
        } else {
            throw new IllegalStateException("El curso está lleno");
        }
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", capacidad=" + capacidad +
                ", estudiantes=" + estudiantes +
                '}';
    }
}