/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
import java.util.Calendar;
public class MediaLib
{
  private Book storedBook;
  public static String libraryOwner = "Shely";
  private static int totalEntries = 0;
  private Song storedSong;
  private int totalSongs = 0;
  private int totalBooks = 0;
  private int totalMovies = 0;
  private String libraryLastModified;

  public MediaLib() {
    libraryLastModified = lastModifiedDate();
  }

  //In addition to tracking the total items, individually track the number of books, the number of movies, and the number of songs that you have added to all of your libraries.
  public void addSong(Song newSong)
  {
    storedSong = newSong;
    totalSongs++;
    libraryLastModified = MediaLib.lastModifiedDate();
  }

  public String toString() 
  {
    //override the toString method in your MediaLib to show the state of the library
    String libraryInfo = "Book: " + storedBook + "\nSong: " + storedSong;
    return libraryInfo;
  }

  public void addBook(Book newBook)
  {
    storedBook = newBook;
    totalEntries++;
    libraryLastModified = MediaLib.lastModifiedDate();
  }

  // CODE TO ADD
  public Book getBook()
  {
    return storedBook;
  }
  public boolean equals(MediaLib otherLibrary){
      //You MediaLib equals method should use conditional expressions and the Book equals method to compare the instance variable book to the parameter ml's book.
      return this.storedBook.equals(otherLibrary.storedBook);
  }

  // public void testBook(Book tester){
  //   // change the title of the tester parameter and use a println to show the book’s title was changed, either printing the entire state of the object or using an accessor method
  //   tester.setTitle("Changed Title");
  //   System.out.println("Tester book title changed to: " + tester.getTitle()); 
  // }

  //modify mediaLib to store and display a movie
  //Create a new private instance variable Movie movie, Add a new method addMovie, Modify the toString method to also show any movie that has been defined
  private Movie storedMovie;
  public void addMovie(Movie newMovie)
  {

    storedMovie = newMovie;
    totalEntries++;
    libraryLastModified = MediaLib.lastModifiedDate();
  }

  public String toStringMovie() 
  {
    //override the toString method in your MediaLib to show the state of the library
    String movieInfo = "Book: " + storedBook + "\nMovie: " + storedMovie;

    //show the number of books, movies, and songs in the library
    movieInfo += "\nNumber of Books: " + totalBooks;
    movieInfo += "\nNumber of Movies: " + totalMovies;
    movieInfo += "\nNumber of Songs: " + totalSongs;
    movieInfo += "\nLast Modified: " + libraryLastModified;
    return movieInfo;
  }

  public static String getOwner(){

    //return the owner class variable, not a String literal
    return libraryOwner;
  }

  public static void changeOwner(String newOwner){
    //change the owner class variable to the parameter newOwner
    libraryOwner = newOwner;
  }
  public static int getNumEntries(){
    //return the numEntries class variable, not a String literal
    return totalEntries;
  }
  
  public static String lastModifiedDate(){
    Calendar calendarInstance = Calendar.getInstance();
    String dateTimeString = calendarInstance.getTime().toString();
    return dateTimeString;
    }
    //In MediaLib, use your new class and method. Add a variable for the last modified date/time. This should be an instance variable so that each library gets its own date/time. Add a constructor to set the instance variable using your new class and method. Call your new class method to set the date/time whenever a media item is added to it. Modify toString to include the last modified date of the library.

}
