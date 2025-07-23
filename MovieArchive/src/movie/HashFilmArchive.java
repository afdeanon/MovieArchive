package movie;
import java.util.*;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {
    @Override
    public ArrayList<Movie> getSorted() {
        TreeSet<Movie> sortedSet = new TreeSet<>(this);
        return new ArrayList<>(sortedSet);
    }
}