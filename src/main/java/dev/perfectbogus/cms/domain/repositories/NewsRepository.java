package dev.perfectbogus.cms.domain.repositories;

import dev.perfectbogus.cms.domain.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<News, String> {
}
