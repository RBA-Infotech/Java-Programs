package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

	public int compare(Movie m1, Movie m2) {
		return m1.getMovieName().compareTo(m2.getMovieName());
	}
}

class CompareMovieRating implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		if (m1.getMovieRating() == m2.getMovieRating())
			return 0;
		else if (m1.getMovieRating() > m2.getMovieRating())
			return 1;
		else
			return -1;
	}
}

class CompareMovieYear implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		if (m1.getMovieYear() == m2.getMovieYear())
			return 0;
		else if (m1.getMovieYear() > m2.getMovieYear())
			return 1;
		else
			return -1;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Matrix", 4.8, 2008));
		movieList.add(new Movie("Narnia", 4.3, 2004));
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

	}

}
