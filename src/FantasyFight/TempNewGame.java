//package FantasyStuff;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TempNewGame {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        ArrayList<Player> playerList = new ArrayList<>(2);
//        ArrayList<ArrayList<Monster>> armyList = new ArrayList<>();
//
//        int option;
//
//        createPlyer(playerList,sc);
//        printMenu();
//        option = playerIntegerInput(sc);
//
//        boolean game = true;
//        while(game){
//            switch(option){
//                case 1:
//                 //   showArmies();
//                    break;
//                case 2:
//              //      chooseArmy();
//                    break;
//                case 3:
//                    highScores(playerList);
//                    break;
//                case 4:
//                    //game();
//                    break;
//                case 5:
//                    game=false;
//                    break;
//            }
//        }
//    }
//    private static int playerIntegerInput(Scanner sc){
//        int option;
//        do{
//            System.out.println("Choose a number");
//
//            while (!sc.hasNextInt()){
//                System.out.println("Choose a number");
//                sc.next();
//            }
//            option=sc.nextInt();
//        }while(!sc.hasNextInt());
//        return option;
//    }
//    private static void printMenu(){
//        System.out.println("Choose: \n"+"1. Show available armies"+"\n2. Choose an army \n3. Check score"+
//        "\n4. Play \n5. Quit");
//    }
//
//    private static ArrayList createPlyer(ArrayList<Player> list, Scanner sc){
//        for (int i = 0; i <2 ; i++) {
//            System.out.println("Enter player name");
//            String name = sc.nextLine();
//            list.add(new Player(name));
//        }
//        return list;
//    }
//
//    private static void highScores(ArrayList<Player> list){
//        for (Player player: list) {
//            System.out.println(player.getName() + " score is " +player.getScore());         // LOOP IS INFINITE, WHY?!
//        }
//    }
//    private static ArrayList<Monster> armyGenerator(ArrayList<Monster>team){
//        System.out.println("Choose from: \n1. Gay Elves \n2. Not gay dragons");
//        int option;
//        do{
//            System.out.println("Choose a number");
//
//            while (!sc.hasNextInt()){
//                System.out.println("Choose a number");
//                sc.next();
//            }
//            option=sc.nextInt();
//        }while(option!=1 || option!=2);
//        switch(option){
//            case 1:
//                ArrayList<Monster> team1 = new ArrayList<>();
//                for (int i = 0; i < 140; i++) {
//                    team.add(new GayElfArcher(10, 15, 35, elvenDice));
//                }
//                break;
//            case 2:
//                ArrayList<Monster> team2 = new ArrayList<>();
//                for (int i = 0; i < 140; i++) {
//                    team.add(new RedDragon(150, 210, 3500, elvenDice));
//                }
//                break;
//
//    }
//    }
//}

//stworzyc od nowa calego RPGa w noqym projekcie
