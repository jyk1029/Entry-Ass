package com.example.entry.domain.feed.service;

import com.example.entry.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.entry.domain.feed.domain.Feed;
import com.example.entry.domain.feed.domain.repository.FeedRepository;
import com.example.entry.domain.user.domain.User;
import com.example.entry.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class NoticeFeedService {

    private final UserFacade userFacade;
    private final FeedRepository feedRepository;

    @Transactional
    public void execute(NoticeFeedRequest noticeFeedRequest) {
        User user = userFacade.getCurrentUser();

        Feed feed = Feed.builder()
                .title(noticeFeedRequest.getTitle())
                .content(noticeFeedRequest.getContent())
                .user(user)
                .build();
        feedRepository.save(feed);
    }
}
