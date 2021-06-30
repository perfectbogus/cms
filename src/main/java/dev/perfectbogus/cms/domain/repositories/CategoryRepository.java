package dev.perfectbogus.cms.domain.repositories;

import dev.perfectbogus.cms.domain.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
