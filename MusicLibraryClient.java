
/**
 * Write a description of class MusicLibraryClient here.
 *
 * @author Jason Chitwood
 * @version 1.3
 */
public class MusicLibraryClient {
    public static void main(String[] args) {
        
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("All Them Horses", "Jon Cinncinati", 21, 48);
        Album a5 = new Album("Big Time", "Bobba", 7, 24.7);
        Album a6 = new Album("Central Park", "Camas Players", 14, 56.3);
        Album a7 = new Album("Dead Done and Dusted", "Deathrone", 5, 21);
        Album a8 = new Album("Euclid Empires", "Zoot", 12, 47);
        Album a9 = new Album("Late Night", "Snoozers", 7, 240);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.doubleSize();
        myLibrary.titleSort();
        System.out.println(myLibrary.searchTitle("dead done and dusted"));
        System.out.println(myLibrary.searchArtist("Zoot"));
        System.out.println(myLibrary.searchBinary("Play", "People"));

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a9);
        myLibrary.artistSort();
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
        //System.out.println(myLibrary);

        //System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}
