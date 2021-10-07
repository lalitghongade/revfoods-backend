package com.app.revfoodsbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int customerTableId;
	
	private int customerTableNumber;
	
	private boolean customerTableStatus;
}