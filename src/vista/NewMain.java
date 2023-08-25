package vista;

import datos.Persona;
import datos.Producto;
import modelo.OperacionPila;
import modelo.Pila;
public class NewMain {

    public static void main(String[] args) {
        
        Pila<Producto> pilaOriginal = new Pila<>();
        pilaOriginal.apilar(new Producto("Arroz", "3456", 1500));
        pilaOriginal.apilar(new Producto("Maiz", "2233", 2000));
        pilaOriginal.apilar(new Producto("Papa", "5678", 2500));
        System.out.println("Pila Original " + pilaOriginal.toString());

        Pila<Producto> pilaDuplicada = OperacionPila.duplicarPila(pilaOriginal);
        System.out.println("Pila Duplicada " + pilaDuplicada.toString());

        pilaOriginal.desapilar();
        System.out.println("Pila Original modificada " + pilaOriginal.toString());
        System.out.println("Pila Duplicada " + pilaDuplicada.toString());
        Pila<Persona> pilaOriginalP = new Pila<>();
        
//        pilaOriginalP.apilar(new Persona("Ramiro Noguera", "Carrera 14 bis", 31));
//        pilaOriginalP.apilar(new Persona("María Torres", "Carrera 14", 29));
//        pilaOriginalP.apilar(new Persona("Carlos Rodríguez", "Calle 1", 27));
//        pilaOriginalP.apilar(new Persona("Sofía Cárdenas", "Calle 1", 43));
//        pilaOriginalP.apilar(new Persona("Pedro Pérez", "Diagonal 6", 23));
//        pilaOriginalP.apilar(new Persona("María Sánchez", "calle23", 14));
//        pilaOriginalP.apilar(new Persona("David Castro", "Carrera20", 11));
//
//        System.out.println("Pila Original Personas " + pilaOriginalP.toString());
//
//        Pila<Persona> pilaResultado = OperacionPila.pilaResultado(pilaOriginalP);
//        System.out.println("Pila Original Personas " + pilaResultado.toString());
    }
}

