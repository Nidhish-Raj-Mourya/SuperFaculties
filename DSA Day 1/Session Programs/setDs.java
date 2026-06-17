import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDs {
    public static void main(String a[]){
        Set<Integer> number = new HashSet<Integer>();
            number.add(6);
            number.add(7);
            number.add(8);
            number.add(9);

        for (int n : number){
            System.out.print(n+" ");
        }

        Set<Integer> numbers = new TreeSet<Integer>();
            number.add(6);
            number.add(7);
            number.add(8);
            number.add(9);

        for (int n : numbers){
            System.out.println(n);
        }
    }
}
