import java.util.ArrayList;
import java.util.List;

public class listDs {
    public static void main(String a[]){
        List<Integer> number = new ArrayList<Integer>();
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);

        System.err.println(number);

        for(Object n : number){
            int num = (Integer)n;
            System.out.print(num+" ");
        }

        System.out.println(number.get(2));
    }
}
