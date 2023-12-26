package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart 
{       @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String title;
	    private String price;
	    private String category;
	    private String description;
	    private String image;
	    private Integer quantity;
	    private Integer count;
	    private Float rate;
	    
	    @ManyToOne
	    private Register register;

		public Cart(Integer id, String title, String price, String category, String description, String image,
				Integer quantity, Integer count, Float rate, Register register) {
			super();
			this.id = id;
			this.title = title;
			this.price = price;
			this.category = category;
			this.description = description;
			this.image = image;
			this.quantity = quantity;
			this.count = count;
			this.rate = rate;
			this.register = register;
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

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Float getRate() {
			return rate;
		}

		public void setRate(Float rate) {
			this.rate = rate;
		}

		public Register getRegister() {
			return register;
		}

		public void setRegister(Register register) {
			this.register = register;
		}

		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}
}

	   