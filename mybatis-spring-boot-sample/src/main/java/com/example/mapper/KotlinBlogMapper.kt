package com.example.mapper

import com.example.entity.Blog

interface KotlinBlogMapper {
    fun findById(id: Long): List<Blog>
}