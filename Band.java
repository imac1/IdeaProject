import java.util.ArrayList;
import java.util.List;
public abstract class Band extends AbstractArtist {
   private String name;
   public static final String ARTIST_TYPE = "Band";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                '}';
    }
}


