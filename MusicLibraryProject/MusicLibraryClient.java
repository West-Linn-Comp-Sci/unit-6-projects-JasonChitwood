
/**
 * Creates and interacts music library that holds multiple albums inside of it.
 *
 * @author Jason Chitwood
 * @version 1.3
 */
public class MusicLibraryClient {
    public static void main(String[] args) {
        
        MusicLibrary myLibrary = new MusicLibrary(); //creates new music library

        Album a1 = new Album("First", "one Guy", 10, 42.5);                 //creates albums
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("All Them Horses", "Jon Cinncinati", 21, 48);
        Album a5 = new Album("Big Time", "Bobba", 7, 24.7);
        Album a6 = new Album("Central Park", "Camas Players", 14, 56.3);
        Album a7 = new Album("Dead Done and Dusted", "Deathrone", 5, 21);
        Album a8 = new Album("Euclid Empires", "Zoot", 12, 47);
        Album a9 = new Album("Late Night", "Snoozers", 7, 240);

        myLibrary.add(a1);  //inserts albums
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        
        System.out.println(myLibrary); //prints library

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1); //remove index 1
        myLibrary.doubleSize(); //doubles size
        myLibrary.titleSort(); //sorts by title
        System.out.println("Sorted By Title");
        System.out.print("Searching for title 'Dead Done and Dusted'\n'Dead Done and Dusted' found at index: ");    //tests all of the search methods
        System.out.println(myLibrary.searchTitle("dead done and dusted"));
        System.out.print("Searching for artist 'Zoot'\n'Zoot' found at index: ");
        System.out.println(myLibrary.searchArtist("Zoot"));
        System.out.print("Searching for album 'Play' by artist 'People'\n'Play', by 'People' found at index: ");
        System.out.println(myLibrary.searchBinary("Play", "People"));

        System.out.println(myLibrary); //prints library

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1); //removes index 1
        myLibrary.add(a9); //adds new album
        myLibrary.artistSort(); //sorts by artist
        System.out.println("Sorted by Artist");
        System.out.println(myLibrary); //prints library

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}
