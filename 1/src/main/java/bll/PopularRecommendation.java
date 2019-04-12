package bll;
import dataAccess.BookAccess;
import Model.Book;

import java.util.ArrayList;

public class PopularRecommendation implements Recommendation{
	@Override
    public ArrayList<Book> getReccomendation(String s) {
        BookAccess bookAccess = new BookAccess();
        return bookAccess.getBooksByPopularity();


    }
}
