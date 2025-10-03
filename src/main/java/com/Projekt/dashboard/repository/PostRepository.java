package com.Projekt.dashboard.repository;

import com.Projekt.dashboard.modal.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> { }
