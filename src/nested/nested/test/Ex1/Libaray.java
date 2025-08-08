package nested.nested.test.Ex1;

public class Libaray {

    private Book[] books;
    private int bookCount;

    public Libaray(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else{
            System.out.println("도서관 저장 공간이 부족하다");
        }
    }
    

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i =0; i<bookCount; i++) {
            Book book = books[i];
            System.out.println("도서 제목: "+book.title+", 저자: "+book.author);
            
        }
    }

    //외부에서 접근하지 못하게
    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
