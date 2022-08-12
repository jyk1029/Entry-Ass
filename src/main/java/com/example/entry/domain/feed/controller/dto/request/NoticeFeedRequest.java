package com.example.entry.domain.feed.controller.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class NoticeFeedRequest {

    @NotNull(message = "제목은 Null이 불가하며 최대 20자까지 가능합니다")
    @Size(max = 20)
    private String title;

    @NotNull(message = "내용는 Null이 불가하며 최대 1500자까지 가능합니다.")
    @Size(max = 1500)
    private String content;
}
