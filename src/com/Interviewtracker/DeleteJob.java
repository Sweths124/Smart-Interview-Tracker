package com.Interviewtracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteJob {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/interview_tracker";
            String username = "root";
            String password = "Mysql@2026";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            String sql = "DELETE FROM jobs WHERE id=1";

            int rows = st.executeUpdate(sql);

            System.out.println(rows + " Record Deleted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
