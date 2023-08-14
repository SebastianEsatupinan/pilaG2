package vista;

import datos.Producto;
import modelo.Pila;

public class NewMain {

    public static void main(String[] args) {
        
        Pila<Producto> pilaP1 = new Pila<>();
        
        pilaP1.apilar(new Producto("Arroz","12312", 121323));
        pilaP1.apilar(new Producto("Mais","22234", 20000));
        pilaP1.apilar(new Producto("Papa","21423", 23123));
        
        System.out.println("Pila Original " + pilaP1.toString());
        
        pilaP1.desapilar();
        
        System.out.println("Pila Modificada " + pilaP1.toString());
    }
    
}

