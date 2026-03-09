package ma.enset.spring_mvc_data_hibernate.repository;

import ma.enset.spring_mvc_data_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 **/
public interface ProductRepository extends JpaRepository<Product,Long> {
}
