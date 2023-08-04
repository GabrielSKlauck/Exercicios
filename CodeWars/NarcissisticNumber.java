package CodeWars;

public class NarcissisticNumber {
    //Verifica se uma numero é narcisista
    public static void main(String[] args){
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) {
        String elevado = "" + number;
        int soma = 0;
        int numberInicial = number;

        do{
            soma += Math.pow((number % 10), elevado.length()); 
            number = number / 10;
        }while(number > 0);
        
        return soma == numberInicial;
    }
}
