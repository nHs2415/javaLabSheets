public class Driver {
    public static void main(String[] args) {

        Library library=new Library();

        Book book1=new Book("E2216","Basic Mathematics","John Doe","Education");
        Book book2=new Book("N5622","Sunny Days","Robert Johns","Novel");
        Book book3=new Book("S2836","The Forest","Adam Taylor","Short Story");

        library.addBookToSection(book1);
        library.addBookToSection(book2);
        library.addBookToSection(book3);

        System.out.println("Total Books(Education Section) :"+library.getTotalOfEducationSection());
        System.out.println("Total Books(Reading Section)   :"+library.getTotalOfReadingSection());
        System.out.println("Total Books(Common Section)    :"+library.getTotalOfCommonSection());

        library.depositFund(1000.0);

        System.out.println("Current Fund : "+library.getCurrentFund());

    }

}

/*Assumption

1.Education,Novel,Short Story are allowed to be added to respective section.
2.Fund is positive value.
 */