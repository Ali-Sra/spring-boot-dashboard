package com.Projekt.dashboard.service;

import com.Projekt.dashboard.modal.Post;
import com.Projekt.dashboard.repository.PostRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {
    private final PostRepository repo;
    public PostService(PostRepository repo) { this.repo = repo; }

    public List<Post> findAll() { return repo.findAll(); }
    public Post findById(Long id) { return repo.findById(id).orElse(null); }
    public Post create(Post post) { return repo.save(post); }
    public Post update(Long id, Post post) { post.setId(id); return repo.save(post); }
    public void delete(Long id) { repo.deleteById(id); }
}
