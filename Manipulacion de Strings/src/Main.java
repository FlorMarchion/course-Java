import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int cantidadDePalabras;
        int searchWord;
        String phrase = "";
        String word = "";
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una frase de al menos 3 palabras...");
            phrase = scanner.nextLine();
            String[] palabras = phrase.split("\\s+");
            cantidadDePalabras = palabras.length;
            System.out.println("Cantidad de palabras: " + cantidadDePalabras);
        }while (cantidadDePalabras <= 2);
        Phrases frase = new Phrases(phrase);

        //Cantidad de caracteres
      frase.numberOfCharacters();

        // Contiene cierta palabra?

        // Contiene cierta palabra?
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres saber si existe cierta palabra dentro de la frase? Ingresa la palabra a continuación:");
        word = scanner.nextLine();

        frase.containsWord(word);
    }
}
