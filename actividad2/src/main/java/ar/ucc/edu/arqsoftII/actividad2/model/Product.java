package ar.ucc.edu.arqsoftII.actividad2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.ucc.edu.arqsoftII.common.model.GenericObject;

@Entity
@Table(name="PRODUCT")
public class Product extends GenericObject{
	
	@NotNull
	@Size(min=1 , max = 50)
	@Column(name = "NAME")
	private String name; 
	
	@NotNull
	@Column(name = "UNIT_PRICE")
	private Double unitPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	} 
	
	

}
