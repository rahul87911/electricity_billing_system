package Source_Packages.Electricity;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public  Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ebs","root","Neelam@12345");
            s=c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
