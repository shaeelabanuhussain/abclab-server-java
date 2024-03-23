package com.lab.med.medEntity;

import java.sql.Date;

public class Patient {
		private int patientId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phone;
	    private String address;
	    private Date dateOfBirth;
	    private String gender;
	    private String uniqueId;
//	    private String password;
	    private String hashedPassword;
	    
//		public String getPassword() {
//			return password;
//		}
//		public void setPassword(String password) {
//			this.password = password;
//		}
	    public String getHashedPassword() {
	        return hashedPassword;
	    }

	    public void setHashedPassword(String hashedPassword) {
	        this.hashedPassword = hashedPassword;
	    }
	    
	    
	    
	    public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getUniqueId() {
			return uniqueId;
		}
		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}
		

	
}
