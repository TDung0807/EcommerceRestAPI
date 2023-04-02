package trdung.service;

import java.util.List;

import trdung.model.Product;

public interface productService {
	public List<Product> getAllPrd();
	public List<Product> getAllPrdContain(String key);
	public List<Product> getAllPrdByBrand(String key);
	public List<Product> getAllPrdByColor(String key);
	public Product FindByID(int id);
	public Product FindByName(String name);
}
