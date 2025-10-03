package com.Projekt.dashboard.controller;

import com.Projekt.dashboard.modal.Post;
import com.Projekt.dashboard.service.PostService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService service;
    public PostController(PostService service) { this.service = service; }

    @GetMapping public List<Post> all() { return service.findAll(); }
    @GetMapping("/{id}") public Post one(@PathVariable Long id) { return service.findById(id); }
    @PostMapping public Post create(@RequestBody Post post) { return service.create(post); }
    @PutMapping("/{id}") public Post update(@PathVariable Long id, @RequestBody Post post) { return service.update(id, post); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
