package com.example.shareit.model;

import com.example.shareit.exceptions.SpringShareitException;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1),
    DOWNVOTE(-1);

    private Integer direction;

    VoteType(int i) {
    }

    public static VoteType lookup(Integer direction) {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringShareitException("Vote not found"));
    }

    public Integer getDirection() {
        return direction;
    }
}
