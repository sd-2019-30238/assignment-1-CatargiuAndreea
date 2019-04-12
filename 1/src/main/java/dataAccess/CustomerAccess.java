  
package dataAccess;

import Model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccess {

    public static void addCustomer(String nume, String password, String type){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            Customer customer = new Customer(nume, password, type);
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

    public Customer readCustomer(int id){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();
            Customer customer = (Customer) session.get(Customer.class, id);
            session.getTransaction().commit();
            return customer;
        }finally {
            factory.close();
        }

    }

    public void updateCustomer(int id, String payment){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();
            Customer customer = (Customer) session.get(Customer.class, id);
            customer.setPayment(payment);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

    public void deleteCustomer(int id){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();
            Customer customer = (Customer) session.get(Customer.class, id);
            session.delete(customer);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

    public ArrayList<Customer> queryAccount(){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();

            @SuppressWarnings("unchecked")
			ArrayList<Customer> customer = (ArrayList<Customer>) session.createQuery("from Customer").list();

            displayCustomers(customer);


            session.getTransaction().commit();

            return customer;
        }finally {
            factory.close();
        }
    }
    public ArrayList<Customer> queryLogin(String nume, String password){
        @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();

            String s = "from Customer s where s.nume="+"'"+nume+"' and s.password= '"+password+"'";

            @SuppressWarnings("unchecked")
			ArrayList<Customer> customers = (ArrayList<Customer>) session.createQuery(s).list();

            displayCustomers(customers);


            session.getTransaction().commit();

            return customers;
        }finally {
            factory.close();
        }
    }
    public ArrayList<Customer> queryRegister(String nume){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();

            String s = "from Customer s where s.nume="+"'"+nume+"'";

            ArrayList<Customer> customer = (ArrayList<Customer>) session.createQuery(s).list();

            session.getTransaction().commit();

            return customer;
        }finally {
            factory.close();
        }
    }

    public static void displayCustomers(List<Customer> customer) {
        for (Customer b : customer) {
            System.out.println(b);
        }
    }


    public static void main(String[] args) {
        CustomerAccess a = new CustomerAccess();
        Customer b = new Customer();
        //a.addAccount("ana", "ana", "month");
        //Customer b = new Customer();
        //a.addCustomer("maria","maria","year");
        //a.queryAccount();
        //a.updateCustomer(true);
        //b = a.readCustomer(4);
        ArrayList<Customer>anana=a.queryRegister("carla");


        System.out.println(anana.size());

    }
}

