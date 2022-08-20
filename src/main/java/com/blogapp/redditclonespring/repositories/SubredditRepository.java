package com.blogapp.redditclonespring.repositories;

import com.blogapp.redditclonespring.models.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}