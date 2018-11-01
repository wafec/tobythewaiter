package tobythewaiter.food.model;

import lombok.Data;

@Data
public class MarketIngredient {
    private Integer id;
    private String name;
    private Market market;
}
