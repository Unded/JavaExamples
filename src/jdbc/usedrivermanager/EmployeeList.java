package jdbc.usedrivermanager;

import java.sql.*;

public class EmployeeList {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;

        try{


            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson22");

            String sqlRequest = "SELECT * FROM Employee";

            stmt = conn.createStatement();

            result = stmt.executeQuery(sqlRequest);

            while(result.next()){
                int empNo = result.getInt("EMPNO");
                String eName = result.getString("ENAME");
                String eJob = result.getString("JOB_TITLE");

                System.out.println(empNo + " |\t " + eName + "\t| " + eJob);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                result.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
