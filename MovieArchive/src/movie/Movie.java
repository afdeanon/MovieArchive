package movie;

import java.util.*;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    
    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    @Override
    public int compareTo(Movie other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(this.year, other.year);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return year == movie.year && Objects.equals(title, movie.title);
    }
    
    @Override
    public int hashCode() {
        return title.hashCode() + year;
    }
    
    @Override
    public String toString() {
        return "Movie " + title + " (" + year + ")";
    }
    
    public static Movie[] getTestMovies() {
        Movie[] movies = new Movie[10];
        
        movies[0] = new Movie("The Thomas Crown Affair", 1968);
        movies[1] = new Movie("The Thomas Crown Affair", 1999);
        
        movies[2] = new Movie("The Martian", 2015);
        movies[3] = new Movie("Bridge of Spies", 2015);
        
        movies[4] = new Movie("Inception", 2010);
        movies[5] = new Movie("Inception", 2010);
        
        movies[6] = new Movie("The Shawshank Redemption", 1994);
        movies[7] = new Movie("Pulp Fiction", 1994);
        movies[8] = new Movie("The Dark Knight", 2008);
        movies[9] = new Movie("Forrest Gump", 1994);
        
        return movies;
    }
}
