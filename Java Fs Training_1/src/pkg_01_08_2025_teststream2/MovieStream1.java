package pkg_01_08_2025_teststream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MovieStream1 {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Ek Tha Tiger", 2012, "Salman Khan", "Katrina Kaif"),
                new Movie("Dilwale Dulhania Le Jayenge", 1995, "Shah Rukh Khan", "Kajol"),
                new Movie("Kabhi Khushi Kabhie Gham", 2001, "Shah Rukh Khan", "Kajol"),
                new Movie("3 Idiots", 2009, "Aamir Khan", "Kareena Kapoor"),
                new Movie("Zindagi Na Milegi Dobara", 2011, "Hrithik Roshan", "Katrina Kaif")
        );

        // Filter movies released in the year 2009
        Stream<Movie> filteredMovies = movies.stream()
                                             .filter(movie -> movie.getYear() == 2009);

        // Print the filtered movies
        filteredMovies.forEach(System.out::println);
    }
}
