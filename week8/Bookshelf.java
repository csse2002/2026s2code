import java.util.ArrayList;
import java.util.List;

public class Bookshelf<T extends Book> {
  List<T> books = new ArrayList<>();

  void addBook(T book) {
    books.add(book);
  }
  T getBook(int i) {
    return books.get(i);
  }

  public static void main(String[] args) {
    Bookshelf<FictionBook> bookshelf = new Bookshelf<>();
    bookshelf.addBook(new FictionBook("Bronte, E"));

    // bookshelf.addBook(new NonFictionBook("Liskov, B"));
    // bookshelf.addBook("hello");
  }
}

class ChildFriendlyBookshelf extends Bookshelf<KidsBook> {

}

abstract class Book {
  private String author;

  Book(String author) {
    this.author = author;
  }

  String getAuthor() {
    return author;
  }
}
class FictionBook extends Book {

  FictionBook(String author) {
    super(author);
  }
}

class KidsBook extends FictionBook {
  KidsBook(String author) {
    super(author);
  }
}

class NonFictionBook extends Book {
  NonFictionBook(String author) {
    super(author);
  }
}
