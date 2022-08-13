package com.example.entry.domain.feed.controller.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class UpdateFeedRequest {

    @NotNull(message = "title은 Null이 될 수 없으며 최대 20자입니다.")
    @Size(max = 20)
    private String title;

    @NotNull(message = "내용는 Null이 될 수 없으며 최대 1500자까지 가능합니다.")
    @Size(max = 1000)
    private String content;
}
