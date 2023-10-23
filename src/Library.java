public class Library {
    private SectionOfLibrary educationSection;
    private SectionOfLibrary readingSection;
    private SectionOfLibrary commonSection;
    private double fund;

    public Library(){
        educationSection=new SectionOfLibrary("ED012",25);
        readingSection=new SectionOfLibrary("RD032",45);
        commonSection=new SectionOfLibrary("CM018",28);
        this.fund=0.0;
    }

    public void addBookToSection(Book book){
        String category=book.getBookCategory();

        if (category.equalsIgnoreCase("Education")){
            educationSection.addBook(book);
        } else if (category.equalsIgnoreCase("Novel") || category.equalsIgnoreCase("Short Story")) {
            readingSection.addBook(book);
            commonSection.addBook(book);
        }else {
            System.out.println("Error......Invalid category....");
        }
    }

    public int getTotalOfEducationSection(){
        return educationSection.getTotalOfBooks();
    }

    public int getTotalOfReadingSection(){
        return readingSection.getTotalOfBooks();
    }

    public int getTotalOfCommonSection(){
        return commonSection.getTotalOfBooks();
    }

    public void depositFund(double amount){
        this.fund+=amount;
    }

    public double getCurrentFund(){
        return this.fund;
    }
}
