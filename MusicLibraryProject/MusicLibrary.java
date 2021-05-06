
/**
 * Write a description of class MusicLibrary here.
 *
 * @author Jason Chitwood
 * @version 1.7
 */
import java.util.*;
public class MusicLibrary
{
    private Album[] albumList;
    private int songCount;
    private int albumCount;
    private double totalPlaytime;
    private int listLength;
    private int nullPlace;
    private int sortCount;
    private int search;
    public MusicLibrary()
    {
         albumList = new Album[10];
         songCount = 0;
         albumCount = 0;
         totalPlaytime = 0;
         listLength = 10;
    }
    public void add(Album a)
    {
        if (albumCount < listLength)
        {
            nullPlace = albumCount;
            for(int i = 0; i < listLength; i++)
            {
                if(albumList[i] == null)
                {
                    nullPlace = i;
                    break;
                }
            }
            albumList[nullPlace] = a;
            totalPlaytime += a.getPlaytime();
            albumCount ++;
            songCount += a.getTrackNum();
            sortCount = 0;
        } else {
            System.out.println("Cannot add Album, Library full.");
        }
    }
    public void remove(int a)
    {
        if (albumList[a] == null)
        {
           System.out.println("Slot Already Empty");
        } else {
           totalPlaytime -= albumList[a].getPlaytime();
           songCount -= albumList[a].getTrackNum();
           albumList[a] = albumList[albumCount - 1];
           albumList[albumCount - 1] = null;
           sortCount = 0;
           albumCount --;
        }
    }
    public void doubleSize()
    {
        Album[] albumListTemp = new Album[listLength*2];
        for(int i = 0; i < listLength; i++)
        {
            albumListTemp[i] = albumList[i];
        }
        listLength *= 2;
        albumList = albumListTemp;
    }
    public String getAlbum(int a)
    {
        if (a >= 0 && a <= listLength)
        {
            return (albumList[a].toString());
        } else {
            return "Cannot retreive Album: Does Not Exist";
        }
    }
    public String getAlbumName(int a)
    {
        if (a >= 0 && a <= listLength)
        {
            return albumList[a].getAlbumName();
        } else {
            return "Cannot retreive Album Name: Does Not Exist";
        }
    }
    public String getArtist(int a)
    {
        if (a >= 0 && a <= listLength)
        {
            return albumList[a].getArtist();
        } else {
            return "Cannot retreive Artist: Does Not Exist";
        }
    }
    public void titleSort()
    {
        sortCount++;
        int min; 
        Album temp;
        for (int i = 0; i < albumCount - 1; i++)
        {
            min = i;
            for (int scan = i + 1; scan < albumCount; scan++)
            {
                if (albumList[scan].getAlbumName().compareTo(albumList[min].getAlbumName()) < 0) 
                {
                    min = scan;
                }
            }
            temp = albumList[min];
            albumList[min] = albumList[i];
            albumList[i] = temp;
        }
    }
    public void artistSort()
    {
        sortCount++;
        for (int i = 1; i < albumCount; i++)
        {
            String key = albumList[i].getArtist();
            int position = i;
            Album temp = albumList[i];
            while (position > 0 && (albumList[position - 1].getArtist().compareTo(key) > 0))
            {
                albumList[position] = albumList[position - 1];
                position--;
            }
            albumList[position] = temp;
        }
    }
    public int searchTitle(String title)
    {
        for(int i = 0; i < albumCount; i++)
        {
           if(albumList[i].getAlbumName().equals(title.toUpperCase()))
           {
              search = i;
              break;
           }
        }
        if (title.toUpperCase().equals(albumList[search].getAlbumName())){
            return search;
        } else {
            return -1;
        }
    }
    public int searchArtist(String artist)
    {
        for(int i = 0; i < albumCount; i++)
        {
           if(albumList[i].getArtist().equals(artist.toUpperCase()))
           {
              search = i;
              break;
           }
        }
        if (artist.toUpperCase().equals(albumList[search].getArtist())){
            return search;
        } else {
            return -1;
        }
    }
    public int searchBinary(String title, String artist)
    {
        if(sortCount > 0)
        {
            int low = 0, high = albumCount - 1, middle = (low + high)/2;
            while((!title.toUpperCase().equals(albumList[middle].getAlbumName()) && !artist.toUpperCase().equals(albumList[middle].getArtist())) && low <= high)
            {
                if (albumList[middle].getAlbumName().compareTo(title.toUpperCase()) > 0 && albumList[middle].getArtist().compareTo(artist.toUpperCase()) > 0){ //--
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
                middle = (low + high)/2;
            }
            if (albumList[middle].getAlbumName().equals(title.toUpperCase()) && albumList[middle].getArtist().equals(artist.toUpperCase())){
                return middle; 
            } else {
                return -1;
            }
        } else {
            System.out.println("Cannot Search: Must Sort First.");
            return -1;
        }
    }
    public String toString()
    {
        String output = "\nNumber of Albums in Library: " + albumCount + "/" + listLength 
                        + "\nNumber of Tracks in Library: " + songCount 
                        + "\nTotal play time(minutes): " + totalPlaytime + "\n"
                        + "Albums: \n\n";
        for(int i = 0; i < listLength; i++)
        {
            if(albumList[i] != null)
            {
                output += albumList[i] + "\n\n";
            }
        }
        return output;
    }
}
