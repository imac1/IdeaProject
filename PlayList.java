import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PlayList {
    private final Listener owner;
    private Set<Song> songs= new LinkedHashSet<>();

    public PlayList(Listener owner) {
        this.owner = owner;
    }

    public Listener getOwner() {
        return owner;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void addSongs(Song songs) {
        songs.addPlayListItAppearsOn(this);
        this.songs.add(songs);
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "owner=" + owner +
                ", songs=" + songs +
                '}';
    }
}
