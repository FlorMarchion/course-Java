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
            if (palabra != -1) {
                System.out.println("La palabra *" + word + "* existe dentro de la frase !");
            } else {
                System.out.println("No se encontró la palabra *" + word + "* dentro de la frase. :( ");
            }
        }
        else {
        System.out.println("La palabra no ha sido ingresada.");
        }
    }
    public void lowercaseUppercase(){
        if(phrase.equals(phrase.toLowerCase())){
            String phraseToUpperCase = phrase.toUpperCase();
            System.out.println("Tu frase a sido convertida en mayúculas: " + phraseToUpperCase );
        }else{
            String phraseToLowerCase = phrase.toLowerCase();
            System.out.println("Tu frase a sido convertida en minúsculas: " + phraseToLowerCase );
        }
    }

    public void printFirstWord(){
        int space = phrase.indexOf(" ");
        String firstWord = phrase.substring(0, space);
        System.out.println("La primer palabra de tu frase es: " + firstWord);
    }

    public void addWord(String word){
        System.out.println(phrase.concat(word));
    }
}
