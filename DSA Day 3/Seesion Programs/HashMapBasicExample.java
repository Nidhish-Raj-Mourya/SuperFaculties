import java.util.HashMap;
import java.util.Map;

public class HashMapBasicExample {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Aman");
        students.put(102, "Riya");
        students.put(103, "Karan");

        System.out.println("Students: " + students);

        System.out.println("Student 102: " + students.get(102));

        students.put(102, "Priya");

        System.out.println("Updated students: " + students);

        students.remove(103);

        System.out.println("After removal: " + students);

        System.out.println("Contains key 101: "
                + students.containsKey(101));

        System.out.println("Contains value Aman: "
                + students.containsValue("Aman"));

        System.out.println("Size: " + students.size());
    }
}