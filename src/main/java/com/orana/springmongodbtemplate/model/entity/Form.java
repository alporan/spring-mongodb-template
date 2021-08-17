package com.orana.springmongodbtemplate.model.entity;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "forms")
public class Form {
	@Id
	private String id;

	private Long formNo;
	private String explanation;
	private Map<Product, Integer> productCounts;
	private Date dateTime;
	private User createdBy;
	private User approvedBy;
}