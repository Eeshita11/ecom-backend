package com.example.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Register 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer reg_id;
	    private String file;
	    private String gender;
	    private String date;
	    private String description;
	    private String occupation;
	    private String areaofinterest;
	    private String name;
	    private String email;
	    private String phonenumber;

	    private String password;
	    @OneToMany(targetEntity = Cart.class,cascade = CascadeType.ALL,fetch= FetchType.LAZY)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "reg_id")

	    private List<Cart> cartitems;
	    
		public Register(Integer reg_id, String file, String gender, String date, String description, String occupation,
				String areaofinterest, String name, String email, String phonenumber, String password,
				List<Cart> cartitems) {
			super();
			this.reg_id = reg_id;
			this.file = file;
			this.gender = gender;
			this.date = date;
			this.description = description;
			this.occupation = occupation;
			this.areaofinterest = areaofinterest;
			this.name = name;
			this.email = email;
			this.phonenumber = phonenumber;
			this.password = password;
			this.cartitems = cartitems;
		}

		public Integer getReg_id() {
			return reg_id;
		}

		public void setReg_id(Integer reg_id) {
			this.reg_id = reg_id;
		}

		public String getFile() {
			return file;
		}

		public void setFile(String file) {
			this.file = file;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getAreaofinterest() {
			return areaofinterest;
		}

		public void setAreaofinterest(String areaofinterest) {
			this.areaofinterest = areaofinterest;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Cart> getCartitems() {
			return cartitems;
		}

		public void setCartitems(List<Cart> cartitems) {
			this.cartitems = cartitems;
		}

		public Register() {
			super();
			// TODO Auto-generated constructor stub
		}
}
