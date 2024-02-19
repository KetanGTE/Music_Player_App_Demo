import java.util.*;

public class RecentlyPlayedStore {
    private final int capacity;
    private final Map<String, LinkedList<String>> userSongsMap;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.userSongsMap = new HashMap<>();
    }

    public void addSong(String user, String song) {
        userSongsMap.putIfAbsent(user, new LinkedList<>());
        LinkedList<String> songs = userSongsMap.get(user);

        // Remove the song if it already exists to maintain uniqueness
        songs.remove(song);

        // Add the song to the beginning of the list
        songs.addFirst(song);

        // Ensure the capacity is maintained
        if (songs.size() > capacity) {
            songs.removeLast();
        }
    }

    public List<String> getRecentlyPlayed(String user) {
        return userSongsMap.getOrDefault(user, new LinkedList<>());
    }

    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        // Adding songs played by a user
        store.addSong("User1", "S1");
        store.addSong("User1", "S2");
        store.addSong("User1", "S3");

        System.out.println("Recently played songs by User1: " + store.getRecentlyPlayed("User1"));

        store.addSong("User1", "S4");
        System.out.println("Recently played songs by User1: " + store.getRecentlyPlayed("User1"));

        store.addSong("User1", "S2");
        System.out.println("Recently played songs by User1: " + store.getRecentlyPlayed("User1"));

        store.addSong("User1", "S1");
        System.out.println("Recently played songs by User1: " + store.getRecentlyPlayed("User1"));
    }
}
