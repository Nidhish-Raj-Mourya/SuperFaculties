import java.util.LinkedList;

public class arrayListDs{

    public static void main(String a[]){
        LinkedList<String> MusicList = new LinkedList<>();
        
        MusicList.add("Tum hi  ho ..");
        MusicList.add("Rabata");
        MusicList.add("hanuman Chalisa");
        MusicList.add("Punjabi song ");

        // for(String song : MusicList){
        //     System.out.println(song);
        // }

        MusicList.remove("Punjabi song ");

        for(String song : MusicList){
            System.out.println(song);
        }

    }
}