package com.molcomz.cice.ejercicios.biblioteca;

public interface Prestable {
    public void setPrestado(boolean prestado);
    public boolean esPrestado();
    public void setFechaPrestado(String fecha);
    public String getFechaPrestado();
    public void setPersonaPrestado(String persona);
    public String getPersonaPrestado();
}
