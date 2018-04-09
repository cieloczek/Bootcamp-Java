package FantasyFight;

public class RedDragon implements Monster{
   private String name = "Red Dragon";
   private int basicAttack;
   private int basicArmor;
   private int basicHealth;
   private int currentHealth=1200;
   private Dice dice;
   private int attnumb;

    public RedDragon(int basicAttack, int basicArmor, int basicHealth, Dice dice) {
        this.basicAttack = basicAttack;
        this.basicArmor = basicArmor;
        this.basicHealth = basicHealth;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }
    public void getDice() {
        dice.getDice();
    }

//    @Override
//    public void isDamaged(int health) {
//        this.basicHealth =- health;
//    }
//
//    @Override
//    public int attacksInTour() {
//        return attnumb;
//    }

    @Override
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth=currentHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

//    @Override
//    public int attack(){
//        return basicAttack;
//    }

    @Override
    public int defence() {
        return basicArmor;
    }

//    @Override
//    public int getHealth() {
//        return basicHealth;
//    }

    @Override
    public int attackRoll(){
        return dice.roll();
    }

    @Override
    public String toString() {
        return "RedDragon statistics :" +"\n"+
                "name= '" + name + "\n" +
                ", basicAttack=" + basicAttack +"\n"+
                ", basicArmor=" + basicArmor +"\n"+
                ", basicHealth=" + basicHealth +"\n"+
                ", dice=" + dice;
    }
}
