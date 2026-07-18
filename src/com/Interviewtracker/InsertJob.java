package com.Interviewtracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJob {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/interview_tracker",
                    "root",
                    "Mysql@2026");

            Statement st = con.createStatement();

            String sql = "INSERT INTO jobs(company_name, job_role, location, applied_date, status) VALUES('Infosys','Java Developer','Bangalore','2026-07-17','Applied')";

            st.executeUpdate(sql);

            System.out.println("Data Inserted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
