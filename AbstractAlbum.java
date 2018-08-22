import java.util.ArrayList;
        import java.util.List;
public abstract class AbstractAlbum implements Album {

    protected List<Song> songs = new ArrayList<Song>();
private Artist artist;
    public List<Song> getSongs() { return songs; }
    public Song getSong(int id) { return songs.get(id); }
    public void addSong(Song song) {
        song.setAlbum(this);
        this.songs.add(song);
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "AbstractAlbum{" +
                "songs=" + songs +
                ", artist=" + artist +
                '}';
    }
}