package CodeWars;
public class MaxDiff{
    //Diferenaça entre o maior e o menor numero de uma lista de inteiros
    public static void main(String[] args){
        Integer[] lista = new Integer[4];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = -4;
        System.out.println(maxDiff(lista));
    }

    public static int maxDiff(Integer[] lista){
        
        try{
        int maior = lista[0];
        int menor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] > maior){
                maior = lista[i];
            }

            if(lista[i] < menor){
                menor = lista[i];
            }
        }
        return maior - menor;
        }catch(IndexOutOfBoundsException e){
            return 0;
        }
    }
}