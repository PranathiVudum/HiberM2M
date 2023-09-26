package com.example10.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cast")
public class Cast 
{
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="cast_id")
	   private int id;
	   
	   @Column(name="cast_name")
	   private String castName;
	   
	   @ManyToMany(mappedBy="cast")
	   private Set<Product> Product=new HashSet<Product>();

	public Cast(int id, String castName, Set<com.example10.model.Product> product) {
		super();
		this.id = id;
		this.castName = castName;
		Product = product;
	}

	public Cast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCastName() {
		return castName;
	}

	public void setCastName(String castName) {
		this.castName = castName;
	}

	public Set<Product> getProduct() {
		return Product;
	}

	public void setProduct(Set<Product> product) {
		Product = product;
	}

	
	   
}

