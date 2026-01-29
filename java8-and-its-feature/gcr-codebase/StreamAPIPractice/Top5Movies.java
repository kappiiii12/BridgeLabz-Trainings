package StreamAPIPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Movie{
	 private String movieName;
	 private String movieRating;
	 private String releaseYear ;
	 
	 public Movie(String movieName,String movieRating,String releaseYear) {
		 this.movieName = movieName ;
		 this.movieRating = movieRating ;
		 this.releaseYear = releaseYear ;
	 }
	 
	 public void displayMovie() {
		 System.out.println("Movie Name : "+this.movieName);
		 System.out.println("Movie Rating : "+this.movieRating);
		 System.out.println("Release Year : "+this.releaseYear);
		 
	 }
	 public String getMovieName() {
		 return this.movieName;
	 }
	 public String getMovieRating() {
		 return this.movieRating;
		 
	 }
	 public String getMovieReleaseYear() {
		 return this.releaseYear;
	 }
 }
public class Top5Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Movie m1 = new Movie("Dhurandhar","8","2025");
       Movie m2 = new Movie("Tere Ishq main","6","2025");
       Movie m3 = new Movie("3 Idiots","9.5","2011");
       Movie m4 = new Movie("Dangal","9","2017");
       Movie m5 = new Movie("Avengers End Game","10","2020");
       Movie m6 = new Movie("Oye Lucky Lucky Oye","6.5","2009");
       Movie m7 = new Movie("Karthik Calling Karthik","5","2015");
       Movie m8 = new Movie("Zindagi Na Milegi Dobara","10","2016");
       
       List<Movie> arr = new ArrayList<>(Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8));
       
      
	  
	   List<Movie> res = (List<Movie>) arr.stream()
    		                              .sorted((o1,o2) -> {
    		                            	double r1 = Double.parseDouble(o1.getMovieRating());
    		                            	double r2 = Double.parseDouble(o2.getMovieRating());
    		                                if(r1 != r2)
    		                                	return Double.compare(r2,r1);
    		                                int yearCompare = o2.getMovieReleaseYear().compareTo(o1.getMovieReleaseYear());
    		                                		if(yearCompare!=0)
    		                                		return yearCompare;
    		                                return o2.getMovieName().compareTo(o1.getMovieName());
    		                              })
    		                              .limit(5)
    		                              .toList();
	   System.out.println("_________________Top 5 Movies______________");
	   for(Movie x : res) {
		  
		   x.displayMovie();
		   System.out.println("-------_______---------________--------");
	   }
	}

}
