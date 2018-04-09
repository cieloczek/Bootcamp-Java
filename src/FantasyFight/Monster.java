package FantasyFight;

public interface Monster {
    int defence();
    int attackRoll();
    String getName();
    void setCurrentHealth(int currentHealth);
    int getCurrentHealth();
    void getDice();
}
