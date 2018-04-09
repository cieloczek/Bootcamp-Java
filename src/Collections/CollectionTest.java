package Collections;
import oop.User;
import oop.Book;
import oop.Author;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionTest {
    public static void main(String[] args) {
        Set<User> cos = new HashSet<User>();
//     List<String>   test = new ArrayList<String>();
//     Set<Integer> liczby = new HashSet<>();
//     while(liczby.size()<10){
//         liczby.add(ThreadLocalRandom.current().nextInt(30));
//     }
//        System.out.println("size   "+liczby.size());
//     for(int num : liczby){
//         System.out.println(num);
//     }
//     liczby.add(5);
//        System.out.println("size   "+liczby.size());
//
//
//
//        for(String tekst : "A parallel universe is a hypothetical self-contained reality co-existing with one's own.A specific group of parallel universes are called a multiverse, although this term can also be used to describe the possible parallel universes that constitute reality".split(" ")){
//test.add(tekst);}
//     String longest="";
//        for (int i = 1; i <test.size(); i++) {
//            if(longest.length()<test.get(i).length()){
//                longest=test.get(i);
//            }
//        }
//
//        System.out.println("Longest word in whole array is "+ '"' + longest + '"');
//
        User user = new User("Mat","M","mmm");
        User user2 = new User("A", "B", "C");
        User user3 = new User("A", "B", "C");

//        cos.add(user);
//        cos.add(user2);
//        cos.add(new User("Mat", "M","mmm"));
//        System.out.println(cos.size());
//
//        Map<String, User> mapa = new HashMap<>();
//        mapa.put("abc", user);
//        mapa.put("bcd", user2);
        Scanner sc = new Scanner(System.in);
List<Integer> abc =new ArrayList<>();
abc.add(3);
abc.add(6);
abc.add(1);
abc.add(12);
abc.add(32);
abc.add(22);

randomUniQue(abc);
//selectRandomFromEntered(sc);
usersDB();
myBookShelf();
    }
    public static void randomUniQue(List<Integer> numbers){
        ArrayList<Integer> num = new ArrayList<>(numbers);
        for (int i = 0; i < num.size(); i++) {
           int index= ThreadLocalRandom.current().nextInt(num.size());
            System.out.println(num.remove(index));
        }
    }
    public static void selectRandomFromEntered(Scanner sc) {
        int num;
        int x;

        System.out.println("How many numbers do you want to enter to your list?");

        while (!sc.hasNextInt()) {
            System.out.println("Choose a number");
            sc.nextLine();
        }

        num = sc.nextInt();
        sc.nextLine();
        System.out.println("Number is " + num);
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.println("Enter first number");
            } else if (i == num - 1) {
                System.out.println("Enter last number");
            } else {
                System.out.println("Enter next number");
            }

            while (!sc.hasNextInt()) {
                System.out.println("Choose a number");
                sc.next();
            }

            x = sc.nextInt();
            sc.nextLine();
            lista.add(x);
        }
        Set<Integer> temp = new HashSet<>(lista);
        System.out.println("You inserted : " + lista.toString());
        System.out.println("Deleted " + (lista.size() - temp.size()) + " repeating numbers.");
        System.out.println("Unique numbers extracted from the list are : " + temp);
    }
    public static void usersDB(){
        Map<Integer, User> usersDB = new HashMap<>();
        usersDB.put(12345,new User("A", "Bac", "Bab"));
        usersDB.put(7654,new User("AWGA", "Bac", "Bab"));
        usersDB.put(4567,new User("MAT", "Bac", "Bab"));
        usersDB.put(19877,new User("SA", "Bac", "Bab"));

        Set<Map.Entry<Integer, User>> entries = usersDB.entrySet();
        Iterator<Map.Entry<Integer, User>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, User> next = iterator.next();
            System.out.println(next.getKey() + " : " +next.getValue());
        }


    }
        public static void myBookShelf(){
        Map<Author,List<Book>> booshelf = new HashMap<>();
        booshelf.put(new Author("Jan", "Matejko"), Arrays.asList(
                new Book("Stańczyk", "paperback", 210),
                new Book("Stańczyk", "paperback", 320))
        );
        booshelf.put(new Author("Man", "Matejko"), Arrays.asList(
                    new Book("Stańczyk", "paperback", 110),
                    new Book("Stańczyk", "paperback", 410))
        );
        Set<Map.Entry<Author,List<Book>>> bookshelfSet = booshelf.entrySet();
        for(Map.Entry<Author,List<Book>> authorListEntry : bookshelfSet){
            List<Book> books = authorListEntry.getValue();
            for(Book book : books){
                if(book.getPagesNumber()>250);
                System.out.println(book);
                }
            }
        }
}



