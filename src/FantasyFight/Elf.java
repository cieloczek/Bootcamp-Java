package FantasyFight;

public class Elf implements Monster {
    private String name = "Elven hoes";
    private int basicHealth;
    private int currentHealth;
    private int basicDefence;
    private int basicAttack;
    private Dice dice;

    public Elf(int basicHealth, int basicDefence, int basicAttack, Dice dice) {
        this.basicHealth = basicHealth;
        this.basicDefence = basicDefence;
        this.basicAttack = basicAttack;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }
    @Override
    public int defence() {
        return basicDefence;
    }
    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }
    @Override
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    @Override
    public int attackRoll(){
        return dice.roll();
    }
    public void run(){
        System.out.println("Elven army runs away, like anyone cares.");
    }
    @Override
    public String toString() {
        return "Elven archer statistics :" +"\n"+
                "name= '" + name + "\n" +
                ", basicAttack=" + basicAttack +"\n"+
                ", basicArmor=" + basicDefence +"\n"+
                ", basicHealth=" + basicHealth +"\n"+
                ", dice=" + dice;
    }

    public void getDice() {
        System.out.println(dice.getDice());
    }
}
