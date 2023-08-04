import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers{
    public static void main(String[]args){ 
         ArrayList<Integer> l1 = new ArrayList<>();    
          
         ArrayList<Integer> l2 = new ArrayList<>(); 
        

        l1.add(4);
        l1.add(2);
        l1.add(0);

        l2.add(1);
        l2.add(3);
        l2.add(2);

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2){

        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < l1.size(); i++) {
            int aux;
            aux = l1.get(i) + l2.get(i);
            if(aux / 10 > 0){
                
            }
            result.add(l1.get(i) + l2.get(i));
        }

        
        return result;
    }
}