package com.example.test.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_propinsi")
public class Propinsi {
	
	private int idPropinsi;
	private String namaPropinsi;
	
	public Propinsi() {
		
	}

	public Propinsi(int idPropinsi, String namaPropinsi) {
		super();
		this.idPropinsi = idPropinsi;
		this.namaPropinsi = namaPropinsi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdPropinsi() {
		return idPropinsi;
	}

	public void setIdPropinsi(int idPropinsi) {
		this.idPropinsi = idPropinsi;
	}

	public String getNamaPropinsi() {
		return namaPropinsi;
	}

	public void setNamaPropinsi(String namaPropinsi) {
		this.namaPropinsi = namaPropinsi;
	}
	
	

}
