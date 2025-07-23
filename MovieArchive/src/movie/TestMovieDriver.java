package movie;
import java.util.*;

public class TestMovieDriver {
	public static void main(String[] args) {
        System.out.println("=== Movie Film Archive Test ===\n");
        
        // Get test movies
        Movie[] testMovies = Movie.getTestMovies();
        
        System.out.println("Test Movies:");
        for (int i = 0; i < testMovies.length; i++) {
            System.out.println(i + ": " + testMovies[i]);
        }
        
        System.out.println("\n=== Testing ListFilmArchive ===");
        testFilmArchive(new ListFilmArchive(), testMovies);
        
        System.out.println("\n=== Testing HashFilmArchive ===");
        testFilmArchive(new HashFilmArchive(), testMovies);
        
        System.out.println("\n=== Testing TreeFilmArchive ===");
        testFilmArchive(new TreeFilmArchive(), testMovies);
    }
    
    private static void testFilmArchive(FilmArchive archive, Movie[] movies) {
        System.out.println("Archive type: " + archive.getClass().getSimpleName());
        
        for (Movie movie : movies) {
            boolean added = archive.add(movie);
            System.out.println("Adding " + movie + " -> " + added);
        }
        
        ArrayList<Movie> sorted = archive.getSorted();
        System.out.println("\nSorted movies (" + sorted.size() + " unique):");
        for (Movie movie : sorted) {
            System.out.println("  " + movie);
        }
        
        System.out.println("\nTesting duplicate addition:");
        boolean duplicateAdded = archive.add(movies[0]);
        System.out.println("Adding duplicate " + movies[0] + " -> " + duplicateAdded);
    }
}
