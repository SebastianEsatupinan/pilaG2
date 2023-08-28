package modelo;

public class OperacionPila {

    public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaOriginal) {

        Pila<T> pilaAux = new Pila<>(); //Crea la pila Auxiliar
        Pila<T> pilaDuplicada = new Pila<>();//Crea la pila Duplicada
        while (!pilaOriginal.estaVacia()) {
            T elemento = pilaOriginal.desapilar(); //Saca los elemeentos de la pila oriniganal
            pilaAux.apilar(elemento); //Ponel los elementos en la pila Auxiliar
        }
        while (!pilaAux.estaVacia()) {
            T elementoOriginal = pilaAux.desapilar(); // Saca los elementos de la pila 
            T elementoCopiado = (T) elementoOriginal.copy(); // Duplica la pila
            pilaOriginal.apilar(elementoOriginal); //Agrega el elemento original de nuevo a la pila original
            pilaDuplicada.apilar(elementoCopiado); // Agrega eñl elemento duplicado a la pila duplicada
        }
        return pilaDuplicada;
    }

    public static <T extends Base> Pila<T> pilaResultado(Pila<T> pilaOriginal) {

        Pila<T> pilaDuplicada = duplicarPila(pilaOriginal);
        Pila<T> pilaResultado = new Pila<>();
        int indice = 0;
        while (!pilaDuplicada.estaVacia()) {
            T elemeneto = pilaDuplicada.desapilar();
            if (indice % 2 == 0) {
                pilaResultado.apilar(elemeneto);
            }
            indice++;
        }

        return pilaResultado;
    }
}
