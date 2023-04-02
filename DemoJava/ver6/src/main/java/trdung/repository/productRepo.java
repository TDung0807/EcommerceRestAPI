package trdung.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import trdung.model.*;

public interface productRepo extends JpaRepository<Product,Integer> {

}
