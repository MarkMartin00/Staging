package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Entity @SuperBuilder @NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor @Table(name="SoldItems")
@EqualsAndHashCode(onlyExplicitlyIncluded = true) @Getter @Setter @Accessors(chain = true, fluent = true)
@ToString(includeFieldNames = false)
public class Items {

	@Id @GeneratedValue @NonNull @Column(name="id") @Setter(AccessLevel.PRIVATE) @ToString.Exclude
	private Long id;
	
	@EqualsAndHashCode.Include @Column(name="item_name") @Setter(AccessLevel.PRIVATE) @NonNull 
	private String name;
	
	@Column(name="price") @Setter(AccessLevel.PRIVATE) @NonNull
	private int monies;
	
	@Column(name="descrption") @Setter(AccessLevel.PRIVATE)
	private String description;
	
	//example of chained accessors
	//	Items item = new Items();
	//	item.id(1).name("Boxes").monies(40).description("Moving Package")
	
	
}
