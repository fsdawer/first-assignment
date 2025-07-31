package day07;

public class Movie1 {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.movieTitle = "f1";

        Movie movie2 = new Movie();
        movie2.movieTitle = "좀비딸";

        Movie movie3 = new Movie();
        movie3.movieTitle = "킹오브킹스";

        Movie[] movieList = new Movie[3];
        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        System.out.println(movieList[0]);
        System.out.println(movieList[1]);
        System.out.println(movieList[2]);

        System.out.println("====================================");

        for(int i = 0; i < movieList.length; i++) {
            System.out.println(movieList[i].movieTitle);
        }

        System.out.println("======================================");

        for (Movie movie : movieList) {
            System.out.println(movie.movieTitle);

        }
    }
}
