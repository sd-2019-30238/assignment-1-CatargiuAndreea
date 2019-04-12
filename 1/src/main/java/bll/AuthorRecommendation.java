package bll;
import java.util.ArrayList;

import Model.Book;
import dataAccess.BookAccess;


public class AuthorRecommendation implements Recommendation{
	@Override
	 public ArrayList<Book> getReccomendation(String author) {
	        BookAccess bookAccess = new BookAccess();
	        return bookAccess.filterByString("author",author);

	    }
}
