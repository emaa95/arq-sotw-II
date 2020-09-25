package ar.ucc.edu.arqsoftII.actividad2.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.ucc.edu.arqsoftII.common.model.GenericObject;


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
	
	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "State")
	private State state; 
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
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
