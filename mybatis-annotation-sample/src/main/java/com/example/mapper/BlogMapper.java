package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Blog;

@Mapper
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE id = #{id}")
    Blog findById(long id);

    @Insert("INSERT INTO blog (title) VALUES (#{title})")
    @Options(useGeneratedKeys = true)
    void insert(Blog blog);
}
