package electricity.billing.system;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;                                                                                                       //1.REGISTER THE DRIVER

public class Conn {

    Connection c;
    Statement s;


    Conn() {


        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","ninjah2r");                // 2.CREATING A CONNECTION TELLING JDBC BOUT MYSQL
            s = c.createStatement();                                                                                                //3.CREATING STATEMENT
                                                                                                                                    //4.EXECUTING MYSQL QUERIES

        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
