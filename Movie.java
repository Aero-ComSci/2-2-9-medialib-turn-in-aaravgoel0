public class Movie {
    private String movieTitle;
    private double movieDuration;
    private int movieRating;

    //impelement the same methods as Book class
    public Movie(String newTitle, double newDuration) {
        movieTitle = newTitle;
        movieDuration = newDuration;
        movieRating = 0;
    }
    public String getTitle() {
        return movieTitle;
    }
    public double getDuration() {
        return movieDuration;
    }
    public int getRating() {
        return movieRating;
    }
    public String toString() {
        String movieInfo = "\"" + movieTitle + "\", duration: " + movieDuration + " hours";
        if (movieRating != 0) {
            movieInfo += ", rating is " + movieRating;
        }
        return movieInfo;
    }
    public boolean equals(Movie otherMovie){
        return this.movieTitle.equals(otherMovie.movieTitle);
    }
    /*** Mutator methods ***/
    public void setTitle(String newTitle) {
        movieTitle = newTitle;
    }
    public void setDuration(double newDuration) {
        movieDuration = newDuration;
    }
    public int adjustRating(int ratingChange) {
        movieRating += ratingChange;
        if (movieRating < 0) {
            movieRating = 0;
        }
        if (movieRating > 10) {
            movieRating = 10;
        }
        return movieRating;
    }
}
