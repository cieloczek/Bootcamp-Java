package callendar;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CallendarApp {

    static Scanner sc = new Scanner(System.in);
    static List<CallendarMonth> months = new ArrayList<CallendarMonth>();
    static CallendarMonth Jan = CallendarMonth.callendarMonth();
    static CallendarMonth year[] = CallendarMonth.createYear(2027, 4);
    public static void main(String[] args) {
        boolean isOn = true;
        int option;
        do {

            printOptions();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    showMonth(sc);
                    break;
                case 2:
                    getMonth(sc);
                    break;
                case 3:
                    isOn = false;
                    break;
                case 4:
                    showYear();
                    break;
            }

        } while(option!=0);
    }
        private static void printOptions() {
            System.out.println("Press : \n 1. To show month"+
                    "\n2. To switch month"+"\n3. To quit"+"\n4. To how whole year");
        }
        private static void switchMonth(Scanner sc){

        }
        private static void showMonth(Scanner sc) {

           int abc;
            do {
                abc = CallendarApp.sc.nextInt();
                sc.nextLine();
                Jan = year[abc];
                System.out.println(Jan);
                System.out.println("Press : \n1. Add note \n2. Show note \n3. Remove note");
                switch (abc) {
                    case 1:
                        addNote(Jan);
                    //    System.out.println(CallendarMonth.);
                        break;
                    case 2:
                        showNote(Jan);
                        break;
                    case 3:
                        removeNote();
                        break;

                    default:
                    abc=0;
                }
            }while(abc!=0);
        }
      private static void addNote(CallendarMonth callendarMonth) {
          System.out.println("Num");
          int dayNum = sc.nextInt();
          sc.nextLine();
          System.out.println("Note");
          String note = sc.nextLine();
          callendarMonth.setNoteForTheDay(dayNum,note);
      }
      private static void showNote(CallendarMonth callendarMonth){
          System.out.println("Number");
          int dayNum = sc.nextInt();
            System.out.println(callendarMonth.getNoteForTheDay(dayNum));
      }
      private static void removeNote(){
          System.out.println("Numer");
          int dayNum = sc.nextInt();


      }
    private static void showYear(){

        for (int i = 0; i < year.length; i++) {
            System.out.println(year[i]);
        }

    }
    private static CallendarMonth getMonth(Scanner sc){
        int num = sc.nextInt();
        return year[num];
    }

}



// dokonczyc!
//!
//!
//!
//!
//
