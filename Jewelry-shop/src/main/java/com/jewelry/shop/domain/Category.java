package com.jewelry.shop.domain;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Categorys")
public class Category {
	
	@Primary
	@Column()
	private Long categoryId;
	private String name;
}
