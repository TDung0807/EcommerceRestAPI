package trdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trdung.model.cart;

public interface cartRepo extends JpaRepository<cart,Integer> {

}
