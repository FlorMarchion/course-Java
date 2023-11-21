import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Imprimir elementos
        List<Integer> numeros = new ArrayList<>();
        numeros.add(27);
        numeros.add(3);
        numeros.add(19);
        numeros.add(12);
        Utilidades.imprimirElementos(numeros);

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        Utilidades.imprimirElementos(palabras);


        //Copia de elementos
        List<Integer> numerosOrigen = new ArrayList<>();
        numerosOrigen.add(10);
        numerosOrigen.add(20);
        numerosOrigen.add(30);


        List<Number> numerosDestino = new ArrayList<>();
         Utilidades.copiarElemento(numerosOrigen, numerosDestino);
         Utilidades.imprimirElementos(numerosDestino);

        List<Number> numerosFloatDestino = new ArrayList<>();
        Utilidades.copiarElemento(numerosOrigen, numerosFloatDestino); //Float es una subclase de Number
        Utilidades.imprimirElementos(numerosFloatDestino);

        // No se permitirá copiar elementos a una lista que no sea superclase de Integer
        List<String> palabrasDestino = new ArrayList<>();
        // Utilidades.copiarElementos(numerosOrigen, palabrasDestino); // Esto generará un error de compilación

    }
}