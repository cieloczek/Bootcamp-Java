package films;

import java.util.*;

public class MoviesApplication {


    public static void main(String[] args) {
         List<Actors> actors = new ArrayList<>();
         List<Movie> movies = new ArrayList<>();
        Actors c = new Actors("Ryan", "Gosling", "1.1.1990");
        actors.add(c);
        Actors a = new Actors("Ryan", "Reynolds", "1.1.1980");
        actors.add(a);
        Actors b = new Actors("Ryan", "Szeregowiec", "1.1.1960");
        actors.add(b);

        Movie movie1 = new Movie("Titanic", "10.2.1232");
        movies.add(movie1);
        Movie movie2 = new Movie("Matrix", "10.2.2000");
        movies.add(movie2);
        Movie movie3 = new Movie("AvadaKedavra", "10.2.1232");
        movies.add(movie3);


Map<Movie, List<Actors>> roles  = new HashMap<>();
roles.put(movie1, Arrays.asList(a,c));
roles.put(movie2,Arrays.asList(a,b));
roles.put(movie3,Arrays.asList(b,c));




        MoviesService moviesService = new MoviesService(actors, movies,roles);

        Scanner sc = new Scanner(System.in);
        boolean app = true;
        int answer;
        do {
            System.out.println("1. Movies \n 2. Actors \n 3. Exit");
            answer = sc.nextInt();
            switch (answer) {
                case 1:
                    actorsView(sc, moviesService);
                    break;
                case 2:
                    moviesView(sc, moviesService);
                    break;
                case 3:
                    actorInMovies(sc, moviesService);
            }
        } while (answer != 0);
    }

    private static void actorsView(Scanner sc, MoviesService moviesService) {
        List<Actors> actors = moviesService.findActors();
        for (Actors actor : actors) {
            System.out.println(actor);
        }
    }

    private static void moviesView(Scanner sc, MoviesService moviesService) {
        List<Movie> movies = moviesService.findMovie();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public static void actorInMovies(Scanner sc, MoviesService moviesService){  // do poprawy
     //   Actors actor = moviesService.findActor(actorId);
      //  List<Movie> actorMovies = moviesService.findMovie(actor);
      //  System.out.println(actorMovies);
    }

}
