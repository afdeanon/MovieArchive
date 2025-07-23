package movie;
import java.util.ArrayList;

public interface FilmArchive {
	 ArrayList<Movie> getSorted();
	    boolean add(Movie movie);
}
