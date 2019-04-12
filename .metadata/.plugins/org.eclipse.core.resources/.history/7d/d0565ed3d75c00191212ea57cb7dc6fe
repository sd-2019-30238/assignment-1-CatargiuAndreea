package dataAccess;

import Model.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class StaffAccess {

  public void addStaff(String username, String password){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          Staff customer = new Staff(username, password);
          session.beginTransaction();
          session.save(customer);
          session.getTransaction().commit();
      }finally {
          factory.close();
      }
  }

  public Staff readStaff(int id){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();
          Staff staff =(Staff) session.get(Staff.class, id);
          session.getTransaction().commit();
          return staff;
      }finally {
          factory.close();
      }

  }

  public void updateStaff(int id, String password){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();
          Staff customer = (Staff) session.get(Staff.class, id);
          session.getTransaction().commit();
      }finally {
          factory.close();
      }
  }

  public void deleteStaff(int id){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();
          Staff customer = (Staff) session.get(Staff.class, id);
          session.delete(customer);
          session.getTransaction().commit();
      }finally {
          factory.close();
      }
  }

  public ArrayList<Staff> queryStaff(){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();

          @SuppressWarnings("unchecked")
		ArrayList<Staff> customer = (ArrayList<Staff>) session.createQuery("from Customer").list();

          displayAccounts(customer);


          session.getTransaction().commit();

          return customer;
      }finally {
          factory.close();
      }
  }
  public ArrayList<Staff> queryLogin(String name, String password){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();

          String s = "from Customer s where s.name="+"'"+name+"' and s.password= '"+password+"'";

          @SuppressWarnings("unchecked")
			ArrayList<Staff> customers = (ArrayList<Staff>) session.createQuery(s).list();

          displayAccounts(customers);


          session.getTransaction().commit();

          return customers;
      }finally {
          factory.close();
      }
  }
  public ArrayList<Staff> queryRegister(String username){
      @SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration()
              .configure("hibernate.cfg.xml")
              .addAnnotatedClass(Staff.class)
              .buildSessionFactory();
      Session session = factory.getCurrentSession();
      try{

          session.beginTransaction();

          String s = "from Account s where s.username="+"'"+username+"'";

          @SuppressWarnings("unchecked")
			ArrayList<Staff> customers = (ArrayList<Staff>) session.createQuery(s).list();

          session.getTransaction().commit();

          return customers;
      }finally {
          factory.close();
      }
  }

  public static void displayAccounts(List<Staff> customer) {
      for (Staff b : customer) {
          System.out.println(b);
      }
  }


  public static void main(String[] args) {
      StaffAccess a = new StaffAccess();
      //a.addAccount("ana", "ana", "month");
      Staff b = new Staff();
      /*a.addStaff("staff1","staff1");
      a.addStaff("staff2","staff2");
      a.addStaff("staff3","staff3");
      a.addStaff("staff4","staff4");
      a.addStaff("staff5","staff5");
      a.addStaff("staff6","staff6");
      a.addStaff("staff7","staff7");
      */
      
      //a.queryAccount();
      a.deleteStaff(4);
      //b = a.readAccount(4);
      ///ArrayList<Customer>aaa=a.queryRegister("cccccc");


      //System.out.println(aaa.size());

  }
}

