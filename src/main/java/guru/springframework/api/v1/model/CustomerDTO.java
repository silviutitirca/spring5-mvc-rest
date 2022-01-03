package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Silviu_Titirca on 12/27/2021
 */
@Data
public class CustomerDTO {

    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;

}
