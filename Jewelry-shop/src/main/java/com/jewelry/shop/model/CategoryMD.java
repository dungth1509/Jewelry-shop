package com.jewelry.shop.model;

import javax.persistence.Entity;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMD {
	
	private Long categoryId;
	private String name;
	private Boolean isCheck=false;
}
