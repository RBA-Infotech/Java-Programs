package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {

	private String movieName;
	private double movieRating;
	private int movieYear;

	public Movie(String movieName, double movieRating, int movieYear) {
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.movieYear = movieYear;
	}

	// getter method
	public String getMovieName() {
		return movieName;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public int getMovieYear() {
		return movieYear;
	}

}

class CompareMovieName implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) { // b , a - 97, 96 Narnia - 78, Matrix - 77, The Karete Kid - 84
		return m1.getMovieName().compareTo(m2.getMovieName());
	}
}

class CompareMovieRating implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		return Double.compare(m1.getMovieRating(), m2.getMovieRating());
	}
}

class CompareMovieYear implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		//return m1.getMovieYear() - m2.getMovieYear();
		return Integer.compare(m1.getMovieYear(), m2.getMovieYear());
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Movie> movieList = new ArrayList<>();
		// List<Movie> movieList1 = new ArrayList<Movie>();
//		Movie m1 = new Movie("Matrix", 4.8, 2008);
//		movieList.add(m1);

		movieList.add(new Movie("Narnia", 5.0, 2004)); //annonymys object
		movieList.add(new Movie("Matrix", 4.8, 2008));
		movieList.add(new Movie("The Karate Kid", 4.9, 2000));

		CompareMovieName compareMovieName = new CompareMovieName();
		Collections.sort(movieList, compareMovieName);

		System.out.println("\nSorting By Movie Name");
		for (Movie movie : movieList) {
			System.out.println(movie.getMovieName() + " " + movie.getMovieRating() + " " + movie.getMovieYear());
		}

		CompareMovieRating compareMovieRating = new CompareMovieRating();
		Collections.sort(movieList, compareMovieRating);

		System.out.println("\nSorting By Movie Rating");
		for (Movie movie : movieList) {
			System.out.println(movie.getMovieName() + " " + movie.getMovieRating() + " " + movie.getMovieYear());
		}

		CompareMovieYear compareMovieYear = new CompareMovieYear();
		Collections.sort(movieList, compareMovieYear);

		System.out.println("\nSorting By Movie Year");
		for (Movie movie : movieList) {
			System.out.println(movie.getMovieName() + " " + movie.getMovieRating() + " " + movie.getMovieYear());
		}

		Comparator<Movie> movieYearInDescending = Comparator.comparingInt(m -> m.getMovieYear());
		movieList.sort(movieYearInDescending.reversed());

		System.out.println("\nSorting By Movie Year in Descending Order");
		for (Movie movie : movieList) {
			System.out.println(movie.getMovieName() + " " + movie.getMovieRating() + " " + movie.getMovieYear());
		}
		
		Comparator<Movie> movieNameInDescending = Comparator.comparing(m -> m.getMovieName());
		movieList.sort(movieNameInDescending.reversed());

		System.out.println("\nSorting By Movie Year in Reverse Order");
		for (Movie movie : movieList) {
			System.out.println(movie.getMovieName() + " " + movie.getMovieRating() + " " + movie.getMovieYear());
		}
	}
}
