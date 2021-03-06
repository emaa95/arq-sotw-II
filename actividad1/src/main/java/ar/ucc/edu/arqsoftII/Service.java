package ar.ucc.edu.arqsoftII;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "SERVICE")
public class Service extends GenericObject{
	
	@NotNull
	@Size(min=1 , max = 50)
	@Column(name = "NAME")
	private String name;
	
	

}
