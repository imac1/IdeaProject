import java.util.List;

public class StandardAlbum extends AbstractAlbum {
private String albumName;
private static final String RELEASE_TYPE = "Standard Album";

//    public String getAlbumName() {
//        return albumName;
//    }
//
//    public void setAlbumName(String albumName) {
//        this.albumName = albumName;
//    }

    public List<Song> getSongs() {
        return songs;
    }
    public void addSong(Song song) {

    }

    @Override
    public String toString() {
        return "StandardAlbum{" +
                "albumName='" + albumName + '\'' +
                ", songs=" + songs +
                '}';
    }
}


