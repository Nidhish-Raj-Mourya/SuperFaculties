import java.util.HashMap;
import java.util.Map;

public class mapDs {
   public static void main(String a[]){
        Map<String,Integer> students = new HashMap<>();
        
        students.put("Nidhish", 95);
        students.put("Amuruta",95);
        students.put("Harsh",90);
        students.put("Rahul",67);

        System.out.println(students.get("Nidhish"));
        System.out.println(students.keySet());

        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
   } 
}
