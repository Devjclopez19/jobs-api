package app.api.joblisting.services;

import app.api.joblisting.model.Post;
import app.api.joblisting.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    public PostRepository postRepository;

    public List<Post> allPosts() {
        return postRepository.findAll();
    }

    public Post post(Post newPost) {
        return postRepository.insert(newPost);
    }
}
