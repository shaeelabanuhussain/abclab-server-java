package com.lab.med.medEntity;


public class Appointment {
	private int appointmentId;
    private int patientId;
    private int testId;
    private String testName;
    
	private int technicianId;
    private int doctorId;
    private String appointmentDate;
    private String appointmentTime;
    private String status;
    
    public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int test) {
		this.testId = test;
	}
	public int getTechnicianId() {
		return technicianId;
	}
	public void setTechnicianId(int technicianId) {
		this.technicianId = technicianId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
//	public Patient getPatient() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
