import java.util.ArrayList;
import java.util.List;

public abstract class SingleArtist extends AbstractArtist {

    private String name;
    public static final String ARTIST_TYPE = "Single Artist";

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static String getArtistType() {
        return ARTIST_TYPE;
    }

    @Override
    public String toString() {
        return "SingleArtist{" +
                "name='" + name + '\'' +
                '}';
    }
}
