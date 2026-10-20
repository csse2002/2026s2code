import java.util.List;

public class Library {

  static <B extends Book> void restock(List<B> newBooks, Bookshelf<B> bookshelf) {
    for (B book : newBooks) {
      bookshelf.addBook(book);
    }
  }

  static int stockTake(Bookshelf<? extends Book> bookshelf) {
    bookshelf.books.sort((a, b) -> a.getAuthor().compareTo(b.getAuthor()));
    return bookshelf.books.size();
  }

  static void printBookshelf(Bookshelf<? extends Book> bookshelf) {
    for (Book book : bookshelf.books) {
      System.out.println(book.getAuthor());
    }
  }

  static void redistributeKidsBook(ChildFriendlyBookshelf bookshelf,
                                   Bookshelf<? super KidsBook> newBookshelf) {
    for (KidsBook book : bookshelf.books) {
      newBookshelf.addBook(book);
    }
  }

  public static void main(String[] args) {
    FictionBook fictionBook = new FictionBook("Sanderson, B");
    Bookshelf<FictionBook> bookshelf = new Bookshelf<>();
    restock(List.of(fictionBook), bookshelf);

    ChildFriendlyBookshelf childFriendlyBookshelf = new ChildFriendlyBookshelf();
    restock(List.of(new KidsBook("Seuss, Dr")), childFriendlyBookshelf);

    bookshelf.addBook(new FictionBook("Bronte, E"));
    stockTake(bookshelf);
    printBookshelf(bookshelf);
  }
}
