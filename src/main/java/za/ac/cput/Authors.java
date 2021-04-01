/**
 * Authors.java
 * This is a concrete class for the Authors object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 *
 */

package za.ac.cput;

public class Authors {


    private  String title, author;

    public Authors(String title, String author) {
        if (title == null || author == null)
            throw new NullPointerException();

        this.title = title;
        this.author = author;
    }


    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    //For ObjectIdentity
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Authors))
            return false;

        Authors book = (Authors) other;
        return title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() * 7;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }

    //For Failing Test
    public void method(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
    }

    public String printTitle(){

        System.out.println(title);

        return title;
    }

    public String printTitleFor(){

        title="The author is "+title;

        System.out.println(title);

        return title;
    }
}
