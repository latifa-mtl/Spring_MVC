package ma.enset.spring_mvc_data_hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * @author admin
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {

    @Id @GeneratedValue
    private Long Id;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @Min(0)
    private double price;

    @Min(1)
    private double quantity;
}
