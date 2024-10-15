class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String author, String isbn, String title, int yearPublished) {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;
    }
    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("YearPublished: " + yearPublished);
        System.out.println("Author: " + author);
        System.out.println("Isbn: " + isbn);
    }

}
