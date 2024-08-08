package com.example.SpringSecurityStudy.domain;

import lombok.RequiredArgsConstructor;


public enum Gender {
    MAN("남자"),
    WOMAN("여자");

    Gender(String description) {}

    // 이렇게하면 생성자 위에 private final String description 이 있는것과 같음
    // 아니면 private final String description + @RequiredArgsConstructor
}
