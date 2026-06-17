class SongNode {

    String songName;
    SongNode previous;
    SongNode next;

    SongNode(String songName) {
        this.songName = songName;
    }
}

public class MusicPlayerLinkedList {

    public static void main(String[] args) {

        SongNode song1 = new SongNode("Kesariya");
        SongNode song2 = new SongNode("Chaleya");
        SongNode song3 = new SongNode("Apna Bana Le");

        // Connect songs
        song1.next = song2;

        song2.previous = song1;
        song2.next = song3;

        song3.previous = song2;

        SongNode currentSong = song1;

        System.out.println("Now Playing: "
                + currentSong.songName);

        // Play next song
        if (currentSong.next != null) {
            currentSong = currentSong.next;
        }

        System.out.println("Next Song: "
                + currentSong.songName);

        // Play next song again
        if (currentSong.next != null) {
            currentSong = currentSong.next;
        }

        System.out.println("Next Song: "
                + currentSong.songName);

        // Play previous song
        if (currentSong.previous != null) {
            currentSong = currentSong.previous;
        }

        System.out.println("Previous Song: "
                + currentSong.songName);
    }
}