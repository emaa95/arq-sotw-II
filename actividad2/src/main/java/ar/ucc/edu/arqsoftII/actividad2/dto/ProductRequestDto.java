package ar.ucc.edu.arqsoftII.actividad2.dto;


import ar.ucc.edu.arqsoftII.common.dto.DtoEntity;

public class ProductRequestDto implements DtoEntity {

	private String name;
	private Double unitPrice;

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
