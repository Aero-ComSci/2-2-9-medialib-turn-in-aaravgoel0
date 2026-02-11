public class Song {

    private String songTitle;
    private double songRating;
    
    public Song(String newTitle){
        this.songTitle = newTitle;
        this.songRating = 0;
    } 
    public String getTitle() {
        return songTitle;
    }
    public double getRating() {
        return songRating;
    }

    //add all the Book methods to the Song class, but change the instance variables to match the Song class. For example, instead of a setAuthor method, you would have a setRating method.
    public String toString() {
        String songInfo = "\"" + songTitle + "\"";
        if (songRating != 0) {
            songInfo += ", rating is " + songRating;
        }
        return songInfo;
        }
    public boolean equals(Song otherSong){
        return this.songTitle.equals(otherSong.songTitle);
    }
    /*** Mutator methods ***/
    public void setTitle(String newTitle) {
        this.songTitle = newTitle;
    }
    public void setRating(double newRating) {
        this.songRating = newRating;
    }
    public double adjustRating(double ratingChange) {
        double updatedRating = songRating + ratingChange;
        if (updatedRating < 0) {
            songRating = 0;
        } else if (updatedRating > 10) {
            songRating = 10;
        } else {
            songRating = updatedRating;
        }
        return songRating;
    }
}
