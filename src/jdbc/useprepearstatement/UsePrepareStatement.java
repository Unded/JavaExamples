package jdbc.useprepearstatement;

import java.sql.*;

public class UsePrepareStatement {

    public static void main(String[] args) {
        try(Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson22");
            PreparedStatement pStmt = conn.prepareStatement("SELECT * FROM Employee WHERE EMPNO=?")
             ){

            for (int i = 1; i <= 3; i++){
                pStmt.setInt(1,i);
                ResultSet result = pStmt.executeQuery();

                while(result.next()){
                    int emNo = result.getInt("EMPNO");
                    String emName = result.getString("ENAME");
                    String emJob = result.getString("JOB_TITLE");
                    System.out.println(emNo + " |\t " + emName + "\t| " + emJob);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
