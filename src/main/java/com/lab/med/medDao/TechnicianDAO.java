package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Technician;
import com.lab.med.medDb.DBConnection;

public class TechnicianDAO {

    public Technician getTechnicianById(int technicianId) throws SQLException {
        Technician technician = null;
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM technicians WHERE technician_id = ?");
        statement.setInt(1, technicianId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            technician = new Technician();
            technician.setTechnicianId(resultSet.getInt("technician_id"));
            technician.setFirstName(resultSet.getString("first_name"));
            technician.setLastName(resultSet.getString("last_name"));
            technician.setEmail(resultSet.getString("email"));
            technician.setPhone(resultSet.getString("phone"));
            technician.setSpecialization(resultSet.getString("specialization"));
        }
        return technician;
    }

    public List<Technician> getAllTechnicians() throws SQLException {
        List<Technician> technicians = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM technicians");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Technician technician = new Technician();
            technician.setTechnicianId(resultSet.getInt("technician_id"));
            technician.setFirstName(resultSet.getString("first_name"));
            technician.setLastName(resultSet.getString("last_name"));
            technician.setEmail(resultSet.getString("email"));
            technician.setPhone(resultSet.getString("phone"));
            technician.setSpecialization(resultSet.getString("specialization"));
            technicians.add(technician);
        }
        return technicians;
       
    }
    public void addTechnician(Technician technician) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO technicians (first_name, last_name, email, phone, specialization) VALUES (?, ?, ?, ?, ?)");
        statement.setString(1, technician.getFirstName());
        statement.setString(2, technician.getLastName());
        statement.setString(3, technician.getEmail());
        statement.setString(4, technician.getPhone());
        statement.setString(5, technician.getSpecialization());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted <= 0) {
            throw new SQLException("Failed to add technician.");
        }
    }
}
