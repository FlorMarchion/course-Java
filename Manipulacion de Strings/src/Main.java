import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidadDePalabras;
        String phrase = "";
        String word = "";
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una frase de al menos 3 palabras...");
            phrase = scanner.nextLine();
            String[] palabras = phrase.split("\\s+");
            cantidadDePalabras = palabras.length;
        }while (cantidadDePalabras <= 2);
        Phrases frase = new Phrases(phrase);

        //Cantidad de caracteres
      frase.numberOfCharacters();

       // Contiene cierta palabra?
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres saber si existe cierta palabra dentro de la frase? Ingresa la palabra a continuación:");
        word = scanner.nextLine();
        frase.containsWord(word);

        //Upper & Lowe case
        frase.lowercaseUppercase();

        //Extraer primer palabra de la  frase
        frase.printFirstWord();

        //Agregar una palabra a la frase
        System.out.println("Escribe algo más (precedido de un espacio) para agregar al final de tu frase: ");
        word = scanner.nextLine();
        System.out.println("Este es el resultado de tu frase:");
        frase.addWord(word);
    }
}
