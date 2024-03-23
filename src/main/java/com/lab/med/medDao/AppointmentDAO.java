package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Patient;
import com.lab.med.medEntity.Test;
import com.lab.med.medEntity.Technician;
import com.lab.med.medEntity.Doctor;


import com.lab.med.medEntity.Appointment;
import com.lab.med.medDb.DBConnection;

public class AppointmentDAO {

    public List<Appointment> getAppointmentsByPatient(Patient patient) throws SQLException {
        List<Appointment> appointments = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM appointments WHERE patient_id = ?");
        statement.setInt(1, patient.getPatientId());
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Appointment appointment = new Appointment();
            appointment.setAppointmentId(resultSet.getInt("appointment_id"));
            appointment.setAppointmentDate(resultSet.getString("appointment_date"));
            appointment.setAppointmentTime(resultSet.getString("appointment_time"));
            appointment.setTestId(resultSet.getInt("test_id"));
            appointment.setTechnicianId(resultSet.getInt("technician_id"));
            appointment.setDoctorId(resultSet.getInt("doctor_id"));
            appointments.add(appointment);
        }
        return appointments;
    }

    public void addAppointment(Appointment appointment) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO appointments (patient_id, appointment_date, appointment_time, test_id, technician_id, doctor_id) VALUES (?, ?, ?, ?, ?, ?)");
        statement.setInt(1, appointment.getPatientId());
        statement.setString(2, appointment.getAppointmentDate());
        statement.setString(3, appointment.getAppointmentTime());
        statement.setInt(4, appointment.getTestId());
        statement.setInt(5, appointment.getTechnicianId());
        statement.setInt(6, appointment.getDoctorId());
        statement.executeUpdate();
    }

    public void updateAppointment(Appointment appointment) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("UPDATE appointments SET appointment_date = ?, appointment_time = ?, test_id = ?, technician_id = ?, doctor_id = ? WHERE appointment_id = ?");
        statement.setString(1, appointment.getAppointmentDate());
        statement.setString(2, appointment.getAppointmentTime());
        statement.setInt(3, appointment.getTestId());
        statement.setInt(4, appointment.getTechnicianId());
       statement.setInt(5, appointment.getDoctorId());
        statement.setInt(6, appointment.getAppointmentId());
        statement.executeUpdate();
    }

    public void deleteAppointment(int appointmentId) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM appointments WHERE appointment_id = ?");
        statement.setInt(1, appointmentId);
        statement.executeUpdate();
    }
}
