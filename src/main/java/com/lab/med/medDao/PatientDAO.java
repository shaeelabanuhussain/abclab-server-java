package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Patient;
import com.lab.med.medDb.DBConnection;

public class PatientDAO {

    public Patient getPatientByEmail(String email) throws SQLException {
        Patient patient = null;
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM patients WHERE email = ?");
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            patient = new Patient();
            patient.setPatientId(resultSet.getInt("patient_id"));
            patient.setFirstName(resultSet.getString("first_name"));
            patient.setLastName(resultSet.getString("last_name"));
            patient.setEmail(resultSet.getString("email"));
            patient.setPhone(resultSet.getString("phone"));
            patient.setAddress(resultSet.getString("address"));
            patient.setUniqueId(resultSet.getString("unique_id"));
            patient.setHashedPassword(resultSet.getString("password"));
        }
        return patient;
    }

    public Patient getPatientById(int patientId) throws SQLException {
        Patient patient = null;
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM patients WHERE patient_id = ?");
        statement.setInt(1, patientId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            patient = new Patient();
            patient.setPatientId(resultSet.getInt("patient_id"));
            patient.setFirstName(resultSet.getString("first_name"));
            patient.setLastName(resultSet.getString("last_name"));
            patient.setEmail(resultSet.getString("email"));
            patient.setPhone(resultSet.getString("phone"));
            patient.setAddress(resultSet.getString("address"));
            patient.setUniqueId(resultSet.getString("unique_id"));
            patient.setHashedPassword(resultSet.getString("password"));
        }
        return patient;
    }

    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM patients");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Patient patient = new Patient();
            patient.setPatientId(resultSet.getInt("patient_id"));
            patient.setFirstName(resultSet.getString("first_name"));
            patient.setLastName(resultSet.getString("last_name"));
            patient.setEmail(resultSet.getString("email"));
            patient.setPhone(resultSet.getString("phone"));
            patient.setAddress(resultSet.getString("address"));
            patient.setUniqueId(resultSet.getString("unique_id"));
            patient.setHashedPassword(resultSet.getString("password"));
            patients.add(patient);
        }
        return patients;
    }

    public void addPatient(Patient patient) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO patients (first_name, last_name, email, phone, address, unique_id, password) VALUES (?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, patient.getFirstName());
        statement.setString(2, patient.getLastName());
        statement.setString(3, patient.getEmail());
        statement.setString(4, patient.getPhone());
        statement.setString(5, patient.getAddress());
        statement.setString(6, patient.getUniqueId());
        statement.setString(7, patient.getHashedPassword());
        statement.executeUpdate();
    }

    public void updatePatient(Patient patient) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("UPDATE patients SET first_name = ?, last_name = ?, email = ?, phone = ?, address = ?, unique_id = ?, password =? WHERE patient_id = ?");
        statement.setString(1, patient.getFirstName());
        statement.setString(2, patient.getLastName());
        statement.setString(3, patient.getEmail());
        statement.setString(4, patient.getPhone());
        statement.setString(5, patient.getAddress());
        statement.setString(6, patient.getUniqueId());
        statement.setInt(7, patient.getPatientId());
        statement.setString(8, patient.getHashedPassword());
        statement.executeUpdate();
    }

    public void deletePatient(int patientId) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM patients WHERE patient_id = ?");
        statement.setInt(1, patientId);
        statement.executeUpdate();
    }
}