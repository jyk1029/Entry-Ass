package com.example.entry.domain.feed.controller;

import com.example.entry.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.entry.domain.feed.facade.DeleteFeedService;
import com.example.entry.domain.feed.service.NoticeFeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/feed")
@RestController
public class FeedController {

    private final NoticeFeedService noticeFeedService;
    private final DeleteFeedService deleteFeedService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticeFeed(@RequestBody @Valid NoticeFeedRequest noticeFeedRequest) {
        noticeFeedService.execute(noticeFeedRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{feed-id}")
    public void deleteFeed(@PathVariable("feed-id") Integer feedId) {
        deleteFeedService.execute(feedId);
    }
}
