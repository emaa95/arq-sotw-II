package ar.ucc.edu.arqsoftII.actividad1.model;


import ar.ucc.edu.arqsoftII.common.model.GenericObject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PAYMENT")

public class Payment extends GenericObject {
	
	@NotNull
	@Column(name = "AMOUNT")
	private Double amount; 
	
	@NotNull
	@Column(name="DATE")
	private Date date; 
	
	@OneToOne   
	@JoinColumn(name = "SERVICE_ID")
	private Service service; 
	
	@OneToOne 
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer; 
	
	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "State")
	private State state;
	
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	} 
	
	
	
}
