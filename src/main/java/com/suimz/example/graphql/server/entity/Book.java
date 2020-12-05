package com.suimz.example.graphql.server.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    Integer id;
    private String name;
    private String cover;
    private String intro;
    private Author author;
}