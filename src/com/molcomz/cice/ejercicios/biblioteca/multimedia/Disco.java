package com.molcomz.cice.ejercicios.biblioteca.multimedia;

import com.molcomz.cice.ejercicios.biblioteca.Prestable;

public class Disco extends Multimedia implements Prestable {
    private boolean prestado=false;
    private String fechaPrestado;
    private String personaPrestado;

    public Disco(String titulo, String formato, long duracion) {
        super(titulo, formato, duracion);
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
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", prestado=" + prestado +
                ", fechaPrestado='" + fechaPrestado + '\'' +
                ", personaPrestado='" + personaPrestado + '\'' +
                '}';
    }
}
