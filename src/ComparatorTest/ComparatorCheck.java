package ComparatorTest;

//A Java program to demonstrate Comparator interface
import java.util.*;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
//class Movie 
{
  private double rating;
  private String name;
  private int year;

  // Used to sort Movies by year
  public int compareTo(Movie m)
  {
      return this.year - m.year;
  }

  // Constructor
  public Movie(String nm, double rt, int yr)
  {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name; }
  public int getYear()      {  return year;  }
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
  public int compare(Movie m1, Movie m2)
  {
      if (m1.getRating() < m2.getRating()) return -1;
      if (m1.getRating() > m2.getRating()) return 1;
      else return 0;
  }
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
  public int compare(Movie m1, Movie m2)
  {
      return m1.getName().compareTo(m2.getName());
  }
}

//Driver class
public class ComparatorCheck
{
  public static void main(String[] args)
  {
      ArrayList<Movie> list = new ArrayList<Movie>();
      list.add(new Movie("Force Awakens", 8.6, 2015));
      list.add(new Movie("Force Awakens", 8.3, 2015));
      list.add(new Movie("Force Awakens", 8.5, 2015));
      list.add(new Movie("Star Wars", 8.7, 1977));
      list.add(new Movie("Empire Strikes Back", 8.8, 1980));
      list.add(new Movie("Return of the Jedi", 8.4, 1983));

      // Sort by rating : (1) Create an object of ratingCompare
      //                  (2) Call Collections.sort
      //                  (3) Print Sorted list
      System.out.println("Sorted by rating");
      RatingCompare ratingCompare = new RatingCompare();
      Collections.sort(list, ratingCompare);
      for (Movie Movie: list)
          System.out.println(Movie.getRating() + " " +
                             Movie.getName() + " " +
                             Movie.getYear());


      // Call overloaded sort method with RatingCompare
      // (Same three steps as above)
      System.out.println("\nSorted by name");
      NameCompare nameCompare = new NameCompare();
      Collections.sort(list, nameCompare);
      Collections.sort(list, nameCompare.reversed());
      for (Movie Movie: list)
          System.out.println(Movie.getName() + " " +
                             Movie.getRating() + " " +
                             Movie.getYear());

      // Uses Comparable to sort by year
      System.out.println("\nSorted by year");
      Collections.sort(list);
      for (Movie Movie: list)
          System.out.println(Movie.getYear() + " " +
                             Movie.getRating() + " " +
                             Movie.getName()+" ");
      
      Comparator<Movie> sortNamethenRating = Comparator.comparing(Movie::getName).thenComparingDouble(Movie::getRating);
      Collections.sort(list,sortNamethenRating);
      for (Movie Movie: list)
          System.out.println("sortNamethenRating: " + Movie.getYear() + " " +
                             Movie.getRating() + " " +
                             Movie.getName()+" ");
  }

} 
