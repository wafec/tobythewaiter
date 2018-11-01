package tobythewaiter.food.model;

import lombok.Data;

@Data
public class MenuIngredient {
    private Integer id;
    private MenuOption option;
    private MarketIngredient ingredient;
    private Integer quantity;
}
