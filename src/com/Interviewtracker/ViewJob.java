package com.Interviewtracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewJob {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/interview_tracker";
            String username = "root";
            String password = "Mysql@2026";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM jobs");

            while(rs.next()) {

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Company : " + rs.getString("company_name"));
                System.out.println("Role : " + rs.getString("job_role"));
                System.out.println("Location : " + rs.getString("location"));
                System.out.println("Status : " + rs.getString("status"));
                System.out.println("------------------------");

            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }

    }

}
