package tobythewaiter.food.model;

import lombok.Data;

@Data
public class MenuCategory {
    private Integer id;
    private String name;
    private Market market;
    private MenuCategory subCategory;
}
