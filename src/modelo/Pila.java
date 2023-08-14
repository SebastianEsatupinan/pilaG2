package modelo;

import java.util.LinkedList;

public class Pila <T extends Base>{
    
    private LinkedList<T> tope;

    public Pila() {
        tope = new LinkedList<>();
    }
    
    public void apilar(T elemento){
        tope.addFirst(elemento);
    }
    
    public T desapilar(){
        return tope.removeFirst();
    }
    
    public Boolean apilar(){
        return tope.isEmpty();
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder("{");
        
        for(T elemento : tope){
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
    
    
}
