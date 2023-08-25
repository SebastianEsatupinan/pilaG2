package modelo;

public class OperacionPila {
    
    public static <T extends Base> Pila<T> duplicarPila (Pila<T> pilaOriginal){
        
      Pila<T> pilaAux = new Pila<>();
        Pila<T> pilaDuplicada = new Pila<>();
        while (!pilaOriginal.estaVacia()) {
            T elemento = pilaOriginal.desapilar();
            pilaAux.apilar(elemento);
        }
        while (!pilaAux.estaVacia()) {
            T elementoOriginal = pilaAux.desapilar();
            T elementoCopiado = (T) elementoOriginal.copy();
            pilaOriginal.apilar(elementoOriginal);
            pilaDuplicada.apilar(elementoCopiado);
        }
        return pilaDuplicada;
    }
    public static <T extends Base> Pila<T> pilaResultado(Pila<T> pilaOriginal) {

        Pila<T> pilaDuplicada =duplicarPila(pilaOriginal);
        Pila<T> pilaResultado = new Pila<>();
        int indice=0;
        while (!pilaDuplicada.estaVacia()) {  
            T elemeneto=pilaDuplicada.desapilar();
            if(indice % 2 ==0){
                pilaResultado.apilar(elemeneto);
            }
            indice++;
        }

        return pilaResultado;
    }
}