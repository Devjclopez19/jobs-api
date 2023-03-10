package app.api.joblisting.repositories;

import app.api.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {
}
