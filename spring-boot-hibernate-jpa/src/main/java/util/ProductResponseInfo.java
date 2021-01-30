package util;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductResponseInfo {
	private static final Logger logger = LoggerFactory.getLogger(ProductResponseInfo.class);

	private String status;
	private List<Product> products = new ArrayList<>();

	public ProductResponseInfo(String status, List<Product> products) {
		super();
		this.status = status;
		this.products.addAll(products);
	}
	
	public ProductResponseInfo(String status) {
		super();
		this.status = status;
	}

	public ProductResponseInfo(String status, Product product) {
		super();
		this.status = status;
		this.products.add(product);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
