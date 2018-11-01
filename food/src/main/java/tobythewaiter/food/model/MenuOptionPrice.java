package tobythewaiter.food.model;

import lombok.Data;

@Data
public class MenuOptionPrice {
    private Integer id;
    private MenuOption option;
    private MenuOptionPriceCategory category;
    private Float value;
}
