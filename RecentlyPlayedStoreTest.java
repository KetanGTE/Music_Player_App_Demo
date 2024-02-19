import java.util.List;

public class RecentlyPlayedStoreTest {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        // Adding songs played by a user
        store.addSong("User1", "S1");
        store.addSong("User1", "S2");
        store.addSong("User1", "S3");

        // Validating initial playlist
        List<String> user1Songs = store.getRecentlyPlayed("User1");
        System.out.println("Initial playlist for User1: " + user1Songs);

        // Adding more songs
        store.addSong("User1", "S4");
        store.addSong("User1", "S2");
        store.addSong("User1", "S1");

        // Validating playlist after adding more songs
        user1Songs = store.getRecentlyPlayed("User1");
        System.out.println("Playlist for User1 after adding more songs: " + user1Songs);

        // Validating with another user
        store.addSong("User2", "S5");
        List<String> user2Songs = store.getRecentlyPlayed("User2");
        System.out.println("Playlist for User2: " + user2Songs);
    }
}