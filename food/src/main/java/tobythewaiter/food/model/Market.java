package tobythewaiter.food.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "markets")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
