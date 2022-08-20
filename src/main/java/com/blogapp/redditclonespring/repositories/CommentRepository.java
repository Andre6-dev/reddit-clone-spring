package com.blogapp.redditclonespring.repositories;

import com.blogapp.redditclonespring.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}