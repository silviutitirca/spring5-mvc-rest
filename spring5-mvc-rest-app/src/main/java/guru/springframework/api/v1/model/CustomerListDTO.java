package guru.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Silviu_Titirca on 12/27/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {

    List<CustomerDTO> customers;
}
