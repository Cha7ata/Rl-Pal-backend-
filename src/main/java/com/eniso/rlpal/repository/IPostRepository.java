package com.eniso.rlpal.repository;

import com.eniso.rlpal.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends JpaRepository<Post,Integer> {
}
