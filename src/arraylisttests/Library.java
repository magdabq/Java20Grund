
package arraylisttests;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    
    static ArrayList <Book> books = new ArrayList <Book> ();
    static Scanner sc = new Scanner (System.in);   
    
    static public void addBook(){
        System.out.println("Enter book name: ");
            String name = sc.nextLine();
        System.out.println("Enter book author: ");
           String author= sc.nextLine();   
            
         Book book = new Book(name, author);
         books.add(book);
        System.out.println("Book cretated"); 
        //System.out.println(books.get(0));
        //System.out.println(name + " " + author);
    }
   
     static public void removeBookById() {
        System.out.println("Enter book Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = books.size() - 1; i >= 0; i--) {

            if (books.get(i).getId() == id) {
                books.remove(books.get(i));
                //System.out.println("Book " + books.get(i-1) + " is deleted. ");
            }

        }
    }
    
    static public void removeBookByName() {
        System.out.println("Enter book name: ");
        String name = sc.nextLine();

        for (int i = books.size() - 1; i >= 0; i--) {

            if (books.get(i).getName().equalsIgnoreCase(name)) {
                books.remove(books.get(i));
                //System.out.println("Book " + books.get(i-1) + " is deleted. ");
            }

        }
    }

    
    static public void showBookById(){
        System.out.println("Enter book id: ");
        int id = sc.nextInt();
            sc.nextLine();
        
        for (Book book : books) {
            if(book.getId()== id){               
                
                System.out.println(book.getName());
        
            }      
        }
    }
    
    static public void showAllBooks(){
        System.out.println(books);         
    }
    
    static public void updateBookName() {
        System.out.println("Enter book ID to change name; ");
            int id = sc.nextInt();
                sc.nextLine();
                
        for (Book book : books) {
            if(book.getId()== id){
                
                System.out.println("Enter new name for book :");
                String newName = sc.nextLine();
                book.setName(newName);
                System.out.println("BookName is updated.");
                
            }
            
        }
    }
    
   
    static public void numberOfBooks(){
        System.out.println("Antal böcker i biblioteket är: " + books.size()); 
    }
    
}
