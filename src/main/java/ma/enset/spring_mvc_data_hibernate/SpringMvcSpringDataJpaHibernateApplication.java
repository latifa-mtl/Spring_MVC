package ma.enset.spring_mvc_data_hibernate;

import ma.enset.spring_mvc_data_hibernate.entities.Product;
import ma.enset.spring_mvc_data_hibernate.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMvcSpringDataJpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcSpringDataJpaHibernateApplication.class, args);
    }


    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                            .name("Computer")
                            .price(20000)
                            .quantity(12)
                            .build());
            productRepository.save(Product.builder()
                    .name("Phone")
                    .price(11000)
                    .quantity(22)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart TV")
                    .price(25000)
                    .quantity(8)
                    .build());
            productRepository.save(Product.builder()
                    .name("iPad")
                    .price(7000)
                    .quantity(30)
                    .build());
            productRepository.findAll().forEach(product -> System.out.println(product.toString()));
        };
    }
}
