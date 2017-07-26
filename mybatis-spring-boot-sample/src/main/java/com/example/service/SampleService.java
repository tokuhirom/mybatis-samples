package com.example.service;

import com.example.entity.Blog;
import com.example.mapper.BlogMapper;
import org.springframework.stereotype.Component;

@Component
public class SampleService {
    private final BlogMapper blogMapper;

    public SampleService(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    public void run() throws Exception {
        Blog blog = new Blog();
        blog.setTitle("Hey");
        blogMapper.insert(blog);

        Blog byId = blogMapper.findById(blog.getId());
        System.out.println(byId);
    }
}
