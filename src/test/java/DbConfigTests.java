import com.jspiders.config.DBConfig;
import org.hibernate.Session;


public class DbConfigTests {
    public static void main(String[] args) {
        testDbConnection();

    }
    public static void testDbConnection(){
        System.out.println("Testing db connection");
        try{
            Session session = DBConfig.getSession();
            session.close();
            DBConfig.shutdown();
            System.out.println("Test Db passed");
        }
        catch (Exception e){
            System.out.println("Test Db Failed");
        }
    }
}
