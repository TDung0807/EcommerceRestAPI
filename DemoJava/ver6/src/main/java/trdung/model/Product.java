package trdung.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="brand")
	private String brand;
	@Column(name="color")
	private String color;
	@Column(name="image")
	private String image;
	@Column(name="price")
	private double price;
	public Product() {
	}
	public Product(int id, String name, String brand, String color, String image, double price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.image = image;
		this.price = price;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", color=" + color + ", image=" + image
				+ ", price=" + price + "]";
	}
	
}
