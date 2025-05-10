package learn.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure();
      SessionFactory fact = cfg.buildSessionFactory();
             Session sess = fact.openSession();
            Student stv =   sess.get(Student.class, 4);
            System.out.println(stv);
    }
}
