package uz.bob.warehouse.payload;

import lombok.Data;

@Data
public class CategoryDto {
    private String name;
    private Integer parentCategoryId;

}
