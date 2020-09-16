package ar.ucc.edu.arqsoftII.actividad2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="DETAIL")
public class Detail extends GenericObject{
	
	@NotNull
	@Column(name="QUANTITY")
	private Long quantity; 
	
	@NotNull
	@Column(name="AMOUNT")
	private Double amount;
	
	@OneToOne   
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
}
