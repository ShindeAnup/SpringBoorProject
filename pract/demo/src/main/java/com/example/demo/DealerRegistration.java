package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DealerRegistration {
	
	private String organizationName;
	private String contactPerson;
	private long contactNumber;
	@Id
	private String officeMail;
	private String warehouseAddress;
	private String officeAddress;
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getOfficeMail() {
		return officeMail;
	}
	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}
	public String getWarehouseAddress() {
		return warehouseAddress;
	}
	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Override
	public String toString() {
		return "DealerRegistration [organizationName=" + organizationName + ", contactPerson=" + contactPerson
				+ ", contactNumber=" + contactNumber + ", officeMail=" + officeMail + ", warehouseAddress="
				+ warehouseAddress + ", officeAddress=" + officeAddress + "]";
	}
	
	

}
