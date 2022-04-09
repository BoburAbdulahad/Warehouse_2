package uz.bob.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.payload.CategoryDto;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.repository.CategoryRepository;

import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Result addCategoryService(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        if (categoryDto.getParentCategoryId() != null) {
            Optional<Category> optionalParentCategory = categoryRepository.findById(categoryDto.getParentCategoryId());
            if (!optionalParentCategory.isPresent())
                return new Result("Parent category not found!", false);
            category.setParentCategory(optionalParentCategory.get());
        }
        categoryRepository.save(category);
        return new Result("Category successfully saved", true);

    }
}
