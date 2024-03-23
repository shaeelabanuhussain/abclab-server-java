package com.lab.med.medDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lab.med.medEntity.Appointment;
import com.lab.med.medEntity.Billing;
import com.lab.med.medDb.DBConnection;

public class BillingDAO {

    public List<Billing> getBillingByAppointment(Appointment appointment) throws SQLException {
        List<Billing> billings = new ArrayList<>();
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM billings WHERE appointment_id = ?");
        statement.setInt(1, appointment.getAppointmentId());
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Billing billing = new Billing();
            billing.setBillingId(resultSet.getInt("billing_id"));
            billing.setAppointmentId(resultSet.getInt("appointment_id"));
            billing.setBillingAmount(resultSet.getDouble("amount"));
            billing.setPaymentStatus(resultSet.getString("payment_status"));
            billings.add(billing);
        }
        return billings;
    }

    public void addBilling(Billing billing) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO billings (appointment_id, amount, payment_status) VALUES (?, ?, ?)");
        statement.setInt(1, billing.getAppointmentId());
        statement.setDouble(2, billing.getBillingAmount());
        statement.setString(3, billing.getPaymentStatus());
        statement.executeUpdate();
    }

    public void updateBilling(Billing billing) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("UPDATE billings SET amount = ?, payment_status =? WHERE billing_id = ?");
        statement.setDouble(1, billing.getBillingAmount());
        statement.setString(2, billing.getPaymentStatus());
        statement.setInt(3, billing.getBillingId());
        statement.executeUpdate();
    }

    public void deleteBilling(int billingId) throws SQLException {
        Connection connection = DBConnection.getConn();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM billings WHERE billing_id = ?");
        statement.setInt(1, billingId);
        statement.executeUpdate();
    }
}