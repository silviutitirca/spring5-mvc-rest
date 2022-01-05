package guru.springframework.repositories;

import guru.springframework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Silviu_Titirca on 12/27/2021
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
