package school;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    Update() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 3: Update database record: ");

        String customer_id;
        System.out.println("Enter student id to update: ");
        customer_id = userInput.next();

        //retrieve record to update
        DisplayRecord(student_id);

        String name;
        System.out.println("Enter student name: ");
        name = userInput.next();

        String email;
        System.out.println("Enter student age: ");
        age = userInput.next();

        String contact_number;
        System.out.println("Enter student gender: ");
        gender = userInput.next();

        DBUtilities dbUtilities = new DBUtilities();

        String sql_stmt = "UPDATE contacts SET name = '" + name + "',age = '" + age + "',gender = '" + gender + "' WHERE id = " + student_id;

        dbUtilities.ExecuteSQLStatement(sql_stmt);

        System.out.println("The Record has successfully being deleted");

        NewSchool.DisplayMenu();
    }

    private void DisplayRecord(String customer_id) throws SQLException {
        try {
            DBUtilities dbUtilities = new DBUtilities();

            String sql_stmt = "SELECT name, age, gender FROM contacts WHERE id = " + student_id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listingn");

                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8st", metaData.getColumnName(i));
                }
                System.out.println();

                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.printf("%-8st", resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());

                System.out.println();

            } else {
                System.out.println("No database records foundn");
            }

            //close db connection
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
}