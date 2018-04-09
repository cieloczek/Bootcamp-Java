package game;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    // regex "^(?!.*?(.).*?\\1)[" + SLOWO + "]*[" + SLOWO + "]*$"
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        List<String> words = dictionary.getWords();


        List<String> filterWord = words.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
        Random random=new Random();
        List<String> gameWord = new ArrayList<>();
        String randomWord="";
        List<String> preGameWord;
        do
        {
            String randomWordTemp=filterWord.get(random.nextInt(filterWord.size()));
            List<String> gameWordTemp = new ArrayList<>();
            preGameWord = words.stream().
                    filter(s -> s.matches("^(?!.*?(.).*?\\1)[" + randomWordTemp + "]*[" + randomWordTemp + "]*$")).collect(Collectors.toList());
            if(preGameWord.size()<5){
                continue;
            }
            randomWord=randomWordTemp;
            for (int i = 0; i < 5; i++) {
                gameWordTemp.add(preGameWord.remove(random.nextInt(preGameWord.size())));
            }
            gameWord=gameWordTemp;
        }while(gameWord.size()<5);

        List<Character> randomLetter = new ArrayList<>();//Arrays.asList(randomWord.toCharArray());
        for (int i = 0; i < randomWord.length(); i++) {
            randomLetter.add(randomWord.toCharArray()[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            Character tempChar = randomLetter.get(random.nextInt(randomLetter.size()));
            sb.append(tempChar).append(" ");
            randomLetter.remove(tempChar);
        }
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(sb.toString());
            for (int i = 0; i < gameWord.size(); i++) {
                for (int j = 0; j < gameWord.get(i).length(); j++) {
                    System.out.print(" _ ");
                }
                System.out.println();
            }
            System.out.println(">>");

            String input = scanner.nextLine();

            if(gameWord.contains(input)) {
                gameWord.remove(input);
            }

            if(gameWord.size()==0){
                System.out.println("Wygrałeś!!!!!!!");
                break;
            }


        }

    }
}