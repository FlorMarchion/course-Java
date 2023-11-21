import java.util.Collection;
import java.util.List;

public class Utilidades {
 //Método que imprime elementos de la lista
public static <T> void imprimirElementos(List<T> lista){
    for(T elemento : lista){
        System.out.println(elemento);
    }
}

//Método para copiar elementos de una lista de origen a una lista de destino
// Utilizo bounded generic para asegurar que la lista de destino sea de un tipo igual o superclase del tipo de la lista de origen

    public static <T, U extends T> void copiarElemento(List<? extends T> origen, Collection<? super T> destino){
        destino.addAll(origen);
    }
}
