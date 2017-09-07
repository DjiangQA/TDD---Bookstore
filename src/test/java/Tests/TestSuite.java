package Tests;

import Main.Book;
import Main.BookStore;
import org.junit.*;

import java.util.HashMap;


public class TestSuite {

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void getAuthorTest(){
        Book book = new Book("author1","title1","genre1","2015");

        Assert.assertEquals(book.getAuthor(), "author1");
    }

    @Test
    public void getGenreTest(){
        Book book = new Book("author1","title1","genre1","2015");

        Assert.assertEquals(book.getGenre(), "genre1");
    }

    @Test
    public void getTitleTest(){
        Book book = new Book("author1","title1","genre1","2015");

        Assert.assertEquals(book.getTitle(), "title1");
    }

    @Test
    public void getYearPublishedTest(){
        Book book = new Book("author1","title1","genre1","2015");

        Assert.assertEquals(book.getYearPublished(), "2015");
    }

    @Test
    public void loopThroughBookStoreTest() {

    }

    @Test
    public void countGenreTest() {

    }


    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

