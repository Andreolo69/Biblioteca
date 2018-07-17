package com.molcomz.cice.ejercicios.biblioteca;

import com.molcomz.cice.ejercicios.biblioteca.escritos.Comic;
import com.molcomz.cice.ejercicios.biblioteca.escritos.Libro;
import com.molcomz.cice.ejercicios.biblioteca.escritos.Revista;
import com.molcomz.cice.ejercicios.biblioteca.multimedia.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    private ArrayList<Object> biblioteca;
    private ArrayList<Prestable> prestados;

    Scanner scanner;
    String dato;

    public Inicio(){
        biblioteca=new ArrayList<>();
        prestados=new ArrayList<>();

        //Añadimos unos artículos de ejemplo
        biblioteca.add(new Libro("10-10-10","Diez","Décima","10101010-10","Don Diez"));
        biblioteca.add(new Revista("8-8-8","El Octavio Pasajero",8,"Cada 8 días"));
        biblioteca.add(new Comic("13-1-13","Trenzas",13,"Trece"));
        biblioteca.add(new Revista("2-2-2","El duodeno",2,"Cada 2 semanas"));

        menuPrincipal();
    }
    public void menuPrincipal(){
        do {
            System.out.println("-MENU PRINCIPAL-");
            System.out.println("\n1. Agregar artículo a la biblioteca.");
            System.out.println("2. Ver todos los artículos de la biblioteca.");
            System.out.println("3. Prestar artículo");
            System.out.println("4. Devolver artículo");
            System.out.println("5. Ver artículos prestados.");
            System.out.println("X. SALIR.");
            System.out.print("\nINTRODUCE OPCION: ");
            scanner=new Scanner(System.in);
            dato=scanner.nextLine();
            switch(dato){
                case "1":
                    menuAgregarArticulo();
                    break;
                case "2":
                    verArticulos();
                    break;
                case "3":
                    prestarArticulo();
                    break;
                case "4":
                    devolverArticulo();
                    break;
                case "5":
                    verPrestados();
                    break;
            }


        }while(!dato.equalsIgnoreCase("X"));
    }
    public void verArticulos(){
        System.out.println("\\-------------------------------");
        System.out.println("Listado de artículos.");
        for(Object a:biblioteca){
            System.out.println(biblioteca.indexOf(a)+" - "+a.toString());
        }
        System.out.println("-------------------------------/");
    }
    public void verPrestados(){
        System.out.println("\\-------------------------------");
        System.out.println("Listado de artículos prestados.");
        for(Prestable a:prestados){
            System.out.println(prestados.indexOf(a)+" - "+a.toString());
        }
        System.out.println("-------------------------------/");
    }
    public void menuAgregarArticulo(){
        do {
            System.out.println("-MENU AGREGAR ARTÍCULO A LA BIBLIOTECA");
            System.out.println("\n1. Agregar libro.");
            System.out.println("2. Agregar comic.");
            System.out.println("3. Agregar revista.");
            System.out.println("4. Agregar disco.");
            System.out.println("X. MENU ANTERIOR.");
            System.out.print("\nINTRODUCE OPCION: ");
            scanner = new Scanner(System.in);
            dato = scanner.nextLine();
            switch (dato){
                case "1":
                    agregarLibro();
                    break;
                case "2":
                    agregarComic();
                    break;
                case "3":
                    agregarRevista();
                    break;
                case "4":
                    agregarDisco();
                    break;
            }
        }while(!dato.equalsIgnoreCase(("X")));
        dato="";
    }
    public void agregarLibro(){
        Scanner scanner;
        String fechaPublicacion="";
        String nombre="";
        String edicion="";
        String isbn="";
        String autor="";

        System.out.print("Fecha de publicación: ");
        scanner=new Scanner(System.in);
        fechaPublicacion=scanner.nextLine();
        System.out.print("Nombre: ");
        scanner=new Scanner(System.in);
        nombre=scanner.nextLine();
        System.out.print("Edición: ");
        scanner=new Scanner(System.in);
        edicion=scanner.nextLine();
        System.out.print("ISBN: ");
        scanner=new Scanner(System.in);
        isbn=scanner.nextLine();
        System.out.print("Autor: ");
        scanner=new Scanner(System.in);
        autor=scanner.nextLine();

        biblioteca.add(new Libro(fechaPublicacion,nombre,edicion,isbn,autor));
    }
    public void agregarComic(){
        String fechaPublicacion="";
        String nombre="";
        int numero=0;
        String coleccion="";

        System.out.print("Fecha de publicación: ");
        scanner=new Scanner(System.in);
        fechaPublicacion=scanner.nextLine();
        System.out.print("Nombre: ");
        scanner=new Scanner(System.in);
        nombre=scanner.nextLine();
        System.out.print("Número: ");
        scanner=new Scanner(System.in);
        numero=scanner.nextInt();
        System.out.print("Colección: ");
        scanner=new Scanner(System.in);
        coleccion=scanner.nextLine();

        biblioteca.add(new Comic(fechaPublicacion,nombre,numero,coleccion));
    }
    public void agregarDisco(){
        String titulo="";
        String formato="";
        Long duracion=0L;

        System.out.print("Título: ");
        scanner=new Scanner(System.in);
        titulo=scanner.nextLine();
        System.out.print("Formato: ");
        scanner=new Scanner(System.in);
        formato=scanner.nextLine();
        System.out.print("Duración (en segundos): ");
        scanner=new Scanner(System.in);
        duracion=scanner.nextLong();


        biblioteca.add(new Disco(titulo,formato,duracion));
    }
    public void agregarRevista(){
        String fechaPublicacion="";
        String nombre="";
        int numero=0;
        String periodicidad="";

        System.out.print("Fecha de publicación: ");
        scanner=new Scanner(System.in);
        fechaPublicacion=scanner.nextLine();
        System.out.print("Nombre: ");
        scanner=new Scanner(System.in);
        nombre=scanner.nextLine();
        System.out.print("Número: ");
        scanner=new Scanner(System.in);
        numero=scanner.nextInt();
        System.out.print("Periodicidad: ");
        scanner=new Scanner(System.in);
        periodicidad=scanner.nextLine();

        biblioteca.add(new Revista(fechaPublicacion,nombre,numero,periodicidad));
    }
    public void prestarArticulo(){
        int indice;
        Prestable prestado;

        for(;;) {
            verArticulos();
            System.out.println("Indica el número del artículo a prestar o \"X\" para volver al menú anterior: ");
            scanner = new Scanner(System.in);
            dato=scanner.nextLine();
            if(dato.equalsIgnoreCase("x")){
                dato="";
                return;
            }else{
                indice =Integer.parseInt(dato);
            }
            //Comprueba que el indice está en la colección
            if (indice > biblioteca.size() - 1) {
                System.out.println("El número no corresponde a ningún artículo.");
                continue;
            }
            //Comprueba que es un artículo prestable
            if((biblioteca.get(indice)) instanceof Prestable) {
                prestado= (Prestable) biblioteca.get(indice);
                //Comprueba que no está prestado ya.
                if(prestado.esPrestado()){
                    System.out.println("El artículo ya ha sido prestado.");
                    continue;
                }
                prestados.add((Prestable) biblioteca.get(indice));
                System.out.print("Nombre de la persona: ");
                scanner=new Scanner(System.in);
                prestado.setPersonaPrestado(scanner.nextLine());
                System.out.print("Fecha del préstamo: ");
                scanner=new Scanner(System.in);
                prestado.setFechaPrestado(scanner.nextLine());
                prestado.setPrestado(true);
                break;
            }else{
                System.out.println("El artículo no se puede prestar.");
            }
        }

    }
    public void devolverArticulo(){
        int indice;
        Prestable prestado;

        for(;;) {
            verPrestados();
            System.out.println("Indica el número del artículo a devolver o \"X\" para volver al menú anterior: ");
            scanner = new Scanner(System.in);
            dato=scanner.nextLine();
            if(dato.equalsIgnoreCase("x")){
                dato="";
                return;
            }else{
                indice =Integer.parseInt(dato);
            }
            //Comprueba que el indice está en la colección
            if (indice > prestados.size() - 1) {
                System.out.println("El número no corresponde a ningún artículo prestado.");
                continue;
            }
            prestado=prestados.get(indice);
            prestado.setPersonaPrestado("");
            prestado.setFechaPrestado("");
            prestado.setPrestado(false);
            prestados.remove(indice);
            break;
        }

    }
}
