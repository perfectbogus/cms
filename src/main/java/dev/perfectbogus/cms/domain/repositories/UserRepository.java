package dev.perfectbogus.cms.domain.repositories;

import dev.perfectbogus.cms.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
