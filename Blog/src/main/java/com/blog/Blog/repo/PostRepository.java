package com.blog.Blog.repo;

import com.blog.Blog.Models.Posty;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posty, Long> {
}
