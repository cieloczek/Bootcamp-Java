package FantasyFight;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int numOfDices;
    private int diceType;
    private String dice;

    public Dice(String dice) {
        this.dice = dice;
        String[] temp = dice.split("k");
        this.numOfDices = Integer.parseInt(temp[0]);
        this.diceType = Integer.parseInt(temp[1]);
    }
    public int roll(){
        int result;
        int cumulatedResult = 0;
        // System.out.println(dice + " rolled");
        for (int i = 0; i <numOfDices ; i++)
        {
            result = ThreadLocalRandom.current().nextInt(diceType);
            //   System.out.println(i+1 + " roll result :" + result);
            cumulatedResult+=result;
        }
        // System.out.println("cumulated damage is: " + cumulatedResult);
        return cumulatedResult;
    }

    public String getDice() {
        return dice;
    }
}
