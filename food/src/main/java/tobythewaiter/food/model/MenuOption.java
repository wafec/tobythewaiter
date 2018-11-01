package tobythewaiter.food.model;

import lombok.Data;

@Data
public class MenuOption {
    private Integer id;
    private String name;
    private String description;
    private MenuCategory category;
}
