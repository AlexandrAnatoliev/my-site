package ru.project_euler.my_site.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project_euler.my_site.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
