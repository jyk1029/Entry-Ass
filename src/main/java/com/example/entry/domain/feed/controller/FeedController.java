package com.example.entry.domain.feed.controller;

import com.example.entry.domain.feed.controller.dto.request.NoticeFeedRequest;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticefeed(@RequestBody @Valid NoticeFeedRequest noticeFeedRequest) {
        noticeFeedService.execute(noticeFeedRequest);
    }
}
