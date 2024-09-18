import java.util.*;

public class ComparableInt {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("mayank",1997));
        movies.add(new Movie("nagraj",1993));
        movies.add(new Movie("tttttt",2000));
        movies.forEach(System.out::println);


//        Collections.sort(movies);

        System.out.println("Movies after sorting : ");
        for (Movie movie: movies)
        {
            System.out.println(movie.getName() + " " +
                    movie.getYear());
        }
    }
}

//class Movie implements Comparable<Movie>{
//    String name;
//    Integer year;
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "name='" + name + '\'' +
//                ", year=" + year +
//                '}';
//    }
//
//    public Movie(String name, Integer year) {
//        this.name = name;
//        this.year = year;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    @Override
//    public int compareTo(Movie o) {
//        return this.year-o.year;
//    }
//}

class Movie implements Comparator<Movie>{

    String name;
    Integer year;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public Movie(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.year - o2.year;
    }
}
