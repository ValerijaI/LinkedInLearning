package designPatterns.composition.challenge;

public class LibraryClient {

  public static void main(String[] args) {

    Book nonfictionBook = new NonfictionBook("A Brief History of Time");
    Book fictionBookOne = new FictionBook("Hamlet", true);
    Book fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBook(nonfictionBook);
    bookCollection.addBook(fictionBookOne);
    bookCollection.addBook(fictionBookTwo);

    checkoutBook(nonfictionBook);
    checkoutBook(fictionBookOne);
    checkoutBook(bookCollection);

    returnBook(nonfictionBook);
    returnBook(fictionBookOne);
    returnBook(bookCollection);

  }

  public static void checkoutBook(Book book) {
    book.checkout();
  }

  public static void returnBook(Book book) {
    book.returnBook();
  }

}
