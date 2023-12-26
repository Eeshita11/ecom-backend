package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItems 
{
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String title;
	    private String price;
	    private String category;
	    private String description;
	    
		public OrderItems(Integer id, String title, String price, String category, String description) {
			super();
			this.id = id;
			this.title = title;
			this.price = price;
			this.category = category;
			this.description = description;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public OrderItems() {
			super();
			// TODO Auto-generated constructor stub
		}
}
