package PokerHand;

import java.util.Arrays;
import java.util.List;

public class PokerHand {
    private Card first ;
    private Card second ;
    private Card third;
    private Card fourth ;
    private Card fifth;
    private List<Card> hand = Arrays.asList(first,second,third,fourth,fifth);

    public PokerHand(String hand) {
String[] pokerHand = hand.split( " ");
        this.first = new Card(pokerHand[0]);
        this.second = new Card(pokerHand[1]);
        this.third = new Card(pokerHand[2]);
        this.fourth = new Card(pokerHand[3]);
        this.fifth = new Card(pokerHand[4]);
    }
    public int compare(PokerHand hand){                //dokonczyc sprawdzanie reki dla innych ukladow kart
        boolean isColorEqualFIRST = isColorEqual(this);
        boolean isColorEqualSECOND = isColorEqual(hand);
        boolean isStraightFIRST = isStraight(this);
        boolean isStraightSECOND = isStraight(hand);
        if(isColorEqualFIRST==isColorEqualSECOND){
            if(isStraightFIRST==isStraightSECOND){
                return Integer.compare(highestCard(this), highestCard(hand));
            }else if(isStraightFIRST){
                return 1;
            }else if(isStraightSECOND) {
                return 2;
            }else{
                return compareLesserCompositions(hand);
            }


        }




        return 0;
    }

    private int compareLesserCompositions(PokerHand hand) {
        return 0;
    }


    public int highestCard(PokerHand hand) {
        int[] cardValues = {
                hand.first.getValue(),
                hand.second.getValue(),
                hand.third.getValue(),
                hand.fourth.getValue(),
                hand.fifth.getValue()
        };
        Arrays.sort(cardValues);
        return cardValues[0];
    }
    public boolean isStraight(PokerHand hand) {
        int[] cardValues = {
                hand.first.getValue(),
                hand.second.getValue(),
                hand.third.getValue(),
                hand.fourth.getValue(),
                hand.fifth.getValue()
                };
        Arrays.sort(cardValues);
        for (int i = 1; i <cardValues.length; i++) {
           if(cardValues[0]!=cardValues[i]-i){
             return false;
            }
        }

        return true;
    }


    private boolean isColorEqual(PokerHand hand){
    return hand.first.getColor().equals(hand.second.getColor())
        && hand.second.getColor().equals(hand.third.getColor())
        && hand.third.getColor().equals(hand.fourth.getColor())
        && hand.fourth.getColor().equals(hand.fifth.getColor());
    }
}
