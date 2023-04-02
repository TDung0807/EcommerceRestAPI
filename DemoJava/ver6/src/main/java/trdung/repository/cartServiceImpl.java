package trdung.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import trdung.model.cartItem;
import trdung.service.cartService;

@SessionScope
@Service
public class cartServiceImpl implements cartService {
	Map<Integer, cartItem> maps= new HashMap<>();
	@Override
	public void add(cartItem item) {
		cartItem cartItem = maps.get(item.getPrdid());
		if(cartItem==null) {
			maps.put(item.getPrdid(), item);
		}
		else {
			cartItem.setQty(cartItem.getQty()+1);
		}
	}
	@Override
	public void remove(int id) {
		maps.remove(id);
	}
	@Override
	public cartItem update(int id, int qty) {
		cartItem cartItem = maps.get(id);
		cartItem.setQty(qty);
		return cartItem;
	}
	@Override
	public void clear() {
		maps.clear();
	}
	@Override
	public Collection<cartItem> getAllItems(){
		return maps.values();
	}
	@Override
	public double getAmount() {
		return maps.values().stream().mapToDouble(item -> item.getQty()*item.getPrice()).sum();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return maps.size();
	}
}
