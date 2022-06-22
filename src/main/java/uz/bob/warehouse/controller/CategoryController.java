package uz.bob.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.payload.CategoryDto;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public Result addCategoryController(@RequestBody CategoryDto categoryDto){
        Result result = categoryService.addCategoryService(categoryDto);
        return result;
    }
}
