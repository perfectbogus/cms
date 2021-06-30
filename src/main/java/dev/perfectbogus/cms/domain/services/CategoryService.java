package dev.perfectbogus.cms.domain.services;

import dev.perfectbogus.cms.domain.exceptions.CategoryNotFoundException;
import dev.perfectbogus.cms.domain.models.Category;
import dev.perfectbogus.cms.domain.repositories.AbstractRepository;
import dev.perfectbogus.cms.domain.repositories.CategoryRepository;
import dev.perfectbogus.cms.domain.requests.CategoryRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService extends AbstractRepository<Category> {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public Category update(Category category){
        return this.categoryRepository.save(category);
    }

    public Category create(CategoryRequest request){
        Category category = new Category();
        category.setName(request.getName());
        return this.categoryRepository.save(category);
    }

    public void delete(String id){
        final Optional<Category> category = this.categoryRepository.findById(id);
        category.ifPresent(this.categoryRepository::delete);
    }

    public List<Category> findAll(){
        return this.categoryRepository.findAll();
    }

    public Category findOne(String id){
        final Optional<Category> category = this.categoryRepository.findById(id);
        if (category.isPresent()){
            return category.get();
        } else {
            throw new CategoryNotFoundException(id);
        }
    }
}
