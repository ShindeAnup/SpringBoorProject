package com.example.demo;





import java.time.LocalDate;

//import jakarta.persistence.*;

import java.util.Date;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;

//@Table(name="place_order")

@Entity
@Table(name = "place_order_now", schema = "public")
public class PlaceOrder {
	@Id
	private int product_Id;
	private String product_Name;
	private int quantity;
	private String delivery_Address;
	private String customerName;
	
	//@Temporal(TemporalType.TIMESTAMP)
  //  private Date currentDate1;
	//private LocalDate currentDate1= LocalDate.now();
	
	private String currentDate1;
	
	public int getProductId() {
		return product_Id;
	}
	public void setProductId(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProductName() {
		return product_Name;
	}
	public void setProductName(String product_Name) {
		this.product_Name = product_Name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDeliveryAddress() {
		return delivery_Address;
	}
	public void setDeliveryAddress(String delivery_Address) {
		this.delivery_Address = delivery_Address;
	}
	
	
	
	
public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
public String getCurrentDate() {
		return currentDate1;
	}
	public void setCurrentDate(String currentDate1) {
		this.currentDate1 = currentDate1;
	}
	//	public LocalDate getCurrentDate() {
//		return currentDate1;
//	}
//	public void setCurrentDate(LocalDate currentDate1) {
//		this.currentDate1 = currentDate1;
//	}
	@Override
	public String toString() {
		return "PlaceOrder [product_Id=" + product_Id + ", product_Name=" + product_Name + ", quantity=" + quantity
				+ ", delivery_Address=" + delivery_Address + ", currentDate1=" + currentDate1 + ",customerName"+customerName +"]";
	}
	
	
	

}
