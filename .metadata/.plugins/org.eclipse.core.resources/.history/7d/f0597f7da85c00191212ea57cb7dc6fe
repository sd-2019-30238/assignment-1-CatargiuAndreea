package bll;

import java.util.ArrayList;

import Model.Book;
import dataAccess.BookAccess;

public class TitleRecommendation implements Recommendation {
	@Override
	 public ArrayList<Book> getReccomendation(String title) {
	        BookAccess bookAccess = new BookAccess();
	        return bookAccess.filterByString("title",title);

	    }
}
