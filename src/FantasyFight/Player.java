package FantasyFight;

public class Player {
    private String name;
    private int score;
    private Monster army;

    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public Player createPlayer() {
        return new Player(name);
    }
    public void victory(){
        score++;
    }
    public void getDice(){
    }
}
