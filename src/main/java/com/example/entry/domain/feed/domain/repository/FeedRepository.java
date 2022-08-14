package com.example.entry.domain.feed.domain.repository;

import com.example.entry.domain.feed.domain.Feed;
import org.springframework.data.repository.CrudRepository;

public interface FeedRepository extends CrudRepository<Feed, Integer> {
}
