package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Silviu_Titirca on 12/27/2021
 */
@Data
public class CustomerDTO {

    @ApiModelProperty(value = "This is the first name", required = true)
    private String firstName;

    @ApiModelProperty(value = "This is the last name", required = true)
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;

}
