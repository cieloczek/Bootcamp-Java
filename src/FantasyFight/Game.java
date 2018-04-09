package FantasyFight;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private static boolean game = true;

    public static void main(String[] args) {

        ArrayList<Monster> goodGuys;
        ArrayList<Monster> badGuys;
        Dice dragon = new Dice("2k12");
        Dice elves = new Dice("2k120");

        goodGuys = generateElvenTeam(20, 10, 40, 1000, elves);
        badGuys = generateDragonsTeam(1000, 8, 150, 2, dragon);
        unitBattle(goodGuys, badGuys);
        //    battle(goodGuys, badGuys);
    }


/*
battle method contains old, simplified and unused mechanism

following methods are directly connected with it.
 */
//public static int computeArmyStrength(ArrayList<Monster> monster) {
//        int cumulDMG = 0;
//        for (int i = 0; i < monster.size(); i++) {
//            cumulDMG += monster.get(i).attackRoll();
//        }
//
//        return cumulDMG;
//    }
//    public static void battle(ArrayList<Monster> goodGuys, ArrayList<Monster> badGuys) {
//        int goodGuysStr = computeArmyStrength(goodGuys);
//        int badGuysStr = computeArmyStrength(badGuys);
//        int tour = ThreadLocalRandom.current().nextInt(3);
//        int numOfKilled = 0;
//        System.out.println(goodGuys.get(0).getName()
//                + " in the number of " + goodGuys.size() + " vs "
//                + badGuys.get(0).getName() + " in the number of " + badGuys.size() + "\n");
//        while (game)
//            if (tour % 2 == 0) {        //goodGuys attack first
//                System.out.println(goodGuys.get(0).getName() + " attack for "
//                        + computeArmyStrength(goodGuys) + " dmg");
//                SomeExtractedMethod(badGuys, goodGuys, goodGuysStr);
//                tour++;
//                System.out.println("\n");
//            } else if (tour % 2 != 0) {
//                System.out.println(badGuys.get(0).getName() + " attack  for "
//                        + computeArmyStrength(badGuys) + " dmg");
//                SomeExtractedMethod(goodGuys, badGuys, badGuysStr);
//                tour++;
//                System.out.println("\n");
//            }
//    }
//
//    private static int dealDamage(ArrayList<Monster> good, ArrayList<Monster> bad) {
//        int hpTaken;
//        return hpTaken = good.get(0).attack() - bad.get(0).defence();
//    }
//private static void SomeExtractedMethod(ArrayList<Monster> goodGuys, ArrayList<Monster> badGuys, int badGuysStr) {
//    int numOfKilled;
//    if (badGuysStr > howMuchToKill(goodGuys)) {
//        numOfKilled = badGuysStr / howMuchToKill(goodGuys);
//        System.out.println(badGuys.get(0).getName() + " army killed " + numOfKilled + " " + goodGuys.get(0).getName());
//        ereaseUnit(badGuys, goodGuys, numOfKilled);
//    } else {
//        System.out.println(badGuys.get(0).getName() + " killed no  " + goodGuys.get(0).getName());
//    }
//}
//    private static ArrayList ereaseUnit(ArrayList<Monster> attackingTeam, ArrayList<Monster> defendingTeam, int num) {
//        if (num >= defendingTeam.size()) {
//            game = false;
//            System.out.println(defendingTeam.get(0).getName() + " has been defeated");
//        } else {
//            for (int i = 0; i < num; i++) {
//                defendingTeam.remove(i);
//            }
//            damageDealtToUnit(attackingTeam, defendingTeam, num);
//        }
//        return defendingTeam;
//    }
//
//    private static ArrayList damageDealtToUnit(ArrayList<Monster> attackingteam, ArrayList<Monster> defendingTeam, int num) {
//        int damage = computeArmyStrength(attackingteam) % num;
//        defendingTeam.get(defendingTeam.size() - 1).isDamaged(damage);
//        System.out.println(defendingTeam.get(0).getName() + " got " + damage + " damage");
//        return defendingTeam;
//    }
//
//    private static int howMuchToKill(ArrayList<Monster> monster) {
//        int howMuchToKill = monster.get(0).defence() + monster.get(0).getHealth();
//        return howMuchToKill;
//    }
//private static boolean isAlive(int hp, int dmg) {
//        if (dmg > hp) {
//            return false;
//        } else {
//            return true;
//        }
//    }
    private static void unitBattle(ArrayList<Monster> good, ArrayList<Monster> bad) {
        int tour = ThreadLocalRandom.current().nextInt(2);
        while (game) {
            if (tour % 2 == 0) {
                fight(good, bad);
                tour++;
            } else {
                fight(bad, good);
                tour++;
            }
        }
    }

    private static void fight(ArrayList<Monster> attacking, ArrayList<Monster> defending) {
        int hpLeft;
        if (defending.size() > attacking.size()) {
            for (int i = 0; i < attacking.size(); i++) {
                hpLeft = (defending.get(i).getCurrentHealth() - damageDealt(attacking, defending, 1));
                if (hpLeft > 0) {
                    defending.get(i).setCurrentHealth(hpLeft);
                } else {
                    defending.remove(i);
                    System.out.println(defending.get(i).getName() + " killed");
                }
            }
        } else {               //zakladamy, ze jesli mamy duzą przewage, wrog atakuje proporcjonalnie
            int proportion = proportion(attacking, defending);
            for (int i = 0; i < defending.size(); i++) {//tu tez
                hpLeft = (defending.get(i).getCurrentHealth() - damageDealt(attacking, defending, proportion));
                checkUnitHP(defending, i, hpLeft);

            }
            if (game) {// sprawdzic czy ponizszy blok ma sens
                for (int i = 0; i < attacking.size() % defending.size(); i++) {
                    hpLeft = (defending.get(i).getCurrentHealth() - damageDealt(attacking, defending, 1));  // cos tu bardzo nie dziala
                    checkUnitHP(defending, i, hpLeft);
                }
            }
        }
    }

    private static void checkUnitHP(ArrayList<Monster> defending, int index, int hpLeft) {
       String name = defending.get(index).getName();
        if (hpLeft > 0) {
            defending.get(index).setCurrentHealth(hpLeft);
            System.out.println(defending.get(index).getCurrentHealth());
        } else {
            defending.remove(index);
            if (!gameOver(defending)) {
                System.out.println(name+ " killed ");
            } else {
                System.out.println(name+ " killed ");
                System.out.println("Game over");
                gameOver(defending);
            }
        }
    }

    private static boolean gameOver(ArrayList<Monster> def) {
        if (def.size() == 0) {
            game = false;
            return true;
        } else {
            return false;
        }
    }

    private static int proportion(ArrayList<Monster> attacking, ArrayList<Monster> defending) {
        double prop = attacking.size() / defending.size();
        if (prop <= 0) {
            return 1;
        } else {
            return (int) Math.round(prop);
        }
    }

    private static int damageDealt(ArrayList<Monster> attacking, ArrayList<Monster> defending, int proportion) {
        int attack;
        int def = defending.get((defending.size() - 1)).defence();
        int realDmg = 0;
        int tempDmg ;
        for (int i = 0; i < proportion; i++) {              // dlaczego dla i=1 wykona sie 2 razy?
            attack = attacking.get(attacking.size() - 1).attackRoll();
            tempDmg = attack - def;
            tempDmg = (tempDmg > 0) ? tempDmg : 0;
            realDmg += tempDmg;
        }
        return realDmg;
    }

    private static ArrayList generateDragonsTeam(int hp, int def, int attack, int numberOf, Dice dice) {
        ArrayList<Monster> team = new ArrayList<>();
        for (int i = 0; i < numberOf; i++) {
            team.add(new RedDragon(hp, def, attack, dice));
        }
        return team;
    }

    private static ArrayList generateElvenTeam(int hp, int def, int attack, int numberOf, Dice dice) {
        ArrayList<Monster> team = new ArrayList<>();
        for (int i = 0; i < numberOf; i++) {
            team.add(new Elf(hp, def, attack, dice));
        }
        return team;            //todo sprawdzic dlaczego wygrac moze tylko jeden team
    }
                                                        // Poprawic komunikaty!!!!
}
// Jeden generator dla różnych jednostek + bardziej złożone wprowadzone z ręki
//stworzyć klasę umozliwiającą utworzenie nowej armii z konsoli
// pomyśleć nad dodaniem różnorodnych ataków
// walka z konsoli


// moooze dokonczyc
//         kalendarz tez
//                 ii poprawic pod wzgledem local day, cokolwiek to znaczy