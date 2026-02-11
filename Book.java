/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String bookTitle;
  private String bookAuthor;
  private int bookRating;
  
  /*** Constructor ****/
  public Book(String newTitle, String newAuthor)
  {
    bookTitle = newTitle;
    bookAuthor = newAuthor;
    bookRating = 0;
    System.out.println("Adding book " + newTitle);
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return bookTitle;
  }

  public String getAuthor() {
    return bookAuthor;
  }
  
  public int getRating() {
    return bookRating;
  }
  
  public String toString() 
  {
    String bookInfo = "\"" + bookTitle + "\", written by " + bookAuthor;
    if (bookRating != 0) 
    { 
      bookInfo += ", rating is " + bookRating;
    }
    return bookInfo;
  }

  public boolean equals(Book otherBook){
      //You Book equals method should use conditional expressions and the String equals method to compare the instance variable title to the parameter b's title. Do the same for the author.
      return this.bookTitle.equals(otherBook.bookTitle) && this.bookAuthor.equals(otherBook.bookAuthor);
  }
  /*** Mutator methods ***/
  public void setTitle(String newTitle) {
    bookTitle = newTitle;
  }

  public void setAuthor(String newAuthor) {
    bookAuthor = newAuthor;
  }

  public int adjustRating(int ratingChange) {
      int updatedRating = bookRating + ratingChange;
      if (updatedRating >= 0 && updatedRating <= 10) {
          bookRating = updatedRating;
      }
      System.out.println("Adjusting rating by " + ratingChange);
      return bookRating;
  }
}
