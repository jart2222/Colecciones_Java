package org.aguzman.ejemplos.set;

import java.util.Set;

public class EjemploTreeComparable {
    private String nombre;
    private int nota;

    public EjemploTreeComparable() {
    }

    public EjemploTreeComparable(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
