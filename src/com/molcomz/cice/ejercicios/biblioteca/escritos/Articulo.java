package com.molcomz.cice.ejercicios.biblioteca.escritos;

public class Articulo {
    private String fechaPublicacion;
    private String nombre;

    public Articulo(String fechaPublicacion, String nombre) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "fechaPublicacion='" + fechaPublicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
