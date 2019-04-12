package Model;
import javax.persistence.*;


@Entity
@Table
public class BorrowedBooks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column (name = "customerID")
    private int customerID;
    @Column(name = "username")
    private String customer;
    @Column (name = "bookID")
    private int bookID;
    @Column(name = "book")
    private String book;

    public BorrowedBooks(int customerID, String customer, int bookID, String book) {
        this.customerID = customerID;
        this.customer = customer;
        this.bookID = bookID;
        this.book = book;
    }

    public BorrowedBooks(){

    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BorrowedBooks{" + "id=" + id + ", customerID=" + customerID + ", customer='" + customer + '\'' + ", bookID=" + bookID +
                ", book='" + book + '\'' +'}';
    }


}