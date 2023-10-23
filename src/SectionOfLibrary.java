public class SectionOfLibrary {
    private String sectionId;
    private int fileNumber;
    private int totalOfBooks;
    private Book[] books;

    public SectionOfLibrary(String sectionId,int fileNumber) {
        this.sectionId = sectionId;
        this.fileNumber=fileNumber;
        this.totalOfBooks=0;
        this.books=new Book[fileNumber];
    }

    public int getTotalOfBooks() {
        return totalOfBooks;
    }

    public String getSectionId() {
        return sectionId;
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public boolean isSectionFull(){
        return this.totalOfBooks>=this.fileNumber;
    }

    public boolean addBook(Book book){
        if (isSectionFull() && !this.sectionId.equals("CM018")){
            System.out.println("Cannot add a new book to this section.Section is almost Full.");
            return false;
        }
        if (this.sectionId.equals("ED012") && !book.getBookCategory().equalsIgnoreCase("Education")){
            System.out.println("You can be added only education books to the education section");
            return false;
        }
        if (this.sectionId.equals("RD035") || this.sectionId.equals("CM018")){
            if (!book.getBookCategory().equalsIgnoreCase("Novel") && !book.getBookCategory().equalsIgnoreCase("Short Story")){
                System.out.println("Only novels and short stories can be added to the reading and common section");
                return false;
            }
        }
        books[totalOfBooks]=book;
        totalOfBooks++;
        return true;
    }


}
