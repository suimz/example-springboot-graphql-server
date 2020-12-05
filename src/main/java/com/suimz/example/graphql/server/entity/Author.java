package com.suimz.example.graphql.server.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Author {
    private String name;
    private Integer age;
}