package movie;

import java.util.*;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {
    
    @Override
    public boolean add(Movie movie) {
        for (Movie existingMovie : this) {
            if (existingMovie.equals(movie)) {
                return false;
            }
        }
        boolean reallyAdded = super.add(movie);
        return reallyAdded;
    }
    
    @Override
    public ArrayList<Movie> getSorted() {
        TreeSet<Movie> sortedSet = new TreeSet<>(this);
        return new ArrayList<>(sortedSet);
    }
}