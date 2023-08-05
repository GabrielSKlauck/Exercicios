package CodeWars;

public class TribonacciSequence {
    public static void main(String[] args){
        double[] lista = new double []{1,1,1};

        System.out.println(percorre(tribonacci(lista, 10)));
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] sequence = new double[n];
        sequence[0] = s[0];
        sequence[1] = s[1];
        sequence[2] = s[2];

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
            string += s[0] + " ";
        }
        return string;
    }
}
