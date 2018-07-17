package com.molcomz.cice.ejercicios.biblioteca.multimedia;

public class Multimedia {
    String titulo;
    String formato;
    long duracion;

    public Multimedia(String titulo, String formato, long duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
