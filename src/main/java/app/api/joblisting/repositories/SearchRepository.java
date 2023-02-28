package app.api.joblisting.repositories;

import app.api.joblisting.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchRepository {
    List<Post> findByText(String text);
}
