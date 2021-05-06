
/**
 * Write a description of class MusicUtility here.
 *
 * @author JasonChitwood
 * @version 1.5
 */
public class Album
{
    private String albumName;
    private String artist;
    private int trackNum;
    private double playTime;

    public Album(String albumNameIn, String artistIn, int trackNumIn, double playTimeIn)
    {
        albumName = albumNameIn;
        artist = artistIn;
        trackNum = trackNumIn;
        playTime = playTimeIn;
    }
    public int getTrackNum()
    {
        return trackNum;
    }
    public double getPlaytime()
    {
        return playTime;
    }
    public String getArtist()
    {
        return artist.toUpperCase();
    }
    public String getAlbumName()
    {
        return albumName.toUpperCase();
    }
    public String toString()
    {
        String output = "Album Name: " + albumName 
                        + "\nArtist: " + artist 
                        + "\nNumber of Tracks: " + trackNum 
                        + "\nPlay Time: " + playTime + " minutes\n";
        return output;
    }
}
