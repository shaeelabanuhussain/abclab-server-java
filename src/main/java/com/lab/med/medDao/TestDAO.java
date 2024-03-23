package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Test;
import com.lab.med.medDb.DBConnection;

public class TestDAO {

    public Test getTestById(int testId) throws SQLException {
        Test test = null;
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM tests WHERE test_id = ?");
        statement.setInt(1, testId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            test = new Test();
            test.setTestId(resultSet.getInt("test_id"));
            test.setTestName(resultSet.getString("test_name"));
            test.setTestDescription(resultSet.getString("test_description"));
        }
        return test;
    }

    public List<Test> getAllTests() throws SQLException {
        List<Test> tests = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM tests");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Test test = new Test();
            test.setTestId(resultSet.getInt("test_id"));
            test.setTestName(resultSet.getString("test_name"));
            test.setTestDescription(resultSet.getString("test_description"));
            tests.add(test);
        }
        return tests;
    }
    

        // Existing methods omitted for brevity

     public void addTest(Test test) throws SQLException {
            Connection connection = DBConnection.getConn();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tests (test_name, test_description, test_price) VALUES (?, ?, ?)");
            statement.setString(1, test.getTestName());
            statement.setString(2, test.getTestDescription());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted <= 0) {
                throw new SQLException("Failed to add test.");
            }
     }
    

	
}