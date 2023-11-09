public class Phrases {
    String phrase;
    String word;

    public Phrases(String phrase) {
        this.phrase = phrase;
    }

    public void numberOfCharacters(){
        int longitud = phrase.length();
        System.out.println("Cantidad de caracteres de la frase es: " + longitud);
    }

    public void containsWord(String word){ //indexOf()
        if (word != null) {
            int palabra = phrase.indexOf(word);
            System.out.println("palabra ingresada: " + palabra);
            if (palabra != -1) {
                System.out.println("La palabra " + word + " existe dentro de la frase !");
            } else {
                System.out.println("No se encontró la palabra " + word + " dentro de la frase. :( ");
            }
        }
        else {
        System.out.println("La palabra no ha sido ingresada.");
        }
    }



    public void lowercaseUppercase(){
        System.out.println("Mayúsculas y minúsculas");
    }

    public void addWord(){
        System.out.println("Agragar palabras en cualquier parte de la frase");
    }


}
