package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
   static ArrayList<Author> authorList = new ArrayList<>();
    static ArrayList<Book> bookShelf = new ArrayList<>();
    public static void main(String[] args) {
        //addAuthor();
       // addAuthor();
//        addAuthor();
//      printAuthorList();
//
        Author test = new Author ("test", "test");
        authorList.add(test);
        String type = "Alakazam abababa";
        addBook();
        authorCheck(type);
        printAuthorList();

    }
private static void addAuthor(){
    System.out.println("Enter author first name");
    String name = sc.next();
    sc.nextLine();
    System.out.println("Enter author last name");
    String lastName=sc.next();
    Author author = new Author(name, lastName);
    authorList.add(author);
    }


private static void printAuthorList(){
    System.out.println("Authors already on the list : " + authorList.size());
    for (int i = 0; i < authorList.size(); i++) {
        System.out.println(authorList.get(i).toString());
    }
}
private static Author authorCheck(String aor){
    String[] check = aor.split(" ");
   String name = check[0];
   String lastN = check[1];
    System.out.println(name + " " + lastN);
    for (int i = 0; i < authorList.size(); i++) {
        if (name.equals(authorList.get(i).getFirstName())) {
            if (lastN.equals(authorList.get(i).getLastName())) {
                System.out.println("Author already on the list");
                return authorList.get(i);
            }
        }
    }
        System.out.println("Added new author to the autor list");
    Author author = new Author(name, lastN);
    authorList.add(author);
return author;
}

private static void addBook(){
    System.out.println("Enter book name");
    String name =getString();
    System.out.println("Enter short plot description");
    String description =getString();
    System.out.println("Is it hardcover or paperback?");
    String cover = getString();
    System.out.println("Who wrote it ?");
    printAuthorList();
    String bothNames= getString();
    Author author = authorCheck(bothNames);
    System.out.println("How many pages does it have?");
    int pages = sc.nextInt();
    Book book = new Book(name,description,cover,pages, author);
    bookShelf.add(book);
}
private static String getString(){
        String abrakadabra = sc.nextLine();
        return abrakadabra;
}
private static Book findBook(){
        String name = getString();
    for (int i = 0; i <bookShelf.size() ; i++) {
        if(bookShelf.get(i).getTitle().equals(name)){
            return bookShelf.get(i);
        }

    }
    return null;
}
private static Author findAuthor(){
    String[] check = getString().split(" ");
    String name = check[0];
    String lastN = check[1];
    System.out.println(name + " " + lastN);
    for (int i = 0; i < authorList.size(); i++) {
        if (name.equals(authorList.get(i).getFirstName())) {
            if (lastN.equals(authorList.get(i).getLastName())) {
                return authorList.get(i);
            }
        }
    }
    return null;
}
private static void removeBook(){
    System.out.println("Which book do you want to remove?");
        if(findBook()!=null){
            System.out.println("Book" + findBook().getTitle() + " has been removed from your bookshelf");
            bookShelf.remove(findBook());
        }else{
            System.out.println("This book wasn't on your bookshelf");
        }
}
private static void removeAuthor(){
        if(findAuthor()!=null);
            System.out.println(findAuthor().toString() + "and all his books has been removed");

            authorList.remove(findBook());

}






}

