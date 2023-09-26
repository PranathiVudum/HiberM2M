package com.example10.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;

@Entity
@Table(name="Product")
public class Product
{
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="pro_id")
   private int id;
   
   @Column(name="pro_name")
   private String name;
   
   @ManyToMany
   @JoinTable(name="pro_name",joinColumns=@JoinColumn(name="pro_id"),
   inverseJoinColumns=@JoinColumn(name="cast_id"))
   private Set<Cast> cast=new HashSet<Cast>();

public Product(int id, String name, Set<Cast> cast) {
	super();
	this.id = id;
	this.name = name;
	this.cast = cast;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Cast> getCast() {
	return cast;
}

public void setCast(Set<Cast> cast) {
	this.cast = cast;
}

}

