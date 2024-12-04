package nested.test.ex1;

public class Library {

    private int bookCount;
    private int bookIndex;
    private Book[] books;

    public Library(int bookCount) {
        this.bookCount = bookCount;
        this.books = new Book[bookCount];
        this.bookIndex = 0;
    }

    public void addBook(String title, String author) {
        if(bookIndex >= bookCount) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        } 
        
        // 정상 로직을 처리
        books[bookIndex++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 제목 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }


    private static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }


}
