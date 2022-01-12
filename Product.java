package study.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Product_rating_tbl")
public class Product {

	@Id
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_rating")
	private int productRating;

	public Product() {

	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

	public Product(String productName, int productRating) {
		
		this.productName = productName;
		this.productRating = productRating;
	}

	
	
}
