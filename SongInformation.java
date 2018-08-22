public class SongInformation {
    private String songTitle;
    private int releaseYear;
    private int rating;
    private Author author;

    SongInformation(String songTitle, int releaseYear, int rating, Author author) {
        this.songTitle = songTitle;
        this.releaseYear = releaseYear;
        this.rating = rating;
       this.author = author;
    }

    public SongInformation(Object ana, int releaseYear, int rating, Object d) {

    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void addInformation(SongInformation songInformation){

    }

    @Override
    public String toString() {
        return "SongInformation{" +
                "songTitle='" + songTitle + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", author='" + author + '\'' +
                '}';
    }
}
