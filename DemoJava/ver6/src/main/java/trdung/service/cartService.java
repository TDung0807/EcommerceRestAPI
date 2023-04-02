package trdung.service;

import java.util.Collection;

import trdung.model.cartItem;

public interface cartService {

	double getAmount();

	void clear();

	cartItem update(int id, int qty);

	void remove(int id);

	void add(cartItem item);

	Collection<cartItem> getAllItems();
	int size();


}
