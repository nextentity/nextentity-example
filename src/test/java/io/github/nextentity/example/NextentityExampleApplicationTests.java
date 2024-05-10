package io.github.nextentity.example;

import io.github.nextentity.api.Repository;
import io.github.nextentity.example.entity.Article;
import io.github.nextentity.example.entity.Author;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NextentityExampleApplicationTests {

    @Autowired
    Repository<Integer, Article> articleRepository;
    @Autowired
    Repository<Integer, Author> authorRepository;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(articleRepository);
        Assertions.assertNotNull(authorRepository);
    }

}
