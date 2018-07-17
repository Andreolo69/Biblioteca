package com.molcomz.cice.ejercicios.biblioteca.escritos;

import com.molcomz.cice.ejercicios.biblioteca.escritos.Articulo;

public class Revista extends Articulo {
    private int numero;
    private String periodicidad;

    public Revista(String fechaPublicacion, String nombre, int numero, String periodicidad) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", numero=" + numero +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
