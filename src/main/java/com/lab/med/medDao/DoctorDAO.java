package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Doctor;
import com.lab.med.medDb.DBConnection;

public class DoctorDAO {

    public Doctor getDoctorById(int doctorId) throws SQLException {
        Doctor doctor = null;
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM doctors WHERE doctor_id = ?");
        statement.setInt(1, doctorId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            doctor = new Doctor();
            doctor.setDoctorId(resultSet.getInt("doctor_id"));
            doctor.setFirstName(resultSet.getString("first_name"));
            doctor.setLastName(resultSet.getString("last_name"));
            doctor.setEmail(resultSet.getString("email"));
            doctor.setPhone(resultSet.getString("phone"));
        }
        return doctor;
    }

    public List<Doctor> getAllDoctors() throws SQLException {
        List<Doctor> doctors = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM doctors");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Doctor doctor = new Doctor();
            doctor.setDoctorId(resultSet.getInt("doctor_id"));
            doctor.setFirstName(resultSet.getString("first_name"));
            doctor.setLastName(resultSet.getString("last_name"));
            doctor.setEmail(resultSet.getString("email"));
            doctor.setPhone(resultSet.getString("phone"));
            doctors.add(doctor);
}
        return doctors;
    }
    public void addDoctor(Doctor doctor) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO doctors (first_name, last_name, email, phone) VALUES (?, ?, ?, ?)");
        statement.setString(1, doctor.getFirstName());
        statement.setString(2, doctor.getLastName());
        statement.setString(3, doctor.getEmail());
        statement.setString(4, doctor.getPhone());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted <= 0) {
            throw new SQLException("Failed to add doctor.");
        }
    }
}