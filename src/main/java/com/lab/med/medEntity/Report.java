package com.lab.med.medEntity;



import java.sql.Date;

public class Report {
	    private int reportId;
	    private int appointmentId;
	    private int patientId;
	    private int testId;
	    private Date reportDate;
	    private String reportResults;
	    private String reportUrl;
	    
		public String getReportUrl() {
			return reportUrl;
		}
		public void setReportUrl(String reportUrl) {
			this.reportUrl = reportUrl;
		}
		public int getReportId() {
			return reportId;
		}
		public void setReportId(int reportId) {
			this.reportId = reportId;
		}
		public int getAppointmentId() {
			return appointmentId;
		}
		public void setAppointmentId(int appointmentId) {
			this.appointmentId = appointmentId;
		}
		public int getTestId() {
			return testId;
		}
		public void setTestId(int testId) {
			this.testId = testId;
		}
		public Date getReportDate() {
			return reportDate;
		}
		public void setReportDate(Date reportDate) {
			this.reportDate = reportDate;
		}
		public String getReportResults() {
			return reportResults;
		}
		public void setReportResults(String reportResults) {
			this.reportResults = reportResults;
		}
//		public int getPatientId() {
//			return patientId;
//		}
//		public void setAppointmentId(int appointmentId) {
//			this.appointmentId = appointmentId;
//		}
		public int getPatientId() {
			return patientId;
		}
		
		public void setPatientId(int patientId) {
			this.patientId = patientId;	
		}

	    // constructors, getters, and setters


}
