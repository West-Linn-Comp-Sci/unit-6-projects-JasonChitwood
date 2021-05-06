
/**
 * Creates an album object with title, artist, track number, play time, and other utility through methods.
 *
 * @author JasonChitwood
 * @version 1.6
 */
public class Album
{
    private String albumName; //initializing variables
    private String artist;
    private int trackNum;
    private double playTime;
    public Album(String albumNameIn, String artistIn, int trackNumIn, double playTimeIn) //creates album with said inputs
    {
        albumName = albumNameIn;
        artist = artistIn;
        trackNum = trackNumIn;
        playTime = playTimeIn;
    }
    public int getTrackNum() //returns number of tracks
    {
        return trackNum;
    }
    public double getPlaytime() //returns playtime
    {
        return playTime;
    }
    public String getArtist() //returns artist in all caps
    {
        return artist.toUpperCase();
    }
    public String getAlbumName() //returns album name in all caps
    {
        return albumName.toUpperCase();
    }
    public String toString() //returns album data
    {
        String output = "Album Name: " + albumName 
                        + "\nArtist: " + artist 
                        + "\nNumber of Tracks: " + trackNum 
                        + "\nPlay Time: " + playTime + " minutes\n";
        return output;
    }
}
