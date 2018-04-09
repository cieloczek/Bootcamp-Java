package films;

import java.util.*;

public class MoviesService {
    private List<Actors>actors;
    private List<Movie>movies;
    private Map<Movie, List<Actors>> roles;


    public MoviesService(){
        this(new ArrayList<>(), new ArrayList<>());
     }
public MoviesService(List<Actors> actors, List<Movie> movies) {
    this(actors, movies, new HashMap<>());
}

    public MoviesService(List<Actors> actors, List<Movie> movies,Map<Movie, List<Actors>> roles) {
        this.actors = actors;
        this.movies = movies;
        this.roles=roles;
    }

    public List<Actors>findActors(){
        return new ArrayList<>(actors);
    }

    public List<Movie> findMovie() {
        return new ArrayList<>(movies);

    }
    public Actors findActor(int actorId){
    return actors.get(actorId);
    }

    public List<Movie> findMovie(Actors actor) {
        List<Movie> tempMov = new ArrayList<>();
        Set<Map.Entry<Movie, List<Actors>>> entries = roles.entrySet();
        for (Map.Entry<Movie, List<Actors>> entry : entries) {
           List<Actors> actorsInMovie =  entry.getValue();
            if (actorsInMovie.contains(actor)) {
                tempMov.add(entry.getKey());
            }
        }
        return tempMov;
    }
}
