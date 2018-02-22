package school;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        String name;
        System.out.println("Enter student name: ");
        name = userInput.next();

        String id;
        System.out.println("Enter student id: ");
        id = userInput.next();

        String age;
        System.out.println("Enter student age: ");
        age = userInput.next();
        
        String gender;
        System.out.println("Enter student gender: ");
        gender = userInput.next();
        
        DBUtilities dbUtilities = new DBUtilities();
        
        String sql_stmt = "INSERT INTO contacts (name,id,age,gender) VALUES ('" + name + "','" + id + "','" + age + "','" + gender + "')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
       NewSchool.DisplayMenu();
    }
}