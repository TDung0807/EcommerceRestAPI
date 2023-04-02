package trdung.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public cart(int id) {
		super();
		this.id = id;
	}

	public cart() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "cart [id=" + id + "]";
	}
	
}
