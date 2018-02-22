package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySchool {

		// JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/myschool?useSSL=myschool";
		
		   //  Database credentials
		   static final String USER = "afiqah";
		   static final String PASS = "mypass!@#";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		    
		      System.out.println("Creating table in given database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE STUDENT " +
		    		  	   "(name CHAR(225), " +
		                   " id INTEGER not NULL, " + 
		                   " age INTEGER not NULL, " + 
		                   " gender CHAR(10), " +
		                   " class CHAR(225), " +
		                   " PRIMARY KEY ( 'name','class' ))";  
		      
		      System.out.println("Inserting records into the table...");
		      stmt = conn.createStatement();
		     
		     
		      String sql = "INSERT INTO Student " +
		                   "VALUES ('Haiqal', 2018800222, 23, 'M', 'Quantum Mechanic')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Student " + 
		      	           "VALUES ('Maisarah', 2018801324, 23, 'F', 'Final Year Project')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Student " +
		    		       "VALUES ('Alisa', 2018881120, 22, 'F', 'Biocomposite')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Student " +
		    		       "VALUES ('Haris', 2018856543, 24, 'M', 'Final Year Project')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Student " +
		    		       "VALUES ('Firdaus', 2018765132, 23, 'M', 'Thermodynamic')";
		      stmt.executeUpdate(sql);
		      System.out.println("Inserted records into the table..."); 
		      
		     
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "SELECT name, id, age, gender,class FROM Student";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	 String name = rs.getname("name");
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String gender = rs.getGender("gender");
		         String class = rs.getClass("class");

		         //Display values
		         System.out.print("Name: " + name);
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", Gender: " + gender);
		         System.out.println(", Class: " + class);
		      }

		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
		}//end JDBCExample