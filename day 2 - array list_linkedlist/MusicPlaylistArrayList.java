import java.util.ArrayList;

public class MusicPlaylistArrayList {

    public static void main(String[] args) {

        ArrayList<String> playlist = new ArrayList<>();

        // Add songs
        playlist.add("Kesariya");
        playlist.add("Apna Bana Le");
        playlist.add("Tum Hi Ho");
        playlist.add("Chaleya");

        // Display complete playlist
        System.out.println("Music Playlist:");

        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + playlist.get(i)
            );
        }

        // Play a song by position
        int currentSongIndex = 1;

        System.out.println("\nNow Playing:");
        System.out.println(playlist.get(currentSongIndex));

        // Play next song
        currentSongIndex++;

        System.out.println("\nNext Song:");
        System.out.println(playlist.get(currentSongIndex));

        // Remove a song
        playlist.remove("Tum Hi Ho");

        System.out.println("\nPlaylist after removing a song:");

        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + playlist.get(i)
            );
        }
    }
}