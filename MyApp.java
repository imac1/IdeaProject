import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyApp {
    public static void main(String[] args) {
        Song song = new Song();
        song.setName("j");

        StandardAlbum standardAlbum = new StandardAlbum();
        standardAlbum.addSong(song);
        SingleArtist singleArtist = new SingleArtist() {
            @Override
            public void setname(String name) {

            }
        };
        singleArtist.setName("Single Artist");
        singleArtist.addAlbum(standardAlbum);
        Listener listener = new Listener();
song.listen(listener);
        listener.addListenedToSong(song);
        Author author1 = new Author("a", 4);
        Author author2 = new Author("b", 2);
        SongInformation songInformation1 = new SongInformation("title1", 1977, 5, author1);
        SongInformation songInformation2 = new SongInformation("title2", 1995, 3, author2);
        song.addInformation(songInformation1);
        song.addInformation(songInformation1);
        Song song1 = new Song();
        song1.setName("title 3");
        SongInformation songInformation3 = new SongInformation("songtitle3", 1966, 4, author1);
        song1.addInformation(songInformation3);
        Set<Author> authors = new HashSet<Author>();
        authors.add(author1);
        authors.add(author2);


      //  System.out.println("1st song" + singleArtist.getAlbums().get(0));
        System.out.println("1st listened song" +listener.getListenedToSong().get(0));
      //System.out.println("How many songs in an album" + song.getAlbum().getSongs().get(0));
        System.out.println("How many listeners / song" + song.getListeners().size());
        System.out.println("How many songs / listener" + listener.getListenedToSong().get(0));
       // System.out.println("Who is the artist of the 1st listened to song" + listener.getListenedToSong().get(0).getAlbum().getArtist());
        System.out.println("Which song is mor popular" + Song.comparePopularity(song1, song));

        Album album1 = new StandardAlbum();
        Album album2 = new StandardAlbum() ;
        System.out.println("Which album is more popular" + Album.comparePopularity(standardAlbum, album2));
 PlayList playList = new PlayList(listener);

 playList.addSongs(song);
 playList.addSongs(song1);
        System.out.println(playList);

    }


}
