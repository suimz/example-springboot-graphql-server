package com.suimz.example.graphql.server.resolver;

import com.suimz.example.graphql.server.entity.Author;
import com.suimz.example.graphql.server.entity.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {
    // 查询所有图书
    public List<Book> books() {
        // 数据，这里应该查库
        List<Book> books = new ArrayList<>();
        Author author = Author
                .builder()
                .name("高铭")
                .age(1)
                .build();
        books.add(Book.builder().id(1).name("天才在左疯子在右").author(author).build());
        author = Author
                .builder()
                .name("麦家")
                .age(1)
                .build();
        books.add(Book.builder().id(1).name("人生海海").author(author).build());
        return books;
    }
}