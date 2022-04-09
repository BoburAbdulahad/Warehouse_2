package uz.bob.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bob.warehouse.entity.Attachment;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Measurement;
import uz.bob.warehouse.entity.Product;
import uz.bob.warehouse.payload.ProductDto;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.repository.AttachmentRepository;
import uz.bob.warehouse.repository.CategoryRepository;
import uz.bob.warehouse.repository.MeasurementRepository;
import uz.bob.warehouse.repository.ProductRepository;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    public Result addProduct(ProductDto productDto){
        boolean existsByNameAndCategoryId = productRepository.existsByNameAndCategoryId(productDto.getName(), productDto.getCategoryId());
        if (existsByNameAndCategoryId)
            return new Result("This product name and type category id already exist!",false);
        Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
        if (!optionalCategory.isPresent())
            return new Result("Category not founded",false);
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(productDto.getPhotoId());
        if (!optionalAttachment.isPresent())
            return new Result("Photo not founded!",false);
        Optional<Measurement> optionalMeasurement = measurementRepository.findById(productDto.getMeasurementId());
        if (!optionalMeasurement.isPresent())
            return new Result("Measurement not founded",false);

        Product product=new Product();
        product.setName(productDto.getName());
        product.setCategory(optionalCategory.get());
        product.setPhoto(optionalAttachment.get());
        product.setCode("1");//todo generation method or any logic
        product.setMeasurement(optionalMeasurement.get());
        productRepository.save(product);
        return new Result("Product successfully saved",true);
    }
}
