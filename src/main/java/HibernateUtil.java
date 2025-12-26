import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import javax.security.auth.login.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static  {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cgf.xml")
                    .addAnnotatedClass()
                    .buildSessionFactory();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
