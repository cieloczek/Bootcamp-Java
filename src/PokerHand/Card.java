package PokerHand;

public class Card {
    private String nominal;
    private String color;
    private int value;
    public Card(String nominalAndColour) {
        this.nominal = Character.toString(nominalAndColour.charAt(0));
        this.color = Character.toString(nominalAndColour.charAt(1));
        if (this.nominal.matches("[TJQKA]")) {
            switch(nominal){
                case "A":
                    this.value=14;
                    break;
                case "K":
                    this.value=13;
                    break;
                case "Q":
                    this.value=12;
                    break;
                case "J":
                    this.value=11;
                    break;
                case "T":
                    this.value=10;
                    break;
            }
        } else
            this.value = Integer.parseInt(nominal);
    }

    public int getValue() {
        return value;
    }

    public String getNominal() {
        return nominal;
    }

    public String getColor() {
        return color;
    }
}
