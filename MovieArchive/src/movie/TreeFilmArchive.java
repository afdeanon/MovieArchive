package movie;
import java.util.*;

public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive {
    @Override
    public ArrayList<Movie> getSorted() {
        return new ArrayList<>(this);
    }
}
