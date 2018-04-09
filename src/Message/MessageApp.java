package Message;

import java.util.ArrayList;

public class MessageApp {
    public static void main(String[] args) {
        DictionaryMessage dict = new DictionaryMessage();
        DictionaryMessage abc = new DictionaryMessage(new String[]{"Chleb", "z", "masłeeeeeeeeEEEeem"});
        RandomMessage random = new RandomMessage(10,0);
        RandomMessage bigRandom = new RandomMessage(1000,-1000);
            Message[] messages = {
                    dict,
                    abc,
                    bigRandom,
                    random
            };
printMsg(messages);
    }
    public static void printMsg(Message[] msg){
        for (int i = 0; i < msg.length; i++) {
            System.out.println("Message [" +i+"] = " + msg[i].printMessage());

        }
    }
}
