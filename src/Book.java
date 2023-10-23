public class Book {
    private String id;
    private String bookName;
    private String authorName;
    private String bookCategory;

    public Book(String id,String bookName,String authorName,String bookCategory) {
        this.id = id;
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookCategory=bookCategory;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

}
