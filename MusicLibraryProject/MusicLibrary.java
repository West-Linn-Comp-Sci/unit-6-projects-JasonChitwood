
/**
 * The MusicLibrary creates a array of albums that can be dynamically removed, added, sorted, and searched.
 *
 * @author Jason Chitwood
 * @version 2.0
 */
import java.util.*;
public class MusicLibrary
{
    private Album[] albumList;  //initializes blank library and other variables
    private int songCount;
    private int albumCount;
    private double totalPlaytime;
    private int listLength;
    private int nullPlace;
    private int sortCount;
    private int search;
    public MusicLibrary() //creates new music library
    {
         albumList = new Album[10];
         songCount = 0;
         albumCount = 0;
         totalPlaytime = 0;
         listLength = 10;
    }
    public void add(Album a) //adds a new album to the array
    {
        if (albumCount < listLength)
        {
            nullPlace = albumCount;
            for(int i = 0; i < listLength; i++)
            {
                if(albumList[i] == null)            //searches for a null place to fill before adding to the end of the array
                {
                    nullPlace = i;
                    break;
                }
            }
            albumList[nullPlace] = a;
            totalPlaytime += a.getPlaytime(); //adjusts variables
            albumCount ++;
            songCount += a.getTrackNum();
            sortCount = 0;
        } else {
            System.out.println("Cannot add Album, Library full."); //prints error due to lack of space
        }
    }
    public void remove(int a) //removes an album from the array
    {
        if (albumList[a] == null)
        {
           System.out.println("Slot Already Empty"); //if the slot is already empty, does not try to remove it
        } else {
           totalPlaytime -= albumList[a].getPlaytime(); //adjusts variables
           songCount -= albumList[a].getTrackNum();
           albumList[a] = albumList[albumCount - 1];    //moves last album in list to empty space created
           albumList[albumCount - 1] = null;
           sortCount = 0;
           albumCount --;
        }
    }
    public void doubleSize() //doubles the size of the array
    {
        Album[] albumListTemp = new Album[listLength*2]; //creates new array with twice the length
        for(int i = 0; i < listLength; i++)              //copies the old array
        {
            albumListTemp[i] = albumList[i];
        }
        listLength *= 2;
        albumList = albumListTemp;      //sets old array to new array with longer length
    }
    public String getAlbum(int a) //returns the whole album of an index
    {
        if (a >= 0 && a < albumCount)
        {
            return (albumList[a].toString());
        } else {
            return "Cannot retreive Album: Does Not Exist";
        }
    }
    public String getAlbumName(int a) //returns album name of an index
    {
        if (a >= 0 && a < albumCount)
        {
            return albumList[a].getAlbumName();
        } else {
            return "Cannot retreive Album Name: Does Not Exist";
        }
    }
    public String getArtist(int a) //returns artist of an index
    {
        if (a >= 0 && a <= listLength)
        {
            return albumList[a].getArtist();
        } else {
            return "Cannot retreive Artist: Does Not Exist";
        }
    }
    public void titleSort() //sorts the array by title
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
            albumList[min] = albumList[i]; //temp arrays to allow movement
            albumList[i] = temp;
        }
    }
    public void artistSort() //sorts the array by artist
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
    public int searchTitle(String title) //searches the array for a specific title
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
            return search;  //returns index
        } else {
            return -1;      //returns invalid index
        }
    }
    public int searchArtist(String artist) //searches the array for a specific artist
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
            return search;  //returns index
        } else {
            return -1;      //returns invalid index
        }
    }
    public int searchBinary(String title, String artist) //searches the array for an album using the title and the artist
    {
        if(sortCount > 0) //makes sure it has already been sorted
        {
            int low = 0, high = albumCount - 1, middle = (low + high)/2;
            while((!title.toUpperCase().equals(albumList[middle].getAlbumName()) && !artist.toUpperCase().equals(albumList[middle].getArtist())) && low <= high)
            {
                if (albumList[middle].getAlbumName().compareTo(title.toUpperCase()) > 0 && albumList[middle].getArtist().compareTo(artist.toUpperCase()) > 0){
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
                middle = (low + high)/2;
            }
            if (albumList[middle].getAlbumName().equals(title.toUpperCase()) && albumList[middle].getArtist().equals(artist.toUpperCase())){
                return middle;  //returns index
            } else {
                return -1;      //returns invalid index
            }
        } else {
            System.out.println("Cannot Search: Must Sort First.");
            return -1;
        }
    }
    public String toString() //returns library data and all album data seperately
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
