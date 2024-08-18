package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Create_Table
{
@Test
    public void create_table()
    {
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/","root","SRIka_001");
    //here sonoo is database name, root is username and password
    System.out.println("This is JDBC connection");
    Statement stmt=con.createStatement();
    System.out.println(stmt);
    //stmt.execute("create database MySchool");

   stmt.execute("use employee");
    String sql = "CREATE TABLE MyEmployee"
            + "(id INTEGER not NULL, "
            + " firstName VARCHAR(50), "
            + " lastName VARCHAR(50), "
            + " age INTEGER, "
            + " PRIMARY KEY ( id ))";
    stmt.executeUpdate(sql);
    System.out.println("Created table in given database...");
  //  stmt.close();
   // con.close();


    System.out.println("Table is Created ...");



    stmt.execute("Insert into MyEmployee(EmpId,Mobile,FName,LName,Email,State,Doj,Vehicle) values (1,6655678987,'Rik','Som','Rik@Som.com','BL','2000-01-01','Car') ,\n" +
            "(1,6655678987,'Rik','Som','Rik@Som.com','BL','2000-01-01','Car'),\n" +
            "(2,4445678987,'CAT','MAT','Cat@mat.com','TN','2000-01-02','Bus'),\n" +
            "(3,6655678222,'BAT','MAN','BAT@MAN.com','PN','2000-01-03','Van'),\n" +
            "(4,6655678333,'HE','MAN','HE@MAN.com','JK','2000-01-04','Car'),\n" +
            "(5,6655678444,'SPIDER','MAN','SPIDER@MAN.com','WB','2000-01-05','Bus'),\n" +
            "(6,6655678555,'TIK','TOK','TIK@TOK.com','BH','2000-01-06','Car'),\n" +
            "(7,6655678666,'KIT','KAT','KIT@KAT.com','OR','2000-01-07','Van'),\n" +
            "(8,6655678888,'MIT','ROT','MIT@ROY.com','KR','2000-01-08','Auto'),\n" +
            "(9,6655699987,'JOY','TOY','Rik@JOY.TOY','JK','2000-01-09','Cat'),\n" +
            "(10,6650008987,'SAM','Som','SAM@Som.com','KY','2000-01-10','Car');");




    System.out.println("Table Data Addition is Successfull ....");


    }
catch(Exception e){
    System.out.println(e.getMessage());
}
    }
}
