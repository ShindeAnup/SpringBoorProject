package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerRegistration {
	private String organizationName;
	private String contactPerson;
	private int contactNumber;
	@Id
	private String officialMail;
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getOfficialMail() {
		return officialMail;
	}
	public void setOfficialMail(String officialMail) {
		this.officialMail = officialMail;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [organizationName=" + organizationName + ", contactPerson=" + contactPerson
				+ ", contactNumber=" + contactNumber + ", officialMail=" + officialMail + "]";
	}
	
	

}
