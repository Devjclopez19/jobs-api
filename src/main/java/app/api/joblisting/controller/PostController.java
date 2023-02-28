package app.api.joblisting.controller;

import app.api.joblisting.model.Post;
import app.api.joblisting.services.PostService;
import app.api.joblisting.services.SearchService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private SearchService searchService;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<List<Post>>(postService.allPosts(), HttpStatus.OK);
    }

    @GetMapping("/posts/{text}")
    public List<Post> searchPost(@PathVariable String text) {
        return searchService.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postService.post(post);
    }
}
