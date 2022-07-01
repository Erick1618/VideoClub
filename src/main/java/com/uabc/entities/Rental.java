package com.uabc.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "rental")
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private Integer rental_id;
	
	@Column(name = "staff_id")
	private Integer staff_id;
	
	@Column(name="return_date")
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp return_date;
	
	@Column(name="rental_date")
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp rental_date;
	
	@Column(name="last_update")
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp last_update;
	
	@Column(name = "inventory_id")
	private Integer inventory_id;
	
	@Column(name = "customer_id")
	private Integer customer_id;

	public Integer getRental_id() {
		return rental_id;
	}

	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public java.sql.Timestamp getReturn_date() {
		return return_date;
	}

	public void setReturn_date(java.sql.Timestamp return_date) {
		this.return_date = return_date;
	}

	public java.sql.Timestamp getRental_date() {
		return rental_date;
	}

	public void setRental_date(java.sql.Timestamp rental_date) {
		this.rental_date = rental_date;
	}

	public java.sql.Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(java.sql.Timestamp last_update) {
		this.last_update = last_update;
	}

	public Integer getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Rental(Integer rental_id, Integer staff_id, Timestamp return_date, Timestamp rental_date,
			Timestamp last_update, Integer inventory_id, Integer customer_id) {
		super();
		this.rental_id = rental_id;
		this.staff_id = staff_id;
		this.return_date = return_date;
		this.rental_date = rental_date;
		this.last_update = last_update;
		this.inventory_id = inventory_id;
		this.customer_id = customer_id;
	}

	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
