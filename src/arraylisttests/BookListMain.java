
package arraylisttests;


import static arraylisttests.Library.books;
import java.util.Scanner;

public class BookListMain {

    static Scanner sc = new Scanner(System.in);
    static boolean goOn = true;
    
    /*static Book book1 = new Book ("Java", "Mimmi");
    static Book book2 = new Book ("Hemma", "Magda");
    static Book book3 = new Book ("Solen", "Anna");*/
    
   
    
    
    public static void main(String[] args) {
        // for testing, add books and find book using it's name
       /* Library.books.add(book1);
        Library.books.add(book2);
        Library.books.add(book3);
        System.out.println("Enter namer for Book:");
        String bookName = sc.nextLine();
        
        for (int i = 0; i <3 ; i++) {

            if (Library.books.get(i).getName().equalsIgnoreCase(bookName)) {
                
                System.out.println(books.get(i).getName());
                System.out.println(i);
            }
        }*/
               
        do{
        choicesInMenu(menu());
        } while (goOn);
        //Library.addBook();
        //Library.showAllBooks();

    }

    public static void choicesInMenu(int val) {
        

            switch (val) {
                case 1:
                    Library.addBook();
                    break;
                case 2:
                   Library.removeBookById();
                    break;
                case 3:
                    Library.removeBookByName();
                    break;
                case 4:
                    Library.showBookById();
                    break;
                case 5:
                    Library.showAllBooks();
                    break;
                case 6:
                    Library.updateBookName();
                    break;

                case 7:
                     System.out.println("Antal böcker i biblioteket är: " + books.size());
                    break;
                case 0:
                    System.out.println("Tack och välkommen åter");
                    goOn = false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }      
    }

    public static int menu() {
        
        System.out.println("\n\n1. Add book: ");
        System.out.println("2. Remove book by id: ");
        System.out.println("3. Remove book by name: ");
        System.out.println("4. Show book by id: ");
        System.out.println("5. Show all books: ");
        System.out.println("6. Update book name: ");
        System.out.println("7. NumberOfBooksInLibrary");
        System.out.println("0. Exit");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;        
    }
}
