package com.example.mapper;

import com.example.entity.Blog;

public interface BlogMapper {
    Blog findById(long id);

    void insert(Blog blog);
}