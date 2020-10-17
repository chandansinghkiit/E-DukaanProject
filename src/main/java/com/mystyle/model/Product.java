package com.mystyle.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "category_id" , nullable=false)
	private ProductCategory category;
	
	@Column
	private String sku;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private BigDecimal unitPrice;
	
	@Column
	private String imageUrl;
	
	@Column
	private boolean active;
	@Column
	@CreationTimestamp
	private Date dateCreated;
	@Column
	@UpdateTimestamp
	private Date lastUpdated;

}
