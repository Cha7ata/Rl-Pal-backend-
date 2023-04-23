package com.eniso.rlpal.repository;

import com.eniso.rlpal.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessageRepository extends JpaRepository<Message,Integer> {
}
