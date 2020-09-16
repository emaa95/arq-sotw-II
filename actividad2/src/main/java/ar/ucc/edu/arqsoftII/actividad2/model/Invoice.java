package ar.ucc.edu.arqsoftII.actividad2.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="INVOICE")

public class Invoice extends GenericObject{
	
	@NotNull
	@Column(name="DATE")
	private Date date;
	
	@NotNull
	@Column(name="NUMBER")
	private Long number;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user; 
	
	@NotNull
	@Column(name="TOTAL")
	private Double total; 
	
	@OneToMany(targetEntity=Invoice.class, mappedBy="invoice", fetch = FetchType.LAZY)
	private Set<Detail> detail;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Set<Detail> getDetail() {
		return detail;
	}
	public void setDetail(Set<Detail> detail) {
		this.detail = detail;
	} 
	
	
	
	
	
	

}
