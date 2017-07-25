package com.example;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.Blog;
import com.example.mapper.BlogMapper;

public class SampleApp {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);

            // insert it
            Long id = insert(blogMapper);

            // find it
            {
                Blog blog = blogMapper.findById(id);
                System.out.println(blog);
            }
        }
    }

    private static Long insert(BlogMapper blogMapper) {
        Blog blog = new Blog();
        blog.setTitle("404 Blog Not Found");
        blogMapper.insert(blog);
        System.out.println(blog);
        return blog.getId();
    }
}
