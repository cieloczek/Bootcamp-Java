package PokerHand;

public class Main {
    public static void main(String[] args) {
        PokerHand royalFlush = new PokerHand("AD KD QD JD TD");
        PokerHand straightFlush = new PokerHand("8D 7D 6D 5D 4D");
//        PokerHand fourOfKind = new PokerHand("8D 8S 8H 8C 4D");
//        PokerHand fullHouse = new PokerHand("8D 8S 8H 4C 4D");
//        PokerHand flush = new PokerHand("4S JS 8S 2S 9S");
        PokerHand straight = new PokerHand("9D 8S 7H 6C 5D");
//        PokerHand threeOfKind = new PokerHand("8D 8S 8H 4C QD");
        PokerHand twoPairs = new PokerHand("8D 8S 4H 4C AD");
           PokerHand pair = new PokerHand("8D 8S 7H 5C AD");
//        PokerHand highCard = new PokerHand("KD 8S 7H 6C 4D");
//        PokerHand firstHand = new PokerHand("KS 2H 5C JD TD");
//        PokerHand secondHand = new PokerHand("KS KH 5C JD TD");
//        PokerHand thirdHand = new PokerHand("KS KH QC QD TD");
//        PokerHand fourthHand = new PokerHand("AS AH JC JD TD");
        System.out.println(royalFlush.compare(straightFlush));
        straight.isStraight(straight);
    }
}

