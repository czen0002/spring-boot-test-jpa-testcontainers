package io.czen.testjpatestcontainers.repository;

import io.czen.testjpatestcontainers.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
