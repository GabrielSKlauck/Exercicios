/*
 * Metodo de comparaçao de prefixo de Strings
 */

public class Ex_2185{

    public static void main(String[] args) {
        String[] vetor = new String[3];
        vetor[0] = "palavra";
        vetor[1] = "tala";
        vetor[2] = "pa";

        System.out.println(prefixCount(vetor, "ta"));
    }

    public static int prefixCount(String[] words, String pref) {
        int counter = 0;

        for(int i = 0; i < words.length; i++){
            try{
                String word = words[i].substring(0, pref.length());
                if(word.equals(pref)){
                counter++;
            }
            }catch(StringIndexOutOfBoundsException e){} 
        }
        return counter;
    }
}