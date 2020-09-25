package ar.ucc.edu.arqsoftII.actividad1.model;


import ar.ucc.edu.arqsoftII.common.model.GenericObject;

import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="CUSTOMER")

public class Customer extends GenericObject {
	
	@NotNull
	@Size(min=1 , max = 50)
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Size(min=1 , max = 50)
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@NotNull
	@Column(name = "DNI")
	private Long dni;
	

	@NotNull
	@Column(name = "TELEPHONE")
	private Long telephone; 
	
	@OneToMany(targetEntity=Customer.class, mappedBy="customer", fetch = FetchType.LAZY)
	private Set<Payment> payment;
	
	private State state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Set<Payment> getPayment() {
		return payment;
	}

	public void setPayment(Set<Payment> payment) {
		this.payment = payment;
	} 
	
	
	
	
}