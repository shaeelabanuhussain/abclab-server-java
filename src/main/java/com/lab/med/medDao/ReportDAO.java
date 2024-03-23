package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Patient;
import com.lab.med.medEntity.Report;
import com.lab.med.medDb.DBConnection;

public class ReportDAO {

    public List<Report> getReportsByPatient(Patient patient) throws SQLException {
        List<Report> reports = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM reports WHERE patient_id = ?");
        statement.setInt(1, patient.getPatientId());
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Report report = new Report();
            report.setReportId(resultSet.getInt("report_id"));
            report.setPatientId((resultSet.getInt("patient_id")));
            report.setAppointmentId(resultSet.getInt("appointment_id"));
            report.setReportUrl(resultSet.getString("report_url"));
            report.setReportDate(resultSet.getDate("report_date"));
            reports.add(report);
        }
        return reports;
    }

    public void addReport(Report report) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERTINTO reports (patient_id, appointment_id, report_url, report_date) VALUES (?, ?, ?, ?)");
        statement.setInt(1, report.getPatientId());
        statement.setInt(2, report.getAppointmentId());
        statement.setString(3, report.getReportUrl());
        statement.setDate(4, report.getReportDate());
        statement.executeUpdate();
    }
}