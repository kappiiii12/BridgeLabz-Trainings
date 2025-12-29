class SongNode {
    String songName;
    String artist;
    double duration;
    SongNode next;

    public SongNode(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.next = this; // Circular reference
    }
}

public class MusicPlaylist {
    private SongNode head = null;
    private SongNode currentSong = null; // To track "Play Next"

    // 1. Add Song (At the end)
    public void addSong(String name, String artist, double duration) {
        SongNode newNode = new SongNode(name, artist, duration);
        if (head == null) {
            head = newNode;
            currentSong = head;
        } else {
            SongNode temp = head;
            // Traverse to the last node
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Close the circle
        }
    }

    // 2. Play Next Song
    public void playNext() {
        if (currentSong == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        currentSong = currentSong.next;
        System.out.println("Now Playing: " + currentSong.songName + " by " + currentSong.artist);
    }

    // 3. Display Playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        SongNode temp = head;
        do {
            System.out.println("Song: " + temp.songName + " | Artist: " + temp.artist);
            temp = temp.next;
        } while (temp != head); // Stop when we get back to the start
    }

    // 4. Delete Song by Name
    public void deleteSong(String name) {
        if (head == null) return;

        SongNode curr = head;
        SongNode prev = null;

        // Case 1: Head is the song to delete
        if (head.songName.equals(name)) {
            // Find last node to update its pointer
            SongNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            if (head == head.next) { // Only one song in list
                head = null;
                currentSong = null;
            } else {
                head = head.next;
                last.next = head;
                currentSong = head;
            }
            return;
        }

        // Case 2: Song is somewhere else in the loop
        do {
            prev = curr;
            curr = curr.next;
            if (curr.songName.equals(name)) {
                prev.next = curr.next;
                if (curr == currentSong) currentSong = prev; // Reset playing track
                return;
            }
        } while (curr != head);
        
        System.out.println("Song not found.");
    }

    public static void main(String[] args) {
        MusicPlaylist myPlaylist = new MusicPlaylist();
        myPlaylist.addSong("Levitating", "Dua Lipa", 3.23);
        myPlaylist.addSong("Blinding Lights", "The Weeknd", 3.20);
        myPlaylist.addSong("Stay", "The Kid LAROI", 2.21);

        System.out.println("--- Full Playlist ---");
        myPlaylist.displayPlaylist();

        System.out.println("\n--- Testing Play Next ---");
        myPlaylist.playNext(); // Blinding Lights
        myPlaylist.playNext(); // Stay
        myPlaylist.playNext(); // Levitating (Circular!)
    }
}