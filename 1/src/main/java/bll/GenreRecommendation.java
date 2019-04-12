package bll;
import dataAccess.BookAccess;
import Model.Book;

import java.util.ArrayList;


public class GenreRecommendation implements Recommendation {
	@Override
	 public ArrayList<Book> getReccomendation(String genre) {
	        BookAccess bookAccess = new BookAccess();
	        return bookAccess.filterByString("genre",genre);

	    }
}
