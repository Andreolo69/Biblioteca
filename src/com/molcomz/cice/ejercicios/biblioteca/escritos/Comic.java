package com.molcomz.cice.ejercicios.biblioteca.escritos;

import com.molcomz.cice.ejercicios.biblioteca.escritos.Articulo;

public class Comic extends Articulo {
    private int numero;
    private String coleccion;

    public Comic(String fechaPublicacion, String nombre, int numero, String coleccion) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", numero=" + numero +
                ", coleccion='" + coleccion + '\'' +
                '}';
    }
}
