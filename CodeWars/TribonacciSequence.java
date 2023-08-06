package CodeWars;

public class TribonacciSequence {
    //É tipo a sequencia de fibonacci, porem ao invez de usar 2 numeros usa-se 3
    public static void main(String[] args){
        double[] lista = new double []{0,1,1};
        double[] lista2 = tribonacci(lista, 10);
        System.out.println(percorre(lista2));
        
        
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] sequence = new double[n];
        try{
        sequence[0] = s[0];
        sequence[1] = s[1];
        sequence[2] = s[2];
        }catch(IndexOutOfBoundsException e){
            return sequence;
        }

        for (int i = 0; i < sequence.length; i++) {
            try{
            sequence[i + 3] = sequence[i] + sequence[i + 1] + sequence[i + 2];
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        
        return sequence;
    }

    public static String percorre(double[] s){
        String string = "";
        for (int i = 0; i < s.length; i++) {
            string += s[i] + " - ";
        }
        return string;
    }
}
