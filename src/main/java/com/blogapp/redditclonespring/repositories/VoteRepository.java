package com.blogapp.redditclonespring.repositories;

import com.blogapp.redditclonespring.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}