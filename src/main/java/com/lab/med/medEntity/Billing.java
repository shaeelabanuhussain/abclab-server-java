package com.lab.med.medEntity;

import java.sql.Date;

public class Billing {
	    private int billingId;
	    private int appointmentId;
	    private Date billingDate;
	    private double billingAmount;
	    private String paymentStatus;
		public int getBillingId() {
			return billingId;
		}
		public void setBillingId(int billingId) {
			this.billingId = billingId;
		}
		public int getAppointmentId() {
			return appointmentId;
		}
		public void setAppointmentId(int appointmentId) {
			this.appointmentId = appointmentId;
		}
		public Date getBillingDate() {
			return billingDate;
		}
		public void setBillingDate(Date billingDate) {
			this.billingDate = billingDate;
		}
		public double getBillingAmount() {
			return billingAmount;
		}
		public void setBillingAmount(double billingAmount) {
			this.billingAmount = billingAmount;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

}
