package com.molcomz.cice.ejercicios.biblioteca.escritos;

import com.molcomz.cice.ejercicios.biblioteca.Prestable;
import com.molcomz.cice.ejercicios.biblioteca.escritos.Articulo;

public class Libro extends Articulo implements Prestable {
    private String edicion;
    private String isbn;
    private String autor;

    private boolean prestado=false;
    private String fechaPrestado;
    private String personaPrestado;

    public Libro(String fechaPublicacion, String nombre, String edicion, String isbn, String autor) {
        super(fechaPublicacion, nombre);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void setPrestado(boolean prestado) {
        this.prestado=prestado;
    }

    @Override
    public boolean esPrestado() {
        return prestado;
    }

    @Override
    public void setFechaPrestado(String fecha) {
        fechaPrestado=fecha;
    }

    @Override
    public String getFechaPrestado() {
        return fechaPrestado;
    }

    @Override
    public void setPersonaPrestado(String persona) {
        personaPrestado=persona;
    }

    @Override
    public String getPersonaPrestado() {
        return personaPrestado;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edicion='" + edicion + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado='" + prestado + '\'' +
                ", persona prestado='" + getPersonaPrestado() + '\'' +
                ", fecha prestado='" + getFechaPrestado() + '\'' +
                '}';
    }

}
