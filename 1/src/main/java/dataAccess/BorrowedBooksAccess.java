package dataAccess;
import Model.Customer;
import Model.Book;
import Model.BorrowedBooks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class BorrowedBooksAccess {

    public void addBBook(int customerID, String customer, int bookID, String book){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BorrowedBooks.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            BorrowedBooks book1 = new BorrowedBooks(customerID, customer, bookID, book);
            session.beginTransaction();
            session.save(book1);
            session.getTransaction().commit();
        }finally{
            factory.close();
        }
    }

    public ArrayList<BorrowedBooks> selectAll(){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BorrowedBooks.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            @SuppressWarnings("unchecked")
			ArrayList<BorrowedBooks> books = (ArrayList<BorrowedBooks>) session.createQuery("from BorrowedBooks").list();
            session.getTransaction().commit();
            return books;
        }finally{
            factory.close();
        }

    }

    public ArrayList<String> getBooksByUser(int id){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BorrowedBooks.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            @SuppressWarnings("unchecked")
			ArrayList<String> books = (ArrayList<String>) session.createQuery("select book from BorrowedBooks where customerID = "+id).list();
            session.getTransaction().commit();

            return books;
        }finally{
            factory.close();
        }

    }


    public void deleteByBookId(int id){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BorrowedBooks.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            session.createQuery("delete from BorrowedBooks where bookID="+id).executeUpdate();
            session.getTransaction().commit();

        }finally{
            factory.close();
        }

    }

    public static void main(String[] args) {
        BorrowedBooksAccess b = new BorrowedBooksAccess();
        b.addBBook(7,"    mama",3,"Chasing Mavericks");

        BorrowedBooksAccess borrowedBooksAccess = new BorrowedBooksAccess();

    }


}