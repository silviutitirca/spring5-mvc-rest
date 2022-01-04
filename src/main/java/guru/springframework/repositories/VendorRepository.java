package guru.springframework.repositories;

import guru.springframework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Silviu_Titirca on 1/4/2022
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
