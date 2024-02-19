
Music player app demo

Explanation:

The RecentlyPlayedStore class maintains a map userSongsMap where the key is the user and the value is a list of songs played by that user.

The addSong method adds a song played by a user to the list of songs for that user.

If the capacity is exceeded after adding a new song, the oldest song is removed from the list.

The getRecentlyPlayed method retrieves the recently played songs for a given user.

In the main method, the RecentlyPlayedStore is instantiated, songs are added for a user, and recently played songs are retrieved and printed for demonstration.
