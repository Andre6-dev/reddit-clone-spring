package com.blogapp.redditclonespring.repositories;

import com.blogapp.redditclonespring.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}